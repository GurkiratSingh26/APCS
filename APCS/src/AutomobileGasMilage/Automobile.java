/*Kirat Singh
APCS
17 October 2022
*/
package AutomobileGasMilage;

public class Automobile {
    private double gallons;
    private double mpg;
    public Automobile(double m){
        mpg = m;
        gallons=0;
    }
    public void fillUp (double fuel) {
        gallons+=fuel;
    }
    public void takeTrip (double triplen) {
        gallons = gallons-(triplen/mpg);
    }
    public double reportFuel() {
        return gallons;
    }

}
