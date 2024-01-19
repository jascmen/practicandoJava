package SemanasLessons.Semana10Lesson.Lesson;

public class ConsumeEstacionesDelAnio {
    public static void main(String[] args) {
        EstacionesDelAnio estacion = EstacionesDelAnio.INVIERNO;
        System.out.println(estacion);
        System.out.println(estacion.ordinal());

        //EstacionesDelAnio estacion2 = EstacionesDelAnio.valueOf("MONDAY");
        //System.out.println(estacion2);

        System.out.println("-------------------------------------------------------");
        for(EstacionesDelAnio e : EstacionesDelAnio.values()){
            System.out.println(e);
        }
    }
}
