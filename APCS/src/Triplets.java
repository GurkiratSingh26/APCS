/*Kirat Singh
APCS
6 November 2022
*/
import java.util.Scanner;

public class Triplets {
    public static void main(String args[]) {
        Scanner inputnum = new Scanner(System.in);
        System.out.print("Enter the upper bound:");
        int guessnumbers = inputnum.nextInt();
        int triplearray[]=new int[3*guessnumbers];

        for(int i=0,k=1;i<triplearray.length;i+=3){
            triplearray[i]=k;
            triplearray[i+1]=k*k;
            triplearray[i+2]=k*k*k;
            k++;
        }
        for(int i=0;i<triplearray.length;i++){
            System.out.print(triplearray[i]+",");
        }


    }
}


