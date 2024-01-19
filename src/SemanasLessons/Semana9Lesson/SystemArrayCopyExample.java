package SemanasLessons.Semana9Lesson;

public class SystemArrayCopyExample {
    public static void main(String[] args) {
        int []array1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int []array2 = new int []{100,200,300,400,500,600,700,800,900, 1000};

        System.arraycopy(array2, 0, array1, 0, 5); // esto copia los primeros 5 elementos de array2 en array1

        for(int i: array1){
            System.out.print(i + " ");
        }
    }

}
