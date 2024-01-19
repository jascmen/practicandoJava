package SemanasLessons.Semana7Lesson.Lesson2;



import SemanasLessons.Semana4Lesson.Lesson2.Persona;

import java.sql.Array;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add(new Integer(123));
        lista.add(123); //adentro hizo un autoboxing
        lista.add("hola mundo"); //guardpó un Objeto String
        lista.add(3.1416d);  //Guardó un Wrapper de la clase Double
        lista.add(3.1416f);   //Guardó un Wrapper de la clase Float
        lista.add('c');     //Guardó un Character
        Persona p = new Persona();
        p.setNombre("Said");
        p.setApellido("Olano");
        lista.add(p);   //aqui guardó literal un objeto
        System.out.println( !lista.isEmpty() ? "La lista tiene elementos" : "La lista esta vacia" );

        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println("------------------------------------");
        for(Object o : lista){
            System.out.println(o);
        }


        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        int primitivo = 3;
        listaNumeros.add(primitivo);
        boolean add = listaNumeros.add(new Integer("4"));
        listaNumeros.add(1+2+2);
        System.out.println(listaNumeros.size());
        System.out.println("--------------------------------------------->>>>");

        for(Integer integer : listaNumeros){
            System.out.println(integer);
        }
        listaNumeros.clear();
        System.out.println("despues de limpiar la lista de numeros el tamanio es:" + listaNumeros.size());

    }

}
