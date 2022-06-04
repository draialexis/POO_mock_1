package com.alexisdrai.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Passenger {
    private final String        name;
    private final List<Luggage> luggageList = new ArrayList<>();

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Luggage> getLuggageList() {
        // TODO make this return an immutable list in order to preserve encapsulation
        return luggageList;
    }

    public void addLuggage(Luggage luggage) {
        this.luggageList.add(Objects.requireNonNull(luggage));
    }

    public double getTotalWeight() {
        double weight = 0.0;

        if (this.getLuggageList() == null || this.getLuggageList().isEmpty()) {
            return weight;
        }

        for (Luggage luggage : this.luggageList) {
            weight += luggage.getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "\tPassenger{" +
               "name='" + name + '\'' +
               ", luggageList=\n" + luggageList +
               "\n}";
    }
}
