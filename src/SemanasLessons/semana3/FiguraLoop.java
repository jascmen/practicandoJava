package SemanasLessons.semana3;

public class FiguraLoop {
    //Usando bucles while anidados (un bucle dentro de otro bucle), muestre un cuadrado de 5 (altura) por 10 (anchura) relleno con la letra 'Q'.
    public static void main(String[] args) {
        //escribe aquí tu código
        int i = 0;
        while (i<5){
            int j =0;
            while(j<10){
                System.out.print("Q");
                j++;
            }
            System.out.println();
            i++;

        }
    }

}
