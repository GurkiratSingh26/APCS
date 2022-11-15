import java.util.*;
public class swtch {
    public static void main(String args[]){
        System.out.println("A: strawberry\nB:chili\nC:Banana\nD:Cholo-chip");
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter from the option:");
        char ch =  kb.nextLine().charAt(0);
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
