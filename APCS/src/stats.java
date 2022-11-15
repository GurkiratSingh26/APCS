 import java.lang.Math.*;
public class stats {

    public int[] ab;
    public int[] dis;

    public stats(int i){
        ab = new int[i];
        for(int k = 0;k<ab.length; k++){
            ab[k] = (int) (Math.random() * 1000 +1);
        }
    }
    public double average() {
        double sum = 0;
        for (int i = 0; i < ab.length; i++) {
            sum += ab[i];
        }
        return sum / 1000;
    }

    public int largest(){
        int sum = 0;
        for(int i = 0;i<ab.length; i++){
            if(ab[i] > sum){
                sum = ab[i];
            }
        }
        return sum;
    }

    public int[] distribution() {
        dis = new int[20];
        int min = 1;
        int max = 50;
        for (int i = 0; i < dis.length; i++, min += 50, max += 50) {
            for (int k = 0; k < ab.length; k++) {
                if (ab[k] > min && ab[k] < max) {
                    dis[i]++;
                }
            }
        }
        return dis;
    }
    public static void main(String[] args) {
        stats array = new stats(1000);
        System.out.println("The average is " + array.average());
        System.out.println("The largest number is " + array.largest());
        int min = 1;
        int max = 50;
        for(int k = 0; k<array.distribution().length; k++, min +=50, max +=50){
            System.out.println("There are " + min + " - " + max + ": " + array.distribution()[k]);
        }

    }
}

