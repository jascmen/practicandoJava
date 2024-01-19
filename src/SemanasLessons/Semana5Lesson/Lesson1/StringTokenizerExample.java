package SemanasLessons.Semana5Lesson.Lesson1;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my-name-is-pablo-marmol","-");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

}
