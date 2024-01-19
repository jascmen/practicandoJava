package SemanasLessons.Semana8Lesson.Lesson2;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,Avion> aviones = new TreeMap<>();
        aviones.put(2, new Avion("F14", "1997"));
        aviones.put(4, new Avion("F15", "1998"));
        aviones.put(1, new Avion("F16", "1999"));
        aviones.put(3, new Avion("F17", "2000"));

        for(Map.Entry avion : aviones.entrySet()) {
            //System.out.println("Key: "+avion.getKey()+" Value: "+avion.getValue());

            Object o = avion.getValue();
            Avion a = (Avion) o;
            System.out.println("KEY: "+avion.getKey() +" Modelo: "+a.getModelo()+" Anio: "+a.getAnio());
        }
    }
}
