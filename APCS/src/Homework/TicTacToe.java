/*Kirat Singh
APCS
14 September 2022
 */
public class TicTacToe {
    public static void main(String args[]) {
        String tictactoe = "OXOXOOXXO";

        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(tictactoe.charAt(i*3+j) + "|");

            }
            System.out.println();
        }
    }


}





