/*Kirat Singh
APCS
27 October 2022
*/
package fastfood;

public class Side {

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

