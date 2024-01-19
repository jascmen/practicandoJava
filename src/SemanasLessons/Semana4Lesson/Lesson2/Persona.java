package SemanasLessons.Semana4Lesson.Lesson2;

public class Persona {
    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static void main(String[] args) {
        Persona juan = new Persona();
        juan.setNombre("Juan");
        juan.setApellido("Hernandez");

        Persona marta = new Persona();
        marta.setNombre("Marta");
        marta.setApellido("Gonzalez");
    }
}
