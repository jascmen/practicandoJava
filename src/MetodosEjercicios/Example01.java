package MetodosEjercicios;

public class Example01 {
    //Este es el método signIn() que saluda a los usuarios del sitio web.
    // Actualmente, saluda a todos los usuarios, pero solo debería saludar a los usuarios registrados.
    // Todos los usuarios no registrados tienen el nombre "user".
    //Agregue la validación de nombre de usuario al comienzo del método signIn().
    //Si el nombre es "user", use la instrucción return para abortar la ejecución del método.

    public static void main(String[] args) {
        signIn("pedro");
    }

    public static void signIn(String username) {
        //escribe aquí tu código
        if(username.equals("user")){
            return;
        }else {
            System.out.println("Welcome, " + username);
            System.out.println("We've really missed you, " + username);
        }
    }
}
