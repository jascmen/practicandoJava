package SemanasLessons.Semana5Lesson.Lesson2;

public class Aplicacion {
    public static void main(String[] args) {
        Persona ana = new Persona();
        Persona pedro = new Persona();

        ana.setNombre("Ana");
        ana.setApellido("Hernandez");

        pedro.setNombre("Pedro");
        pedro.setApellido("Fernandez");

        System.out.println(ana.getNombre());
        System.out.println(ana.getApellido());

        System.out.println(pedro.getNombre());
        System.out.println(pedro.getApellido());


        /*
        ana.nombre = "ANA";
        ana.apellido= "HERNANDEZ";

        pedro.nombre = "PETER";
        pedro.apellido= "FERNANDEZ";

        ana.nombre = "MARIA";
         */

        Empleado said = new Empleado();
        said.setNombre("Jose Said");
        said.setApellido("Olano Garcia");
        System.out.println("nombre: " + said.getNombre()+" y apellidos: "+  said.getApellido() );

        Persona enrique1 = new Persona();
        enrique1.setNombre("");
        enrique1.setApellido("");

        Empleado enrique2 = new Empleado();
        enrique2.setNombre("");
        enrique2.setApellido("");
        enrique2.setNumeroEmpleado(6543);
        enrique2.setSalario(100000);

        Persona enrique3 = new Empleado();
        enrique3.setNombre("");
        enrique3.setApellido("");
        ((Empleado)enrique3).setNumeroEmpleado(12345);
    }

}
