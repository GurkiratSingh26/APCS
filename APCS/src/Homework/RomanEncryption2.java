package Homework;

/*Kirat Singh
APCS
26 September 2022
*/
public class RomanEncryption2 {
    public static void main(String args[]) {
        System.out.print("The encrypted message is: ");
        String code = encrypt("C", 2);
        System.out.println(code.substring(0, 0));
        System.out.print("The decrypted message is: ");
        String decryptcode = decrypt("E", 2);
        System.out.print(decryptcode);

    }

    public static String encrypt(String nouppercodein, int codeshift) {
        String encrypting = "";
        for (int i = 0; i < nouppercodein.length(); i++) {
            char character = nouppercodein.charAt(i);
            int ascii = (int) character + codeshift;
            if (ascii < 90) {
                char convertedChar = (char) ascii;
                System.out.print(convertedChar);
            }
            if (ascii > 90) {
                int differnceofnum = ascii - 90;
                ascii = 90 - 26 + differnceofnum;
                char convertedChar = (char) ascii;
                System.out.print(convertedChar);
            }
            encrypting += character;
        }
        return encrypting;
    }


    public static String decrypt(String nouppercodein, int codeshift) {
        String decrytping = "";

        for (int i = 0; i < nouppercodein.length(); i++) {
            char character = nouppercodein.charAt(i);
            int ascii = (int) character - codeshift;
            if (ascii < 90) {
                char convertedChar = (char) ascii;
                System.out.print(convertedChar);
            }
            if (ascii > 90) {
                if (ascii < 65) {
                    int differnceofnum = 90 - ascii;
                    ascii = 64 + differnceofnum;
                    char convertedChar = (char) ascii;
                    System.out.print(convertedChar);
                }
                decrytping += character;
            }
        }
        return decrytping;
    }
}



