package Wrappers;

public class CharacterExample02 {
    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', 'b');
        compare('r', 'c');
        compare('z', 'z');
    }

    public static void compare(Character first, Character second) {
        if (first.equals( second)) {
            System.out.println("equal");
        } else if (first > second) {
            System.out.println("greater than");
        } else if (first < second) {
            System.out.println("less than");
        } else {
            System.out.println("How can this be???");
        }
    }
}
