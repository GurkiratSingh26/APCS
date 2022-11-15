/*Kirat Singh
APCS
27 October 2022
*/
package fastfood;


public class fastFood {
    public static void main(String[] args) {

        Burger b = new Burger("SuperSONIC Bacon Double Cheeseburger", 77.7, 777);
        Side s = new Side("Buffalo Fires", 3.33, 333);
        Drink d = new Drink("Non-Alcoholic Beverage", 1.11, 111);
        Meal m = new Meal(b, s, d);
        //System.out.format("Your order is: %s\n Subtotal: $%5.2f and Calories: %d \n", m.orderNames(), m.totalcost(), m.totalCal());

        double cost = 0;
        double calories = 0;
        String names="";

        Meal[] ml = new Meal[10];
        String[] burgerNames = {"Hamburger", "Cheezeburger", "Double-double", "BaconBuger"};
        String[] drinkname = {"Coca-Cola", "Pepsi", "Ginger Ale"};
        String[] sidename = {"FrenchFires", "ChineseFires", "IndianFires"};

        double[] burgerprice = {1.99, 2.49, 5.09,2.23};
        double[] sidecost = {1.99, 2.49, 5.09};
        double[] drinkcost = {1.99, 2.49, 5.09};

        int[] burgeralorie = {190, 300, 450,231};
        int[] drinkcalorie = {190, 300, 450};
        int[] sidecalorie = {190, 300, 450};

        for (int i = 0; i < ml.length; i++ ) { // construction

            int ri = (int) (Math.random() * 4);
            int ci = (int) (Math.random() * 3);
            int ki = (int) (Math.random() * 3);

            Burger ba= new Burger(burgerNames[ri],burgerprice[ri],burgeralorie[ri]);
            Side sa = new Side(sidename[ci], sidecost[ci], sidecalorie[ci]);
            Drink da = new Drink(drinkname[ki], drinkcost[ki], drinkcalorie[ki]);
            Meal mealOne = new Meal(ba, sa, da);
            cost += mealOne.totalcost();
            calories += mealOne.totalCal();
            System.out.format("The order is:\n%s\nSubtotal: $%1.2f and Calories: %d\n", mealOne.orderNames(), mealOne.totalcost(), mealOne.totalCal());

        }
        System.out.format( "Total Calories: " + calories + "\nTotal prices: $%1.2f", cost);
    }
}
