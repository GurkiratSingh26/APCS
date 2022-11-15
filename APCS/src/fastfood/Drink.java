/*Kirat Singh
APCS
27 October 2022
*/
package fastfood;

public class Drink {

    String drinkname = "";
    double drinkcost = 0;
    int drinkcalorie = 0;

    Drink(String dn, double dcst, int dcal) {
        drinkname = dn;
        drinkcost = dcst;
        drinkcalorie = dcal;
    }
    Drink() {
    }

    String getDrink() {
        return drinkname;
    }

    double getPrice() {
        return drinkcost;
    }

    int getCalorie() {
        return drinkcalorie;
    }

}