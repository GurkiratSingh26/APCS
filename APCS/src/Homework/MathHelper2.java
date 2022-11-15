/*Kirat Singh
APCS
29 September 2022
*/
import java.util.Scanner;
public class MathHelper2 {


    public static void main(String[] args) {

        Scanner answerInput = new Scanner(System.in);
        System.out.println("Math Questions");
        System.out.println("Enter your answer as Integers.");
        System.out.println("1: Addition\n2: Substraction\n3:Multiplication\n4:Division\n");
        System.out.print("Please enter how many time you want to play:");
        int numofquestions = answerInput.nextInt();


        for (int i = 0; i < numofquestions; i++) {
            int randonprobelm = (int) (Math.random() * 4 + 1);
            int a = (int) (Math.random() * 40 + 10);
            int b = (int) (Math.random() * 40 + 10);

            switch (randonprobelm) {
                case 1:
                    addition(a, b);
                    break;
                case 2:
                    substraction(a, b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    division(a, b);
                    break;
            }
        }

        /*Percentage formula
        int percentageoftoal = ((counter / numofquestions) * 100);
        System.out.println("Percentage:" + percentageoftoal);*/
    }

    public static int addition(int a, int b) {
        Scanner answerInput = new Scanner(System.in);
        System.out.print("What is " + a + "+" + b + ":");
        int answerIntAdd = answerInput.nextInt();
        if (answerIntAdd == a + b) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
        return answerIntAdd;
    }


    public static int substraction(int a, int b) {
        Scanner answerInput = new Scanner(System.in);
        System.out.print("What is " + a + "-" + b + ":");
        int answerIntAdd = answerInput.nextInt();
        if (answerIntAdd == a - b) {
            System.out.println("Correct");

        } else {
            System.out.println("Wrong");
        }
        return answerIntAdd;

    }

    public static int multiplication(int a, int b) {
        Scanner answerInput = new Scanner(System.in);
        System.out.print("What is " + a + "*" + b + ":");
        int answerIntAdd = answerInput.nextInt();
        if (answerIntAdd == a * b) {
            System.out.println("Correct");

        } else {
            System.out.println("Wrong");
        }
        return answerIntAdd;

    }

    public static int division(int a, int b) {
        Scanner answerInput = new Scanner(System.in);
        System.out.print("What is " + a + "/" + b + ":");
        int answerIntAdd = answerInput.nextInt();
        if (answerIntAdd == a / b) {
            System.out.println("Correct");

        } else {
            System.out.println("Wrong");
        }
        return answerIntAdd;

    }

}


