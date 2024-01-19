package Codificacion;

public class HexDecimal {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //escribe aquí tu código
        String hexNumber = "";
        if(decimalNumber <= 0)
            return hexNumber;
        while (decimalNumber != 0) {
            hexNumber =  HEX.charAt(decimalNumber % 16) + hexNumber;
            decimalNumber = decimalNumber / 16;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        //escribe aquí tu código
        int decimalNumber = 0;
        if(hexNumber == null)
            return decimalNumber;
        for(int i = 0; i < hexNumber.length(); i++){
            decimalNumber = 16 * decimalNumber + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimalNumber;
    }
}
