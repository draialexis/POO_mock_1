package com.alexisdrai.ex3;

import java.util.ArrayList;
import java.util.List;

public class Coach {
    private final int             maxPassengers;
    private final double          maxWeight;
    private final List<Passenger> passengers = new ArrayList<>();

    private int    currentNbOfPassengers;
    private double currentWeight;

    public Coach(int maxPassengers, double maxWeight) {
        this.maxPassengers = maxPassengers;
        this.maxWeight = maxWeight;
        this.currentNbOfPassengers = 0;
        this.currentWeight = 0;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public int getCurrentNbOfPassengers() {
        return currentNbOfPassengers;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void addToCurrentWeight(double weight) {
        this.currentWeight += weight;
    }

    public void addToCurrentNbOfPassenger(int nb) {
        this.currentNbOfPassengers += nb;
    }

    public List<Passenger> getPassengers() {
        // TODO make this return an immutable list in order to preserve encapsulation
        return passengers;
    }

    public void addPassenger(Passenger passenger) {
        if (this.getCurrentNbOfPassengers() + 1 <= this.getMaxPassengers()
            && this.getCurrentWeight() + passenger.getTotalWeight() <= this.getMaxWeight())
        {
            this.passengers.add(passenger);
            this.addToCurrentWeight(passenger.getTotalWeight());
            this.addToCurrentNbOfPassenger(1);
        }
        else {
            // TODO more informative error messages etc.
            System.out.println("~~~~~~~~~~~~limit has been reached!~~~~~~~~~~~~");
        }
    }

    @Override
    public String toString() {
        return "Coach{" +
               "maxPassengers=" + maxPassengers +
               ", maxWeight=" + maxWeight +
               ", passengers=\n" + passengers +
               ",\n currentNbOfPassengers=" + currentNbOfPassengers +
               ", currentWeight=" + currentWeight +
               '}';
    }
}
