/*Kirat Singh
APCS
12 October 2022
*/
package RectangleInfo;


public class Rectangle {

    private double length;
    private double width;


    public void setLength(double l) {
        length = l;
    }

    public void setWidth(double w) {
        width = w;
    }

    //Area of Rectangle
    public Rectangle areaofreactangle(Rectangle other) {
        int number = (int) (length * width);
        int number2 = (int) (other.length * other.width);
        return new Rectangle(number, number2);
    }
    //Parameter of Rectangle
    public double Parameterofreactangle() {
        return (length + width) * 2;
    }

    public Rectangle() {
        length = 0;
        width = 0;
    }


    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }


    //toString() to return the string output
    public String toString() {
        return length + "*" + width;
    }

    public double evalArea() {
        return (double) length * width;
    }

    public boolean equals(Object ob) {
        Rectangle other = (Rectangle) ob;
        return evalArea() == other.evalArea();

    }

}






