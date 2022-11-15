/*Kirat Singh
APCS
16 September 2022
*/
import java.util.*;

public class CompoundInterest {
    public static void main(String args[]) {
        Scanner compoundIntrest = new Scanner(System.in);
        System.out.print("Enter the Principle:");
        double principle = compoundIntrest.nextDouble();
        System.out.print("Enter the Rate:");
        double rate = compoundIntrest.nextDouble();
        double targetcompoundInt=principle*2;
        int time =0;

        while (principle < targetcompoundInt) {
            time++;
            double intrestofp=principle*rate/100;
            principle+=intrestofp;
        }
        System.out.print("It will take is "+time+" years.");
        }



    }







