/*Kirat Singh
APCS
20 September 2022
*/
public class Tester {
    public static void main(String args[]){
        System.out.println("Decimal     Binary     Octal     Hex     Character") ;
        for(int j=65;j<=90;j++){
            System.out.print("  " + j + "       ") ;
            System.out.print(Integer.toBinaryString(j) + "     ") ;
            System.out.print(Integer.toOctalString(j) + "      ") ;
            System.out.print(" "+Integer.toHexString(j) +"          ") ;
            System.out.println(((char)j)) ;
        }
    }
}


