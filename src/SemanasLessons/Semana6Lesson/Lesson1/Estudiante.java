package SemanasLessons.Semana6Lesson.Lesson1;
public class Estudiante extends Object{
    private String nombre;
    private String grupo;
    private String apellido;

    // 1.- Si el constructor por defecto no existe,  el compilador lo añade.
    // 2.- Si yo programador creo un constructor sin parametros (linea 6), este se llama constructor por default

    public Estudiante(){
        setGrupo("Uno");
    }

    public Estudiante(String nombre){
        setNombre(nombre);
        setGrupo("Uno");
    }

    public Estudiante(String nombre, String apellido){
        //1.- this.nombre = nombre;
        //2.- setNombre(nombre);
        //3.- Encadenamiento(llamando a otro) de constructor.
        this(nombre);
        setApellido(apellido);
        setGrupo("Uno");
    }
    //--------


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object parametro) {
        //Estudiante e = (Estudiante)parametro;
        //return this.nombre == e.nombre;
        if (this == parametro) return true; //si son el mismo objeto
        if (parametro == null || getClass() != parametro.getClass()) return false; //si el parametro es null o si no son de la misma clase
        final Estudiante e = (Estudiante) parametro; //casteo
        return this.nombre == e.nombre; //si los nombres son iguales
    }

    @Override
    public int hashCode() {
        int numero = 5;
        return nombre.length() * 5;
    }
}
