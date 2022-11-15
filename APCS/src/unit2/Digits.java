/* Kirat Singh
APCS
6 October 2022
*/
package unit2;

public class Digits {
    private int num;

    public void printDigitsReverse() {
        if (num > 9) {
            Digits n = new Digits(num / 10);
            n.printDigitsReverse();
        }
        System.out.println(num % 10);

    }

    public Digits(int n) {
        num = n;
    }

    public static void main(String args[]) {
        unit2.Digits d = new unit2.Digits(1234);
        d.printDigitsReverse();

    }


}
//Other way of doing this using recursion
    /*public static void main(String args[]) {
        printDigitsReverse(1234);
    }
    public static int printDigitsReverse(int num) {
        if(num==0){
        return 0;
        }
        if (num < 10) {
            System.out.println(num);
            return num;
        } else {
            System.out.println(num % 10);
            printDigitsReverse(num / 10);
        }
        return num;
    }*/


