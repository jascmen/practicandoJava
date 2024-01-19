package SemanasLessons.Semana3Lesson;

public class SchoolsArraysExample01 {
    /*Director
    Escuela
        Maestro
        Salon
            Estudiante
                Materia
                        Nombre*/
    public static void main(String[] args) {
        String[]maestros = new String[]{"William", "Katyana", "Angel", "Gustavo","David","Julio"};

        String []escuelas = new String[]{"Escuela1","Escuela2"};
        //escuelas[0] = "Escuela 1";
        //escuelas[1] = "Escuela 2";

        String [] director= new String[]{"Director"};

        String [] estudiantes = new String[]{"Estudiante1", "Estudiante2", "Estudiante3", "Estudiante4", "Estudiante5"};

        String[] materias = new String[]{ "Materia1", "Materia2", "Materia3", "Materia4", "Materia5"};

        String [][][][][]arreglo = new String[director.length][escuelas.length][maestros.length][escuelas.length][materias.length];

        for(int i =0;i<arreglo.length;i++){//director
            for(int j =0;j<arreglo[i].length;j++){//escuelas
                for(int k =0;k<arreglo[i][j].length;k++){//maestros
                    for(int l =0;l<arreglo[i][j][k].length;l++){//estudiantes
                        for(int m =0;m<arreglo[i][j][k][l].length;m++){//materias
                            arreglo[i][j][k][l][m] = director[i] + " " + escuelas[j] + " " + maestros[k] + " " + estudiantes[l] + " " + materias[m];
                            System.out.println(arreglo[i][j][k][l][m]);
                        }
                        System.out.println("-----------------------");
                    }
                }
            }
        }
        /*for(int i =0;i<arreglo.length;i++){//director
            for(int j =0;j<arreglo[i].length;j++){//escuelas
                for(int k =0;k<arreglo[i][j].length;k++){//maestros
                    for(int l =0;l<arreglo[i][j][k].length;l++){//estudiantes
                        for(int m =0;m<arreglo[i][j][k][l].length;m++){//materias
                            System.out.println(arreglo[i][j][k][l][m]);
                        }
                    }
                }
            }
        }*/
    }
}
