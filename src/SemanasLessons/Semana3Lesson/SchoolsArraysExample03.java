package SemanasLessons.Semana3Lesson;

public class SchoolsArraysExample03 {
    /*
        1 director
        cada director tiene 2 escuelas
        cada escuela tiene 6 maestros
        cada maestro tiene 5 estudiantes
        cada estudiante tiene 3 materias
     */
    public static void main(String[] args) {
        String[][][][] director = new String[2][6][5][3];

        for (int i = 0; i < director.length; i++) {
            for (int j = 0; j < director[i].length; j++) {
                for(int k= 0; k < director[i][j].length; k++){
                    for(int l=0; l< director[i][j][k].length; l++ ){
                        director[i][j][k][l] = "escuela " + (i+1) + ", materia " + (j+1)+ ", estudiante " + (k+1)+ ", materia " + (l+1);
                        System.out.println(director[i][j][k][l]);
                    }
                    System.out.println("-----------------------");
                }

            }
        }

    }
}
