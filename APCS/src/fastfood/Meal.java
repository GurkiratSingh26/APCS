/*Kirat Singh
APCS
27 October 2022
*/
package fastfood;

public class Meal {
    int brugerCalories = 0;
    int sideCalorie = 0;
    int drinkCalorie = 0;
    String burgerOrder = "";
    String sideOrder = "";
    String drinkOrder = "";
    double burgerCost = 0;
    double costSide = 0;
    double costDrink = 0;


    Meal(Burger burger) {
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

