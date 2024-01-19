package Constructores;

public class Example01 {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public Example01(String model, int year, String color) {
        //escribe aquí tu código
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Example01(String model, int year) {
        //escribe aquí tu código
        this.model = model;
        this.year = year;
        this.color = "Orange";
    }

    public Example01(String model) {
        //escribe aquí tu código
        this.model = model;
        this.year = 4321;
        this.color = "Orange";
    }
}
