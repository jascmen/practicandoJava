package Varios;

import java.util.Objects;

public class HashCodeExample01 {
    private String model;
    private int year;

    public HashCodeExample01(String model, int year) {
        this.model = model;
        this.year = year;
    }

    //escribe aquí tu código

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    public static void main(String[] args) {
        HashCodeExample01 lamborghini = new HashCodeExample01("Lamborghini", 2020);
        HashCodeExample01 lamborghini1 = new HashCodeExample01("Lamborghini", 2020);
        HashCodeExample01 ferrari = new HashCodeExample01("Ferrari", 2020);
        HashCodeExample01 ferrari1 = new HashCodeExample01("Ferrari", 2020);
        HashCodeExample01 bugatti = new HashCodeExample01("Bugatti", 2020);
        HashCodeExample01 bugatti1 = new HashCodeExample01("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}
