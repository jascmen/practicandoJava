package Excepciones;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExceptionExample03 {

    public static final String PROMPT_STRING = "Enter a student number, or 'exit' to exit: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "The question will be answered by ";
    public static final String NOT_EXIST = "A student with this number does not exist";
    public static final String INTEGER_REQUIRED = "You must enter an integer";

    static List<String> studentsJournal = Arrays.asList(
            "Hugh Jass"
            , "Rita Booke"
            , "Justin Case"
            , "Robin Banks"
            , "Manny Kinn"
            , "Harry Pitts"
            , "Marty Graw"
            , "Shanda Lear"
            , "Rusty Dorr"
            , "Otto Graph");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(EXIT)) {
                break;
            }
            try {
                int studentId = Integer.parseInt(input);
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (NumberFormatException e) {
                System.out.println("You must enter an integer");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("A student with this number does not exist");
            }
        }
    }
}
