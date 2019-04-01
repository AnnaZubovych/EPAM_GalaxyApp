package net.ukr.annnz;

import java.util.ArrayList;
import java.util.List;

public class StarSystem {
    private String name;

    private List<Planet> planetList = new ArrayList<>();

    public StarSystem(String name) {
        this.name = name;
    }


    public void addPlanet(Planet planet) {
        planetList.add(planet);
    }


    public List<Planet> getPlanetList() {
        return planetList;
    }
}

