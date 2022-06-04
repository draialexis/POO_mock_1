package com.alexisdrai.ex2;

public class A {
    private int a;

    A(int v) {
        a = v;
    }

    public int foo(A other) {
        return a + other.a;
    }
}
