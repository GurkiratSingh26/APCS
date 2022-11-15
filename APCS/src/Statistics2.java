/*Kirat Singh
APCS
30 October 2022
*/

import java.util.*;
import java.lang.Math;

public class Statistics2 {

    private int[] randomNum;
    private int[] distributionNum;

    public Statistics2(int i) {
        randomNum = new int[i];
        Random ran = new Random();
        for (int f = 0; f < randomNum.length; f++) {
            randomNum[f] = (int) (ran.nextGaussian() * 125 + 500);//500 is the middle point
        }
    }

    public double averageNum() {
        double sum = 0;
        for (int f = 0; f < randomNum.length; f++) {
            sum += randomNum[f];
        }
        return sum / randomNum.length;
    }

    public int largestNum() {
        int sum = 0;
        for (int f = 0; f < randomNum.length; f++) {
            if (randomNum[f] > sum) {
                sum = randomNum[f];
            }
        }
        return sum;
    }

    public int[] distributionNum() {
        distributionNum = new int[20];
        int min = 1;
        int max = 50;
        for (int i = 0; i < distributionNum.length; i++, min += 50, max += 50) {
            for (int f = 0; f < randomNum.length; f++) {
                if (randomNum[f] > min && randomNum[f] < max) {
                    distributionNum[i]++;
                }
            }
        }
        return distributionNum;
    }

    public static void main(String[] args) {
        Statistics2 array = new Statistics2(1000);
        System.out.println("The average number:" + array.averageNum());
        System.out.println("The largest number: " + array.largestNum());
        int[] freq = array.distributionNum();
        for (int f = 0; f < freq.length; f++) {
            //System.out.println("The numbers from " + f*50+ " - " + (f+1)*50 + " are: " + freq[f]);
            for (int i = 0; i < freq[f]; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}








