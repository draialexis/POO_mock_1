package com.alexisdrai.ex2;

public class B extends A {
    B(int v) {
        super(v);
    }

    /*
    la classe B redéfinit la méthode foo(), mais ce n'est pas une redéfinition
    correcte : une redéfinition utilise la même signature, strictement
     */

    //@Override
    public int foo(B other) {
        return 42;
    }
}
