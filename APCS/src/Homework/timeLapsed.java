//Kirat Singh
//APCS
//29 August 2022
import java.util.Scanner;

public class timeLapsed {
    public static void main(String args[]){
        Scanner enterTime = new Scanner (System.in);
        System.out.print("Enter Current Hour: ");
        int currenthoursEnter = enterTime.nextInt();
        System.out.print("Enter Current Minute: ");
        int currentminutesEnter = enterTime.nextInt();
        System.out.print("Enter the time to be passed in minutes:");
        int timepass = enterTime.nextInt();

        currenthoursEnter+=(currentminutesEnter+timepass)/60;

        currentminutesEnter = (currentminutesEnter+timepass)%60;

        System.out.println("The end time will be "+currenthoursEnter +":"+ currentminutesEnter);



    }
}
