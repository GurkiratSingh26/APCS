/*Kirat Singh
APCS
28 October 2022
*/
public class Statistics {
    public int[] randomNum;
    public int[] distributionNum;

    public Statistics(int i){
        randomNum = new int[i];
        for(int f = 0;f<randomNum.length; f++){
            randomNum[f] = (int) (Math.random() * 1000 +1);
        }
    }
    public double averageNum() {
        double sum = 0;
        for (int f = 0; f < randomNum.length; f++) {
            sum += randomNum[f];
        }
        return sum / 1000;
    }

    public int largestNum(){
        int sum = 0;
        for(int f = 0;f<randomNum.length; f++){
            if(randomNum[f] > sum){
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
        Statistics array = new Statistics(1000);
        System.out.println("The average number:" + array.averageNum());
        System.out.println("The largest number: " + array.largestNum());
        int min = 1;
        int max = 50;
        for(int f = 0; f<array.distributionNum().length; f++, min +=50, max +=50){
            System.out.println("The numbers from " + min + " - " + max + " are: " + array.distributionNum()[f]);
        }
    }
}

