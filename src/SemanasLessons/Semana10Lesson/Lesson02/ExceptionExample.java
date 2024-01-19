package SemanasLessons.Semana10Lesson.Lesson02;

import Excepciones.SaldoException;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            verificarSaldo();
        } catch (SaldoException e) {
            System.out.println("Excepcion hallada: " + e.getMessage());
            //System.out.println(Arrays.stream(e.getStackTrace().length));
            //System.out.println(Arrays.stream(e.getStackTrace()).toList());
            for( StackTraceElement stackTraceElement : e.getStackTrace()){
                System.out.println("Metodo failed: "+ stackTraceElement.getMethodName());
            }

        }
    }

    public static void verificarSaldo() throws SaldoException {
        int saldo = 995;
        saldo = saldo + 15;

        if (saldo > 1000) {
            //throw new Exception("Saldo insuficiente");
            throw new SaldoException("Te acabaste todo papu");
        }
    }
}
