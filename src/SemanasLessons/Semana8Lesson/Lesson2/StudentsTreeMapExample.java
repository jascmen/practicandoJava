package SemanasLessons.Semana8Lesson.Lesson2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class StudentsTreeMapExample {
    public static void main(String[] args) {
        var students = new TreeMap<Student, Boolean>(new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                int gradeFirst = s1.math + s1.engineering + s1.english;
                int gradeSecond = s2.math + s2.engineering + s2.english;
                return Integer.compare(gradeFirst, gradeSecond);
            }

        });

        Student s1 = new Student();
        s1.engineering = 10;
        s1.math = 10;
        s1.english = 10;
        Student s2 = new Student();
        s2.engineering = 5;
        s2.math = 5;
        s2.english = 5;
        Student s3 = new Student();
        s3.engineering = 8;
        s3.math = 8;
        s3.english = 8;
        students.put(s1, true);
        students.put(s2, true);
        students.put(s3, true);

        for(Map.Entry<Student, Boolean> student : students.entrySet()) {
            System.out.println("Student: " + student.getKey() );
        }
    }

    static class Student {
        int engineering;
        int math;
        int english;

        @Override
        public String toString() {
            return "Student{" +
                    "engineering=" + engineering +
                    ", math=" + math +
                    ", english=" + english +
                    '}';
        }
    }
}
