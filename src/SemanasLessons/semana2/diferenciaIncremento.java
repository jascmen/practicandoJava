package SemanasLessons.semana2;

public class diferenciaIncremento {
    public static void main(String[] args) {
        //for(int i = 1;i<10;System.out.println(i++));
        /*System.out.println(i++);
        System.out.println(++i);*/
        /*int i= 9;
        int j= 9;
        System.out.println(i++);
        System.out.println(++j);*/
        //int a = ++i; // i se incrementa a 6 primero, luego a obtiene el nuevo valor de i (6)
        //int a = i++; // a obtiene el valor actual de i (5), y luego i se incrementa a 6

        int m =1;
        int n = ++m + m++ + --m;
        System.out.println(n);

    }
}
