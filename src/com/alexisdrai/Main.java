package com.alexisdrai;

public class Main {

    public static void main(String[] args) {
	/*
	ex1
	    l'attribut 's' n'est pas initialisé par un constructeur,
        et il n'est pas modifiable après l'instantiation ("final")

        pour corriger l'erreur, on peut retirer le mot-clé "final"
        (déclarer simplement "private int s") ou inclure l'initialisation
        de 's' dans le constructeur

	ex2
        la classe B redéfinit la méthode foo(), mais ce n'est pas une redéfinition
        correcte : une redéfinition utilise la même signature, strictement

	ex3
	    q1
	       on peut faire en sorte d'enregistrer le poids dans une seule unité
	       on peut créer des méthodes pour gérer la conversion si nécéssaire

	    q2
	       on peut utiliser des setters dans lesquels on gérera la validation des ajouts,
	       chaque objet de type Coach sera responsable de surveiller son propre état
	       et d'effectuer ou non les ajouits en fonction de ses contraintes

	 */
    }
}
