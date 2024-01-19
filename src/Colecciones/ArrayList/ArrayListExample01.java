package Colecciones.ArrayList;

import java.util.ArrayList;

public class ArrayListExample01 {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Doc");
        waitingEmployees.add("Grumpy");
        waitingEmployees.add("Happy");
        waitingEmployees.add("Sleepy");
        waitingEmployees.add("Bashful");
        waitingEmployees.add("Sneezy");
        waitingEmployees.add("Dopey");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        //escribe aquí tu código
        if(name == null || name.isEmpty())
            return;
        if(waitingEmployees.contains(name)){
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
            alreadyGotSalaryEmployees.add(name);
        }
    }
}
