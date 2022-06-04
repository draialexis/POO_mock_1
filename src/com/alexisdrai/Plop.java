package com.alexisdrai;

public class Plop {
    private final String a = "a";
    private final int    r;
    //    private final int    s;
    /*
    ex1)

    l'attribut 's' n'est pas initialisé par un constructeur,
    et il n'est pas modifiable après l'instantiation ("final")

    pour corriger l'erreur, on peut retirer le mot-clé "final"
    (déclarer simplement "private int s") ou inclure l'initialisation
    de 's' dans le constructeur
     */

    public Plop(int v) {
        this.r = v;
    }
}
