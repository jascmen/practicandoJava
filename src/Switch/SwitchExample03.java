package Switch;

public class SwitchExample03 {
    public static void main(String[] args) {
        System.out.println(getShapeNameByCornerCount(3));
        System.out.println(getShapeNameByCornerCount(5));
        System.out.println(getShapeNameByCornerCount(1));
    }

    public static String getShapeNameByCornerCount(int cornerCount) {
        String shape;
        switch (cornerCount){
            case 3 -> shape = "Triángulo";
            case 4 -> shape = "Cuadrilátero";
            case 5 -> shape = "Pentágono";
            case 6 -> shape = "Hexágono";
            case 7 -> shape = "Heptágono";
            case 8 -> shape = "Octágono";
            default -> shape = "Otra forma";
        }
        return shape;
    }
}
