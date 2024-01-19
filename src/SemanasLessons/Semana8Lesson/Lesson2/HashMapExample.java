package SemanasLessons.Semana8Lesson.Lesson2;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> participantes = new HashMap<>();
        participantes.put(1, "Juan");
        participantes.put(2, "Enrique");
        participantes.put(3, "Jorge");
        participantes.put(4, "Diego");
        participantes.put(5, "Enrique Valencia");
        participantes.put(6, "Said");

        System.out.println(participantes.size());
        System.out.println(participantes.get(1));
        System.out.println(participantes.containsKey(5));
        System.out.println(participantes.containsKey(6));
        System.out.println(participantes.containsValue("Enrique"));
        System.out.println(participantes.containsValue("Pedro"));

        String elementoEliminado = participantes.remove(6); // Elimina el elemento con la llave 6
        System.out.println("Elemento eliminado: " + elementoEliminado);

        for(Integer participante : participantes.keySet()) {
            System.out.println("participanteKey: "+participante);
        }

        List<String> participanteLista = new ArrayList<>(participantes.values());
         for(String participante : participanteLista) {
              System.out.println("participanteValue: "+participante);
         }
        Set<String> nombres = new HashSet<>(participantes.values());
         for(String nombre : nombres) {
                    System.out.println("Nombre: "+nombre);
         }
        System.out.println("Iterando con EntrySet");
         Set<Map.Entry<Integer,String>>filas = participantes.entrySet();
            for(Map.Entry<Integer,String> fila : filas) {
                        System.out.println("Fila: Key: "+fila.getKey()+" Value: "+fila.getValue());
            }
    }
}
