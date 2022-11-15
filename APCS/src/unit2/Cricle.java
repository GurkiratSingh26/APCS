package unit2;

public class Cricle{
    private double radius;
    public static int numofCookies=0;
    public void setradius(double r){
        radius=r;
        numofCookies ++;
    }
    public static void areaFormula(){
        System.out.println("Area of cricle is pie*R^2");
    }
    public double circumference(){
        return 2*radius*Math.PI;
    }
    public double areaofcricle(){
        return radius*radius*Math.PI;
    }
    //Constructer
    public Cricle(){
        radius=0;

    }
    //Overriding/Overruling
    public Cricle(double r){
        radius=r;

    }

    private double diameter(){
        return 2*radius;
    }
}