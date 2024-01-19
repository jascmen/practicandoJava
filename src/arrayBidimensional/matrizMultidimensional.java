package arrayBidimensional;

public class matrizMultidimensional {
    //Creando un multi-array
    //En el main(String[]) método, muestre todos los números en el multiArray de tres dimensiones.
    //
    //
    //Requirements:
    //1. La clase Solution debe tener una variable multiArray int[][][] static y public.
    //2. En el método main (String []), muestra todos los números en multiArray.
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //escribe aquí tu código
        //System.out.println(multiArray.length);
        for(int i=0; i<multiArray.length;i++){//3
            for(int j = 0; j<multiArray[i].length; j++){
                for(int k = 0; k<multiArray[i][j].length; k++){
                    System.out.print(multiArray[i][j][k]+" ");
                }
            }
            System.out.println();
        }
    }
}
