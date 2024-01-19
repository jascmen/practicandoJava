package MetodosEjercicios;

public class Example02Cubo {
    public static void main(String[] args) {
        ninthDegree(2);
    }

    public static long cube(long a) {
        return a * a * a;
    }

    //escribe aquí tu código
    public static long ninthDegree(long valor) {
        return cube(cube(valor));
    }
}
