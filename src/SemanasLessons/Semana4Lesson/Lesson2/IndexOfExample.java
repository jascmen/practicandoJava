package SemanasLessons.Semana4Lesson.Lesson2;
import java.util.HashMap;
import java.util.Map;

public class IndexOfExample {
    public static void main(String[] args) {
        String texto = "Hoy es jueves 9 de noviembre del 2023 y es un bonito dia";
        //int indice = texto.indexOf("quiero"); //4
        int indice = texto.indexOf("hola");
        //System.out.println(indice);
        //System.out.println(texto.contains("quiero"));

        //flyweight design pattern
        String[]palabras = texto.split(" ");

        Map<String, Integer> mapa = new HashMap<>();
        for(String palabra: palabras){
            if(mapa.containsKey(palabra)){
                mapa.put(palabra, mapa.get(palabra)+1);
            }else{
                mapa.put(palabra, 1);
            }
        }

        int numeroDeVecesQueApareceES = mapa.get("es");
        System.out.println("es aparecio: "+numeroDeVecesQueApareceES+" veces..");

        String text2 = "Hoy es jueves 9 de noviembre del 2023 y es un bonito dia";

        int indice2 = text2.indexOf("es");
        int indiceTemp = indice2;
        System.out.println("indice2: "+indice2);
        int indice3 = text2.indexOf("es", indice2+1);
        int count = 0;
        System.out.println("indice3: "+indice3);

    }
}
