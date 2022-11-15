/*Kirat Singh
APCS
16 September 2022
*/
import java.util.*;

public class Combination {
    public static void main(String args[]) {
        Scanner valueofcnr = new Scanner(System.in);
        System.out.print("Please enter value for n:");
        double valueofn = valueofcnr.nextDouble();
        System.out.print("Please enter value for r:");
        double valueofr = valueofcnr.nextDouble();
        double numintital=1;
        double denintial=1;
        if (valueofn < valueofr || valueofn == 0) {
            System.out.print("Try again with valid question.");
            return;
        }
        for (double i = valueofr; i >= 1; i--) {
            numintital = numintital * valueofn--;
            denintial = denintial * i;
        }

        System.out.print("The combination of the question is: "+numintital / denintial);
    }
}



