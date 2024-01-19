package Varios;

import java.util.Objects;

public class EqualsExample01 {
    private String model;
    private String color;
    private int price;

    public EqualsExample01(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //escribe aquí tu código
    @Override
    public boolean equals(Object object) {
        if(this == object)
            return true;
        if(object == null)
            return false;

        EqualsExample01 iphone = (EqualsExample01) object;
        return Objects.equals(model, iphone.model) && Objects.equals(color, iphone.color) && price == iphone.price;
    }


    public static void main(String[] args) {
        EqualsExample01 iphone1 = new EqualsExample01("X", "Black", 999);
        EqualsExample01 iphone2 = new EqualsExample01("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}
