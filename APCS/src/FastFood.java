/*Kirat Singh
APCS
23 October 2022
*/
class Burger {
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
class Side {

    String sidename = "";
    double sidecost = 0;
    int sidecalorie = 0;

    Side(String sn, double dcst, int dcal) {
        sidename = sn;
        sidecost = dcst;
        sidecalorie = dcal;
    }
    Side() {
    }


    String getSide() {
        return sidename;
    }

    int getCalorie() {
        return sidecalorie;
    }
    double getPrice() {
        return sidecost;
    }


}

class Drink {

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
class Meal {
    int brugerCalories = 0;
    int sideCalorie = 0;
    int drinkCalorie = 0;
    String burgerOrder = "";
    String sideOrder = "";
    String drinkOrder = "";
    double burgerCost = 0;
    double costSide = 0;
    double costDrink = 0;


    Meal() {
    }

    Meal(Burger b, Side s, Drink d) {
        sideOrder = s.getSide();
        costSide = s.getPrice();
        sideCalorie = s.getCalorie();
        burgerOrder = b.getBurger();
        burgerCost = b.getPrice();
        brugerCalories = b.getCalorie();
        drinkOrder = d.getDrink();
        costDrink = d.getPrice();
        drinkCalorie = d.getCalorie();
    }

    String orderNames() {
        return "\n- " + burgerOrder + "\n- " + sideOrder + "\n- " + drinkOrder;
    }
    double totalcost() {
        return costSide + burgerCost + costDrink;
    }
    int totalCal() {
        return  sideCalorie + drinkCalorie + brugerCalories;
    }
}

public class FastFood {
    public static void main(String[] args) {

        Burger b = new Burger("SuperSONIC Bacon Double Cheeseburger", 77.7, 777);
        Side s = new Side("Buffalo Fires", 3.33, 333);
        Drink d = new Drink("Non-Alcoholic Beverage", 1.11, 111);
        Meal m = new Meal(b, s, d);
        System.out.format("Your order is: %s\n Subtotal: $%5.2f and Calories: %d", m.orderNames(), m.totalcost(), m.totalCal());
    }
}



