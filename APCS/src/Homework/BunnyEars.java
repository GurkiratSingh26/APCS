/*Kirat Singh
APCS
27 September 2022
 */
public class BunnyEars {
    public static void main(String args[]){
        System.out.print(countEars(6));

    }
    public static int countEars(int n){
        if(n==1) return 2;
        if(n%2==0){
            return 2+countEars(n-1);
        }
        else{
            return 1+countEars(n-1);
        }

    }
}
