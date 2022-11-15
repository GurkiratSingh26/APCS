/*Kirat Singh
APCS
21 September 2022
*/
public class PrintShapes {
    public static void main(String args[]) {
        printParallelogram('$', 5, 7);
        printTriangle('#',5);


    }

    public static void printspace(int n) {
        for (int a = 0; a < n; a++) {
            System.out.print(" ");
        }

    }

    public static void printsigns(char ch, int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(ch);
        }

    }

    public static void printParallelogram(char ch, int height, int length) {
        for (int z = 0; z < height; z++) {
            printspace(height - z);
            printsigns(ch, length);
            System.out.println("");
        }

    }
    public static void printTriangle(char ch,int rows){

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2)-1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

}








