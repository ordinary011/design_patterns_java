package com.patterns.GoF;

import java.lang.reflect.Method;

class Go1 {
    public void go1() {
        System.out.println("in go1");
    }
}

class Go2 extends Go1 {
    public void go2() {
        System.out.println("in go2");
    }
}

public class Any {
    static void demo() {
        int g = 3 + 3;
        if (g == 6) {
            return;
        }

        try {
//            throw new IllegalAccessException("demo");
            System.out.println("here");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("in finally");
        }
    }

    public static void main(String[] args) {
        demo();
    }
}
