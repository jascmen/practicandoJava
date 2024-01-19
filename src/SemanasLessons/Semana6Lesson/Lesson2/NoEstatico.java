package SemanasLessons.Semana6Lesson.Lesson2;

public class NoEstatico {

    private int variableDeInstancia = 8;
    private static int contadorCompartido = 1;

    public void incrementar(){
        contadorCompartido++;
    }

    public void caller(){
        System.out.println("caller...");
        //incrementar();
        //metodoEstatico();
        variableDeInstancia = 20;
        contadorCompartido = 20;
    }
    public static void metodoEstatico(){
        System.out.println("Soy un metodo estatico");
        metodoEstatico2();
    }
    public static void metodoEstatico2(){
        System.out.println("Soy un metodo estatico2");
        // variableDeInstancia  = 10; Si descomento, no compila, porque un método estático
        // no puede usar una propiedad de instancia
    }

    public static void main(String[] args) {
        NoEstatico ne1 = new NoEstatico();
        ne1.incrementar(); //1++
        System.out.println(ne1.contadorCompartido); //2

        NoEstatico ne2 = new NoEstatico();
        ne2.incrementar(); //2++;
        System.out.println(ne2.contadorCompartido); //3

        //NoEstatico ne3 = new NoEstatico();
        //ne3.incrementar(); //3++;
        System.out.println(NoEstatico.contadorCompartido); //3

        NoEstatico ne4 = new NoEstatico();
        //ne4.metodoEstatico --> No compila
        ne4.caller();
        NoEstatico.metodoEstatico();

        ne4.caller();
        System.out.println(ne4.variableDeInstancia);

        ne4.caller();
        //NoEstatico.caller();

        ne4.contadorCompartido++;
    }

}
