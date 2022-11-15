
import java.util.*;
import java.lang.Math;

public class trying {
    public static void main(String args[]) {
        Scanner moneyInput = new Scanner(System.in);
        int initialMoneyOfUser = 100;
        int initialMoneyOfComp = 100;
        String SmallNum = "Small";
        String bignum = "Big";

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

            if (SmallNum == "Small") {
                if (randint < 7) {
                    initialMoneyOfUser = initialMoneyOfUser + moneytobet;
                    System.out.println("You won, and current money is:" + initialMoneyOfUser);

                } else {
                    initialMoneyOfComp = initialMoneyOfComp + moneytobet;
                    System.out.println("Computer won:" + initialMoneyOfComp);
                    initialMoneyOfUser = initialMoneyOfUser - moneytobet;
                    System.out.println("You lost, and current money is:" + initialMoneyOfUser);
                }
            } else if (bignum == "Big") {
                if (randint > 7) {
                    initialMoneyOfUser = initialMoneyOfUser + moneytobet;
                    System.out.println("You won, and current money is:" + initialMoneyOfUser);
                } else {
                    initialMoneyOfComp = initialMoneyOfComp + moneytobet;
                    System.out.println("Computer won" + initialMoneyOfComp);
                    initialMoneyOfUser = initialMoneyOfUser - moneytobet;
                    System.out.println("You lost, and current money is:" + initialMoneyOfUser);

                }
            } else if (bignum == "Big" || SmallNum == "Small") {
                    if (randint == 7) {
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



