package Codificacion;

public class Binary_Decimal {

/*
Convertidor binario
*/

        public static void main(String[] args) {
            int decimalNumber = Integer.MAX_VALUE;
            System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
            String binaryNumber = "1111111111111111111111111111111";
            System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimal(binaryNumber));
        }

        public static String toBinary(int decimalNumber) {
            //escribe aquí tu código
            String binaryNumber = "";
            if(decimalNumber <= 0)
                return binaryNumber;

            while (decimalNumber != 0) {
                binaryNumber =  decimalNumber % 2 + binaryNumber;
                decimalNumber = decimalNumber / 2;

            }
            return binaryNumber;
        }

        public static int toDecimal(String binaryNumber) {
            //escribe aquí tu código
            int decimalNumber = 0;
            if(binaryNumber == null) {
                return decimalNumber;
            }
            for(int i = 0; i < binaryNumber.length(); i++){
                int index = binaryNumber.length() - i - 1;
                int value = Character.getNumericValue(binaryNumber.charAt(index));
                decimalNumber += value * Math.pow(2, i);
            }

            return decimalNumber;
        }


}
