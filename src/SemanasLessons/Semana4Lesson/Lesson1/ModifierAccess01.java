package SemanasLessons.Semana4Lesson.Lesson1;

public class ModifierAccess01 {
    /*public static void main(String[] args) {
        metodoPublico();
        metodoDefault();
        metodoPrivate();
    }*/

    /*static*/ void metodoDefault(){
        System.out.println("metodo default");
    }
    /*static*/ public void metodoPublico(){
        System.out.println("metodo publico");
    }
    /*static*/ private void metodoPrivate(){
        System.out.println("metodo private");
    }
    public void ayudante(){
        metodoDefault();
    }

    public void estoNoEsRecomendablePeroSePuedeUsar(){
        metodoPrivate();
    }

}
