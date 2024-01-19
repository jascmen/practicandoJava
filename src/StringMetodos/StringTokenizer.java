package StringMetodos;

import java.util.Arrays;

public class StringTokenizer {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //escribe aquí tu
        java.util.StringTokenizer st = new java.util.StringTokenizer(query, delimiter);
        String[] tokens = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            tokens[i] = st.nextToken();
            i++;
        }
        return tokens;
    }
}
