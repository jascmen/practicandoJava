package SemanasLessons.Semana7Lesson.Lesson1;

import java.util.Map;

public class RetrieveEnvironmentProps {
    public static void main(String[] args) {
        Map<String, String> props = System.getenv();

        for(Map.Entry<String, String> property : props.entrySet()){
            System.out.println("Key: " + property.getKey() +", value: " + property.getValue()  );
        }

    }

}
