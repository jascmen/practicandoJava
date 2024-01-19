package SemanasLessons.semana3;

public class MatrizMultidimensional {
    public static void main(String[] args) {
        //int[][][][] matrix = new int[2][3][4][5];
        int[][][][] matrix;
        matrix = new int[2][][][];                // Create a 2-element array of references to references to references
        for (int i = 0; i < matrix.length; i++)
        {
            matrix[i] = new int[3][][];                // Create a 3-element array of references to references
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = new int[4][];             // Create a 4-element array of references
                for (int k = 0; k < matrix[i][j].length; k++)
                    matrix[i][j][k] = new int[5];          // Create 5-element arrays of integers
            }
        }
    }
}
