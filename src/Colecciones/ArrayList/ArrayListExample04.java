package Colecciones.ArrayList;

import java.util.ArrayList;

public class ArrayListExample04 {
    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("Death Star");
        print();
    }

    public static void createNewPlanet(String planetName) {
        //escribe aquí tu código
        planets.add(3, planetName);
    }

    public static void addPlanets() {
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%s is %dth planet from the Sun%n", planets.get(i), (i + 1));
        }
        System.out.println();
    }
}
