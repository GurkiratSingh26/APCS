//Kirat Singh
//APCS
//30 August 2022

import java.util.*;
import java.lang.Math;
public class GuessNumModify {
    public static void main(String args[]) {
        System.out.println("Guess the number which is between 1-20.");
        int randint = (int) (Math.random() * 20 + 1);

        while(true){
            Scanner guessNumber = new Scanner(System.in);
            System.out.print("Enter the number you guessed:");
            int guessthenumber = guessNumber.nextInt();

            if(guessthenumber == randint) {
                System.out.println("Good job your guess is right");
                break;
            }
            else{
                if(randint<=5){
                    System.out.println("Pick number under 5");
                }
                else if(randint<=10){
                    System.out.println("Pick number under 10");
                }
                else if(randint>=15){
                    System.out.println("Pick number over 15");
                }
            }
        }
    }
}
