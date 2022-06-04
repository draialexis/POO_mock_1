package com.alexisdrai;

import com.alexisdrai.ex3.Coach;
import com.alexisdrai.ex3.Luggage;
import com.alexisdrai.ex3.Passenger;

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
	       les getters renverront des kilogrammes, et les constructeurs accepteront
	       plusieurs unités mais devront connaitre l'unité utilisée pour pouvoir
	       faire les conversions

	       comme on ne peut pas avoir deux constructeurs avec les memes signatures
	       on utilisera la Factory Method

	    q2
	       on peut utiliser des setters dans lesquels on gérera la validation des ajouts,
	       chaque objet de type Coach sera responsable de surveiller son propre état
	       et d'effectuer ou non les ajouits en fonction de ses contraintes
	    q3
	       Cf ex3/Coach.java etc.
	       and below
	 */

        Luggage l1 = Luggage.makeLuggageKG(2.5);
        Luggage l2 = Luggage.makeLuggageLB(8.82); // should become 4 kg
        Luggage l3 = Luggage.makeLuggageKG(7);
        Luggage l4 = Luggage.makeLuggageKG(3.71);
        // TOTAL WEIGHT = 17.21

        Passenger p1 = new Passenger("p1");
        Passenger p2 = new Passenger("p2");

        p1.addLuggage(l1);
        p1.addLuggage(l2);
        p1.addLuggage(l3);
        p2.addLuggage(l4);

        Coach c1 = new Coach(3, 15.0); //should fail from weight

        System.out.println("############### C1 ###############\n" + c1);
        c1.addPassenger(p1);
        System.out.println("############### C1 suite ###############\n" + c1);
        c1.addPassenger(p2);
        System.out.println("############### C1 suite ###############\n" + c1);

        Coach c2 = new Coach(1, 20.0); // should fail from passengers

        System.out.println("############### C2 ###############\n" + c2);
        c2.addPassenger(p1);
        System.out.println("############### C2 suite ###############\n" + c2);
        c2.addPassenger(p2);
        System.out.println("############### C2 suite ###############\n" + c2);

        Coach c3 = new Coach(3, 20.0); // should succeed

        System.out.println("############### C3 ###############\n" + c3);
        c3.addPassenger(p1);
        System.out.println("############### C3 suite ###############\n" + c3);
        c3.addPassenger(p2);
        System.out.println("############### C3 suite ###############\n" + c3);
    }
}
