package SemanasLessons.Semana7Lesson.Lesson1;


import SemanasLessons.Semana4Lesson.Lesson2.Persona;

public class GarbageCollector02 {
    public static void main(String[] args) {
        printMemoryInfo();
        Persona p = null;
        for (int i=0;i<100;i++){
            //Persona p = new Persona();
             p = new Persona();
            if(i==50)
                printMemoryInfo();
            p = null;
        }
        System.gc();
        printMemoryInfo();

        //1.- apuntar a null;
        //2.- System.gc();
    }

    static void printMemoryInfo(){
        Runtime rt = Runtime.getRuntime();
        long total_mem = rt.totalMemory();
        long free_mem = rt.freeMemory();
        long used_mem = total_mem - free_mem;
        System.out.println("Amount of used memory: " + used_mem);
    }

}
