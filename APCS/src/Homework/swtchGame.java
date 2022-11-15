import java.util.Scanner;
public class swtchGame {
    public static void main(String args[]){

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a even number under 50");
        int ch =  kb.nextLine().charAt(0);
        switch (ch){
            case'A':
                System.out.println("Your are among the majority.");
                break;
            case 'B':
                System.out.println("You are weird.");
                break;
            case 'C':
                System.out.println("You are a minion.");
                break;
            case 'D':
                System.out.println("You are Ellen.");
                break;
            default:
                System.out.println("You hate ice-cream.");
                break;

        }
    }
}
