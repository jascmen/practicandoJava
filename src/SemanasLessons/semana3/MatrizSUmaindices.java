package SemanasLessons.semana3;

public class MatrizSUmaindices {
    public static void main(String[] args) {
        //Cree una matriz triangular en la que el valor de cada elemento sea la suma de sus índices.

        int [][] matriz = new int[10][];
        for(int k=0; k< matriz.length;k++){
            matriz[k] = new int[k+1];
        }

        for(int i =0; i< matriz.length;i++){
            for (int j = 0; j< matriz[i].length; j++) {
                matriz[i][j] = i+j;
            }
        }

        for(int i =0; i< matriz.length;i++){
            for (int j = 0; j< matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
