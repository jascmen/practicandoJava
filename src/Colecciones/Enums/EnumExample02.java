package Colecciones.Enums;

public class EnumExample02 {
    public static void main(String[] args) {
        //escribe aquí tu código
        CodeGymQuest[] misiones = CodeGymQuest.values();
        for (CodeGymQuest mision : misiones) {
            System.out.println(mision.ordinal());
        }
    }
}
