/*Kirat Singh
APCS
17 October 2022
*/
package AutomobileGasMilage;

public class TesterAutomobile {
    public static void main( String args[] )
    {

//Create a new object called myBmw. Pass the constructor an
//argument of 24 miles per gallon
        Automobile myBmw = new Automobile(24);
//Use the myBmw object to call the fillup method. Pass it an argument
//of 20 gallons.
        myBmw.fillUp(20);
//Use the myBmw object to call the takeTrip method. Pass it an
//argument of 100 miles. Driving 100 miles of course uses fuel and we
//would now find less fuel in the tank.
        myBmw.takeTrip(100);
//Use the myBmw object to call the reportFuel method. It returns a
//double value of the amount of gas left in the tank and this is assigned
// to the variable fuel_left
        double fuel_left = myBmw.reportFuel( );
//Print the fuel_left variable
        System.out.format ("Gallons Left: %30.15f \n",fuel_left); //prints gallons left, 15.833333333333332

        Automobile myexpensivecar = new Automobile(34);
//Use the myBmw object to call the fillup method. Pass it an argument
//of 34 gallons.
        myexpensivecar.fillUp(61);
//Use the myBmw object to call the takeTrip method. Pass it an
//argument of 61 miles. Driving 100 miles of course uses fuel and we
//would now find less fuel in the tank.
        myexpensivecar.takeTrip(69);
//Use the myBmw object to call the reportFuel method. It returns a
//double value of the amount of gas left in the tank and this is assigned
// to the variable fuel_left
        double fuel_left_is = myexpensivecar.reportFuel( );
//Print the fuel_left variable
        System.out.format ("Gallons Left are left: %30.15f \n",fuel_left_is); //prints gallons left, 15.833333333333332

    }
}
