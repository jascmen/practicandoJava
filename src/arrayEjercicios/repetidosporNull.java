package arrayEjercicios;

import java.util.Scanner;

public class repetidosporNull {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        String stringActual = "";

        Scanner scanner = new Scanner(System.in);
        for (int m = 0; m < 6; m++) {
            strings[m] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            stringActual = strings[i];
            if (stringActual != null) {
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[j] != null && stringActual.equals(strings[j])) {
                        strings[i] = null;
                        strings[j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
    //solucion CodeGym
    //public static void main(String[] args) {
    //        Scanner scanner = new Scanner(System.in);
    //
    //        strings = new String[6];
    //        for (int i = 0; i < 6; i++) {
    //            strings[i] = scanner.nextLine();
    //        }
    //
    //        for (int i = 0; i < strings.length; i++) {
    //            String currentString = strings[i];
    //            for (int j = i + 1; j < strings.length; j++) {
    //                if (currentString == null) {
    //                    break;
    //                }
    //                if (currentString.equals(strings[j])) {
    //                    strings[j] = null;
    //                    strings[i] = null;
    //                }
    //            }
    //        }
    //        for (int i = 0; i < strings.length; i++) {
    //            System.out.print(strings[i] + ", ");
    //        }
    //    }
}
