package SemanasLessons.Semana10Lesson.Lesson;

public class SwitchExample01 {
    public static void main(String[] args) {
        EstacionesDelAnio estacion = EstacionesDelAnio.PRIMAVERA;

        switch (estacion) {
            case PRIMAVERA:
                System.out.println("La estacion es primavera");
                break;
            case VERANO:
                System.out.println("La estacion es verano");
                break;
            case OTOÑO:
                System.out.println("La estacion es otoño");
                break;
            case INVIERNO:
                System.out.println("La estacion es invierno");
                break;
            default:
                System.out.println("La estacion no es valida");
                break;
        }
    }
}
