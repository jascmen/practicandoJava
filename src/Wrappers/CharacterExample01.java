package Wrappers;

public class CharacterExample01 {

    public static void main(String[] args) {
        String string = "I think this will be a new feature. " +
                "Just don't tell anyone that it was an accident.";

        System.out.println("Number of digits in the string: " + countDigits(string));
        System.out.println("Number of letters in the string: " + countLetters(string));
        System.out.println("Number of spaces in the string: " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //escribe aquí tu código
        char[] chars = string.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        //escribe aquí tu código
        char[] chars = string.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        //escribe aquí tu código
        char[] chars = string.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (Character.isSpaceChar(c)) {
                count++;
            }
        }
        return count;
    }
}
