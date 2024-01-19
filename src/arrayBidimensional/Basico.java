package arrayBidimensional;

public class Basico {
    public static int[][] array;
    public static void main(String[] args) {
        //escribe aquí tu código
        array = new int[2][3];

        int count =1;
        for(int i =0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j] = count;
                count++;
            }
        }
        for(int i =0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.println(array[i][j]);
            }
        }
    }
}
