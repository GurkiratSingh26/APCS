/*Kirat Singh
APCS
20 September 2022
*/
package Homework;
import java.util.*;

public class RomanEncryption {
    public static void main(String args[]) {
        Scanner inputofvalue = new Scanner(System.in);
        System.out.print("Enter the secret code:");
        String codeinput = inputofvalue.nextLine();
        String uppercodeinput = codeinput.toUpperCase();
        String nouppercodein = uppercodeinput.replaceAll("\\s", "");


        System.out.print("Enter the that you want to shift:");
        int codeshift = inputofvalue.nextInt();


        for (int i = 0; i < nouppercodein.length(); i++) {
            char character = nouppercodein.charAt(i);
            int ascii = (int) character + codeshift;
            if(ascii<90) {
                char convertedChar = (char) ascii;
                System.out.print(convertedChar);
            }
            if (ascii > 90) {
                int differnceofnum = ascii - 90;
                ascii = 90-26+differnceofnum;
                char convertedChar = (char) ascii;
                System.out.print(convertedChar);

            }
        }
    }
}
