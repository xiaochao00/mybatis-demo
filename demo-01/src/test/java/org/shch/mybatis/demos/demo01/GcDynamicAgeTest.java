package org.shch.mybatis.demos.demo01;

/**
 * GC 动态年龄 测试
 * -XX:+UseConcMarkSweepGC -XX:+CMSIncrementalMode -Xmx20M -Xms20M -Xmn10M -XX:+PrintGC -XX:PrintGCDetails -XX:MaxTenuringThreshold=15 -XX:PrintTenuringDistribution -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=10485760
 *
 * @author shichao
 * @date 2022/09/04 14:37
 */
public class GcDynamicAgeTest {
    private static final int _1M = 1024 * 1024;

    public static void main(String[] args) {
        byte[] a1, a2, a3, a4;
        a1 = new byte[_1M / 4];
        a2 = new byte[_1M / 2];
        // System.gc();
        // a3 = new byte[_1M * 4];
        a4 = new byte[_1M * 7];
        // a4 = null;
        // a4 = new byte[_1M * 4];
    }

}
