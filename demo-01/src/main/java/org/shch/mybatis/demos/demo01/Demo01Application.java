package org.shch.mybatis.demos.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.IntToDoubleFunction;

/**
 * demo application
 *
 * @author shichao
 * @since 1.0.0
 * 2021/9/26 23:05
 */
@SpringBootApplication
public class Demo01Application {
    public static void main(String[] args) {
        System.out.println("Begin app...");
        SpringApplication.run(Demo01Application.class, args);
        IntToDoubleFunction f= i->i;
        System.out.println("End app...");
    }
}
