package SemanasLessons.Semana5Lesson.Lesson2;

public class Empleado extends Persona{

    private double salario;

    private int numeroEmpleado;

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
        System.out.println("numeroEmpleado: "+ numeroEmpleado);
    }

    public void trabaja(){
        System.out.println("Trabaja mucho el empleado");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
