package SemanasLessons.Semana8Lesson.Lesson1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<>();
        Auto mustang = new Auto("Mustang");
        Auto astonMartin = new Auto("Aston Martin");
        Auto vocho = new Auto("VW");
        Auto phantom = new Auto("Phantom");
        Auto corvette = new Auto("Corvette");
        Auto cinco = new Auto("Cinco");
        autos.add(mustang);
        autos.add(astonMartin);
        autos.add(vocho);
        autos.add(phantom);
        autos.add(corvette);
        autos.add(cinco);

        for(int i=autos.size()-1; i>=0; i--){
            autos.get(i).pitar();
            //if(autos.get(i).equalsIgnoreCase("VW")){
            if(autos.get(i).nombre.equalsIgnoreCase("VW")){
                System.out.println("Vocho detectado!!!");
                autos.remove(i);
            }

        }
        System.out.println("Ya no esta el vocho y el nuevo tamanio es: "+ autos.size());
        System.out.println("------------------------");
        for(Auto carro : autos){
            carro.pitar();
        }
        System.out.println("------------------------");
        System.out.println("Usando el iterador: ");
        Iterator<Auto> iteradorAutos = autos.iterator();
        while(iteradorAutos.hasNext()){
                iteradorAutos.next().pitar();
        }
        //System.out.println(iteradorAutos.next());
    }
}

class Auto{
    String nombre;
    Auto(String nombre){
        this.nombre = nombre;
        System.out.println(nombre);
    }
    void pitar(){
        System.out.println("Soy un auto: " + nombre + " y estoy pitando...");
    }
}