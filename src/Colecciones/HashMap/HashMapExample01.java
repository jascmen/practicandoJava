package Colecciones.HashMap;

import java.util.HashMap;

public class HashMapExample01 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //escribe aquí tu código
        for(int i = 0 ; i<5 ; i++){
            grades.put("Estudiante "+i, Math.random()*10);
        }
    }
}
