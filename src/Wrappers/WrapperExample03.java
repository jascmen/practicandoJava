package Wrappers;

public class WrapperExample03 {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first.equals( second)); // el resultado da true porque el valor de first es 1000 y el valor de second es 1000
        System.out.println(third == second); // el resultado da true porque el valor de third es 1000 y el valor de second es 1000
        System.out.println(third == first); // el resultado da true porque el valor de third es 1000 y el valor de first es 1000
    }
}
