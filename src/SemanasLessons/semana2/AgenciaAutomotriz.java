package SemanasLessons.semana2;

class Automovil{
    String color;
    int anio;
    String modelo;

    void arrancar(){
        System.out.println("Run run ....");
    }
    void detener(){
        System.out.println("iiiiiiiiiiiiii");
    }
}

public class AgenciaAutomotriz{
    public static void main(String []args){
        Automovil kia = new Automovil();
        kia.color = "Blanco";
        kia.anio = 2023;
        kia.modelo = "Sorento";
        kia.arrancar();
        kia.detener();

        Automovil renault = new Automovil();
        renault.color = "Plata";
        renault.anio = 2024;
        renault.modelo = "Sedan";
        renault.arrancar();
        renault.detener();
    }
}