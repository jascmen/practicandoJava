package SemanasLessons.Semana8Lesson.Lesson2;

public class Avion {
    private String modelo;
    private String anio;

    public Avion(String modelo, String anio) {
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "modelo='" + modelo + '\'' +
                ", anio='" + anio + '\'' +
                '}';
    }
}
