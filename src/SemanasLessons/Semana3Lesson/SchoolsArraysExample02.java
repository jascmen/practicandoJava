package SemanasLessons.Semana3Lesson;

public class SchoolsArraysExample02 {
    /*
        1 director
        cada director tiene 2 escuelas
        cada escuela tiene 6 maestros
        cada maestro tiene 5 estudiantes
        cada estudiante tiene 3 materias
     */
    public static void main(String[] args) {
        String[][] director = new String[2][6];
        director[0][0] = "escuela 1,materia 1";
        director[0][1] = "escuela 1, materia 2";
        director[0][2] = "escuela 1, materia 3";
        director[0][3] = "escuela 1, materia 4";
        director[0][4] = "escuela 1, materia 5";
        director[0][5] = "escuela 1, materia 6";

        director[1][0] = "escuela 2,materia 1";
        director[1][1] = "escuela 2, materia 2";
        director[1][2] = "escuela 2, materia 3";
        director[1][3] = "escuela 2, materia 4";
        director[1][4] = "escuela 2, materia 5";
        director[1][5] = "escuela 2, materia 6";


        for (int i = 0; i < director.length; i++) {
            for (int j = 0; j < director[i].length; j++) {
                System.out.println(director[i][j]);
            }
        }

    }
}
