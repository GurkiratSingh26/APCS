/*Kirat Singh
APCS
27 October 2022
*/
package fastfood;

public class Burger {
    String burgername = "";
    int burgeralorie = 0;
    double burgerprice = 0;

    Burger(String bn, double bcst, int bcal) {
        burgername = bn;
        burgerprice = bcst;
        burgeralorie = bcal;
    }

    Burger() {
    }

    double getPrice() {
        return burgerprice;
    }

    int getCalorie() {
        return burgeralorie;
    }
    String getBurger() {
        return burgername;
    }



}