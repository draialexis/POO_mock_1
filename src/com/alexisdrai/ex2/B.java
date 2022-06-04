package com.alexisdrai.ex2;

public class B extends A {
    B(int v) {
        super(v);
    }

    //@Override
    public int foo(B other) {
        return 42;
    }
}
