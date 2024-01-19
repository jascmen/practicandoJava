package SemanasLessons.semana3;

public class ContornoCuadrado {
    //Usando while loops anidados (un loop dentro de otro), muestre un rectángulo no relleno (sólo un contorno) que es 10 (altura) por 20 (anchura) y hecho de la letra 'B'.
    //La parte no rellena consiste en espacios en blanco.

    public static void main(String[] args) {
        //escribe aquí tu código
        int fila =0;
        while (fila<10){
            int columna =0;
            while(columna<20){
                if(fila==0 || fila==9 || columna==0 || columna==19)
                    System.out.print("B");
                else
                    System.out.print(" ");
                columna++;
            }
            System.out.println();
            fila++;
        }

    }
}
