package Colecciones.HashMap;

import java.util.HashMap;

public class HashMapExample02 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Lista de estudiantes: ");
        printStudents();
        System.out.print("Nota media: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("William Butler Yeats", 4.3d);
        grades.put("Emily Dickenson", 4.1d);
        grades.put("William Shakespeare", 4.9d);
        grades.put("Maya Angelou", 3.7d);
        grades.put("Shel Silverstein", 3.2d);
    }

    public static void printStudents() {
        //escribe aquí tu código
        for(String key : grades.keySet()){
            System.out.println(key);
        }
    }

    public static Double getAverageMark() {
        //escribe aquí tu código
        int count =0;
        Double suma = 0.0;
        for(Double value : grades.values()){
            suma += value;
            count++;
        }
        return suma/count;
    }
}
