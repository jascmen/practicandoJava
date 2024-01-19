package Excepciones;

public class EjemploThrow {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10, -2);
            System.out.println("Resultado: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int dividir(int numerador, int denominador) {
        if (denominador < 0) {
            // Lanzar una excepción si el denominador es negativo
            throw new IllegalArgumentException("El denominador no puede ser negativo");
        }
        return numerador / denominador;
    }
}
