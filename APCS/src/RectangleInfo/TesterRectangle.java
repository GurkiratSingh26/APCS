/*Kirat Singh
APCS
12 October 2022
*/
package RectangleInfo;


public class TesterRectangle {
    public static void main(String[] args) {


        Rectangle s1 = new Rectangle(2, 4);
        System.out.println("Area: " + s1);

        Rectangle s2 = new Rectangle(2, 3);
        Rectangle s3 = new Rectangle(3, 2);

        if (s2.equals(s3)) {

            System.out.println("Yes, same area.");

        } else {

            System.out.println("No, not the same area.");

        }
        /*Rectangle r3 = new Rectangle(5,8);
        System.out.println("Parameter:"+r3.Parameterofreactangle());*/


    }
}
