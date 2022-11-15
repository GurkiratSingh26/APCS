/*Kirat Singh
APCS
12 September 2022
*/
import java.util.*;
import java.lang.Math;

public class SmallBigGame {
    public static void main(String args[]) {
        Scanner moneyInput = new Scanner(System.in);
        int initialMoneyOfUser = 100;
        int initialMoneyOfComp = 100;
        String SmallNum = "Small";
        String bignum = "Big";
        int draw=7;

        while (initialMoneyOfUser>0&&initialMoneyOfComp>0) {
            System.out.println("Gambling game.");
            System.out.print("Enter your bet:");
            int moneytobet = moneyInput.nextInt();
            System.out.print("Enter Small or Big to bet:");
            String bigSmallnum = moneyInput.next();
            int randintOne = (int) (Math.random() * 6 + 1);
            System.out.println("Dice One is:" + randintOne);
            int randintTwo = (int) (Math.random() * 6 + 1);
            System.out.println("Dice Two is:" + randintTwo);
            int randint = randintOne + randintTwo;

            if (bigSmallnum.equals(SmallNum)) {
                if (randint < 7) {
                    initialMoneyOfUser = initialMoneyOfUser + moneytobet;
                    System.out.println("You won, and current money is:" + initialMoneyOfUser);

                } else {
                    initialMoneyOfComp = initialMoneyOfComp + moneytobet;
                    System.out.println("Computer won:" + initialMoneyOfComp);
                    initialMoneyOfUser = initialMoneyOfUser - moneytobet;
                    System.out.println("You lost, and current money is:" + initialMoneyOfUser);
                }
            } else if (bigSmallnum.equals(bignum)) {
                if (randint > 7) {
                    initialMoneyOfUser = initialMoneyOfUser + moneytobet;
                    System.out.println("You won, and current money is:" + initialMoneyOfUser);
                } else {
                    initialMoneyOfComp = initialMoneyOfComp + moneytobet;
                    System.out.println("Computer won:" + initialMoneyOfComp);
                    initialMoneyOfUser = initialMoneyOfUser - moneytobet;
                    System.out.println("You lost, and current money is:" + initialMoneyOfUser);

                }
            } else if (bigSmallnum.equals(bignum) ||bigSmallnum.equals(SmallNum)) {
                if (randint == draw) {
                    System.out.print("Tie try again");
                }
            }
        }
        if (initialMoneyOfUser<initialMoneyOfComp){
            System.out.print("Your lost all the money");
        }
        else{
            System.out.print("Computer lost all the money");
        }
    }
}



