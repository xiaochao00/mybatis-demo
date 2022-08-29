package org.shch.mybatis.demos.demo01.test;

/**
 * @author shichao
 * @date 2022/07/24 14:28
 */

class WithInner {
    class Inner1 {
        Inner1() {
            System.out.println("instances inner1");
        }
    }

    class Inner2 {
        Inner2() {
            System.out.println("instances inner2");
        }
    }
}

public class InnerClass extends WithInner.Inner1 {

    public InnerClass(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InnerClass ii = new InnerClass(wi);
        System.out.println("END");

        String c = new StringBuilder("nishiszhui").append("123").toString();
        System.out.println(c.intern()==c);
        String d = new StringBuilder("nishiszhui").append(123).toString();
        System.out.println(d.intern()==d);
    }
}
