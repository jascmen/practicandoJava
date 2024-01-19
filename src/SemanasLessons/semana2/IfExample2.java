package SemanasLessons.semana2;

public class IfExample2{
    public static void main(String[] args) {
        // Lunes = 1, Martes = 2, Miercoles=3, Jueves=4, Viernes=5
        int dia1 = 2;
        int dia2 = 3;
        boolean hayClase = (dia1==1) || (dia2==4);    //(true OR true)
        if(hayClase){
            System.out.println("Tenemos clase 7pm CST");
        }else{
            String dia1EnTexto = dimeDia(dia1);
            String dia2EnTexto = dimeDia(dia2);
            System.out.println("El día 1 tiene un valor de: " + dia1EnTexto);
            System.out.println("El día 2 tiene un valor de: " + dia2EnTexto);
        }
        System.out.println("adios!");
    }

    public static String dimeDia(int dia){
        String resultado = "Algun otro dia";
        if(dia==1)
            resultado = "Lunes";
        //else
        if(dia==2)
            resultado = "Martes";
        //else
        if(dia==3)
            resultado = "Miercoles";
        //else
        if(dia==4)
            resultado = "Jueves";
        //else
        if(dia==5)
            resultado = "Viernes";
        //else
            //resultado = "Algun otro dia";
        return resultado;
    }

}