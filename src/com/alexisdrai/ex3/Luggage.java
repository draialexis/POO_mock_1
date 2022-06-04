package com.alexisdrai.ex3;

public class Luggage {
    private final        double weight;
    private final static double LB_TO_KG_RATIO = 2.205;

    private Luggage(double weight) {
        this.weight = weight;
    }

    public static Luggage makeLuggageKG(double weight) {
        return new Luggage(weight);
    }

    public static Luggage makeLuggageLB(double weight) {
        return new Luggage(weight / LB_TO_KG_RATIO);
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "\t\tLuggage{" +
               "weight=" + weight +
               '}';
    }
}
