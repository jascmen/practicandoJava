package SemanasLessons.Semana4Lesson.Lesson2;

public class ToCharArrayStringMethodExample {
    public static void main(String[] args) {
        String s1 = "hello";
        char [] charArray = s1.toCharArray(); // convert string to char array

        for(int i=0; i<charArray.length; i++){
            System.out.print(charArray[i]+"-");
        }
    }
}
