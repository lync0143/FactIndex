package org.example;

public class CityPopulationIndex implements FactIndex {

    public int getFact(String cityName) {
        if (cityName.equals("Kansas City")) {
            return 500000;
        }
        return 0;
    }
}
