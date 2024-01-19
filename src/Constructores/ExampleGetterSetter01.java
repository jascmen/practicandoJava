package Constructores;

public class ExampleGetterSetter01 {
    private int salary = 1000;

    //escribe aquí tu código


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary =  this.salary > salary ? this.salary : salary;
    }
}
