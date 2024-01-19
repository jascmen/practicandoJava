package arrayEjercicios;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //escribe aquí tu código
        String [] array2 = new String[array.length];
        int j=0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != null){
                array2[j] = array[i];
                j++;
            }
        }
        for(int i = 0; i < array.length; i++){
            array[i] = array2[i];
        }
    }
}
