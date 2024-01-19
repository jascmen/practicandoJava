package StringEjercicios;

public class Example04 {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.us", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domainExtension = checkDomainExtension(url);

            System.out.println("URL address: " + url + ", network protocol - " + protocol + ", domain extension - " + domainExtension);
        }
    }

    public static String checkProtocol(String url) {
        //escribe aquí tu código
        if(url.startsWith("https://"))
            return "https";
        else if(url.startsWith("http://"))
            return "http";
        else
            return "desconocido";
    }

    public static String checkDomainExtension(String url) {
        //escribe aquí tu código
        if(url.endsWith(".com"))
            return "com";
        else if(url.endsWith(".us"))
            return "us";
        else if(url.endsWith(".org"))
            return "org";
        else if (url.endsWith(".net"))
            return "net";
        else
            return "desconocido";
    }
}
