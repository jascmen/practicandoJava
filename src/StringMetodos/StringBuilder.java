package StringMetodos;

public class StringBuilder {
    public static void main(String[] args) {
        String string = "Learn, learn, and learn again! ";

        System.out.println(addTo(string, new String[]{"A", "rolling", "stone", "gathers", "no", "moss"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static java.lang.StringBuilder addTo(String string, String[] strings) {
        //escribe aquí tu código
        java.lang.StringBuilder result = new java.lang.StringBuilder(string);
        for( String cadena : strings){
            result.append(cadena);
        }
        return result;
    }

    public static java.lang.StringBuilder replace(String string, String str, int start, int end) {
        //escribe aquí tu código
        java.lang.StringBuilder result = new java.lang.StringBuilder(string);
        result.replace(start, end, str);
        return result;
    }
}
