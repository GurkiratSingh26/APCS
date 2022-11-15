/*Kirat Singh
APCS
10 October 2022
*/

public class Fraction {
    private int nuemo;
    private int deno;

    public void division() {
        System.out.println(nuemo +"/"+ deno);
    }
    public void eval(){
        double evalnum = (double)(nuemo/ deno);
        System.out.println (evalnum);
    }
    public Fraction addition(Fraction other){
        int denominator=deno*other.deno;
        int num1=nuemo*other.deno;
        int num2=other.nuemo*deno;
        int numerator=num1+num2;
        Fraction result=new Fraction(numerator,denominator);
        return result;
    }

    public Fraction(int n,int d) {
        nuemo = n;
        deno=d;
    }

    public static void main(String args[]) {
        Fraction d = new Fraction(4,2);
        d.division();
        Fraction e = new Fraction(4,2);
        e.eval();
        Fraction c = new Fraction(2,3);

        Fraction f2=c.addition(new Fraction(2,1));
        f2.division();
    }

}
