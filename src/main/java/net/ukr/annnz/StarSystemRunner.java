package net.ukr.annnz;

import java.util.List;

public class StarSystemRunner {
    public static void main(String[] args) {

        Star star = new Star("Sun");

        StarSystem starSystem = new StarSystem("Sirius");

        starSystem.addPlanet(new Planet("Earth"));
        starSystem.addPlanet(new Planet("Uranus"));
        starSystem.addPlanet(new Planet("Saturn"));
        starSystem.addPlanet(new Planet("Mercury"));
        starSystem.addPlanet(new Planet("Venus"));
        starSystem.addPlanet(new Planet("Mars"));
        starSystem.addPlanet(new Planet("Jupiter"));
        starSystem.addPlanet(new Planet("Neptune"));

        System.out.println("Star name is " + star.getName());
        System.out.println("Quantity of planets in a Star System equals " + starSystem.getPlanetList().size());
        System.out.println("Planets that were added:");
        List<Planet> planetList = starSystem.getPlanetList();
        for (Planet planet : planetList) {
            System.out.println(planet);
        }
    }

}

