package Homework;

import java.lang.Math;

public class Fraction {
    private int num;
    private int denominator;

   public void fractionofnum(){
       Fraction n = new Fraction(num/5);
       n.fractionofnum();
       System.out.print(num);

   }
   public Fraction(int n){
       num=n;

   }

    public static void main(String args[]) {
        

    }

   }

