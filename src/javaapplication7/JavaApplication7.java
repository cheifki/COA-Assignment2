/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Administrator
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Decimal(base10)\tBinary(base 2)\tHexadecimal(base 10)");
        System.out.println("---------------------------------------------");

        for (int decimal = 0; decimal <= 256; decimal++) {
            String binary = convertToBinary(decimal);
            String hexadecimal = convertToHexadecimal(decimal);
            System.out.printf("%d\t\t%s\t\t%s%n", decimal, binary, hexadecimal);
        }
    }
    public static String convertToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String convertToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }
}
    

