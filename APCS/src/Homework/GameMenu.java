//Kirat Singh
//APCS
//31 August 2022

import java.util.Scanner;
public class GameMenu {
    public static void main(String args[]){
        System.out.println("Choose from the follwing:");
        System.out.print("A: Do math\nB: Even/Odd number check\n");
        Scanner inputofnum = new Scanner(System.in);
        System.out.print("Choose one of the options:");
        char ch =  inputofnum.nextLine().charAt(0);
        switch (ch){
            case'A':
                System.out.print("What is 3+4:");
                int domath= inputofnum.nextInt();
                if (domath==7){
                    System.out.print("Good");
                }
                else{
                    System.out.print("Stop Playing and go study");
                }
                break;

            case 'B':
                System.out.print("Enter a number to check if its even:");
                int evennum = inputofnum.nextInt();
                if(evennum%2==0){
                    System.out.print("Even number");
                }
                else{
                    System.out.print("Odd number");
                }
                break;

        }

    }
}
