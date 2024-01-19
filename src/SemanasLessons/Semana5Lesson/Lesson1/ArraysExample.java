package SemanasLessons.Semana5Lesson.Lesson1;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        char[] charArr1 = new char[] { 'g', 'e', 'e', 'k', 's' };
        char[] charArr2 = new char[] { 's', 'e', 'e', 'k', 'g' };
        System.out.println(Arrays.toString(charArr1));

        System.out.println(Arrays.equals(charArr1, charArr2));
        System.out.println(charArr2);
        Arrays.sort(charArr2);
        System.out.println(charArr2);
    }

}
