package SemanasLessons.Semana10Lesson.Lesson02;

public class ExceptionExample06 {
    public static void main(String[] args) {
        try {
            verificarSaldo();
        } catch (SaldoException e) {
            System.out.println("SaldoException encontrada: "+ e.getMessage());
            System.out.println(e.getStackTrace().length);
            for(StackTraceElement stackTraceElement : e.getStackTrace()){
                System.out.println("Method Failed: " + stackTraceElement.getMethodName());
                System.out.println("getLineNumber: " + stackTraceElement.getLineNumber() );
                System.out.println("getFileName: " + stackTraceElement.getFileName());
                System.out.println("getClassName: " + stackTraceElement.getClassName());
            }
        }
    }

    static private void verificarSaldo()throws SaldoException{
        //1000
        int saldo = 995;
        saldo = saldo + 15;
        if(saldo>1000)
            //throw new Exception("Te acabaste la lana para gastar");
            throw new SaldoException("Te acabaste la lana para gastar");
    }
}
