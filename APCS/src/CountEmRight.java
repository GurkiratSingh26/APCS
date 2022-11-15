/*Kirat Singh
APCS
25 October 2022
*/

import java.util.*;

public class CountEmRight {
    public static void main(String args[]) {
        boolean breakingbool = true;
        Scanner strinput = new Scanner(System.in);
        while (breakingbool) {
            System.out.print("Type in a sentence and press ENTER. His initials are: ");
            String enterstring = strinput.nextLine();
            String upperinput = enterstring.toUpperCase();
            String inputString = upperinput.replaceAll(" ", "");
            if (inputString.equals("EXIT")) {
                breakingbool = false;
                //break;
            } else {
                inputString += " ";
                String[] saIndentify = inputString.split("SA");
                System.out.print("There are " + (saIndentify.length - 1) + " occurrence."+"\n");
            }
        }
    }
}
