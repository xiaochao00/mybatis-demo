package org.shch.mybatis.demos.demo01;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @author shichao
 * @date 2022/08/30 0:58
 */
public class SchedulePoolTest {
    ScheduledThreadPoolExecutor executor;
    private Runnable task;

    @Before
    public void before() {
        executor = new ScheduledThreadPoolExecutor(2);
        task = initTask();
    }

    @Test
    public void testFixRate() {
        print("start fixRate main thread");
        // 15秒后 每30秒执行一次; 每一次的开始时间相对于上一次的开始时间间隔30秒
        // 当每个任务的耗时很长，大于间隔的话，那么每次任务的间隔为0
        executor.scheduleAtFixedRate(task, 15, 5, SECONDS);
        sleep(SECONDS, 60);
        print("end fixRate main thread");
        // 当主线程结束的时候，线程池会结束，说明默认创建的是守护线程
    }

    @Test
    public void testDelayTask() {
        print("start fixRate main thread");
        // 15秒后 每30秒执行一次; 每一次的开始时间相对于上一次的结束时间间隔30秒
        executor.scheduleWithFixedDelay(task, 15, 30, SECONDS);
        sleep(SECONDS, 120);
        print("end fixRate main thread");
    }


    private Runnable initTask() {
        long start = System.currentTimeMillis();
        return () -> {
            print("start task: " + getPeriod(start, System.currentTimeMillis()));
            sleep(SECONDS, 10);
            print("end task: " + getPeriod(start, System.currentTimeMillis()));
        };

    }

    private void sleep(TimeUnit unit, long time) {
        try {
            unit.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int getPeriod(long start, long end) {
        return (int) (end - start) / 1000;
    }

    private void print(String msg) {
        System.out.println(msg);
    }
}
