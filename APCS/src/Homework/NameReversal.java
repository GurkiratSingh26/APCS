//Kirat Singh
//APCS
//7 September 2022
import java.util.*;
public class NameReversal {
    public static void main(String args[]){
        Scanner nameInput = new Scanner(System.in);
        System.out.print("Please enter your name.");
        String nameOfUser = nameInput.nextLine();
        nameOfUser = nameOfUser.toLowerCase();
        String nameReversed = "";

        for(int i = nameOfUser.length()-1; i>=0; i--) {
            nameReversed = nameReversed + nameOfUser.charAt(i);
        }
        System.out.print(nameReversed);






        }

}
