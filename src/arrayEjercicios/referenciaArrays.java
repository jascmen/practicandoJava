package arrayEjercicios;

public class referenciaArrays {
    public static void main(String[] args){
        int[] a = new int[10];
        a[2] = 4;
        a[7] = 9;
        int[] b = a;

        a[9] = b[2] + a[7];
        b[8]= 200;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("-----");
        for (int j = 0; j < b.length; j++) {
            System.out.println(b[j]);
        }
        //System.out.println(a[10]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
        String[] list;
        list = null;
        System.out.println(list[1]); //Exception in thread "main" java.lang.NullPointerException
    }
}
