import java.lang.Math;
public class typeCasting {
    public static void main(String args[]){
    int grade = 78;
    if (grade <=100 && grade>=90){
        System.out.print("A");
    }
    else if(grade>=80){
        System.out.print("B");
    }
    else{
        double avg = (double) grade /7;
        int roungavg = (int) (0.5 + avg);
        double tenthAvg = (int)(avg * 10 +0.5)/10.0;
        System.out.println(avg + " " + roungavg +" " + tenthAvg);
    }

    double randomN = Math.random();
    //System.out.println(randomN);// Decimal between 0 and 1

    int randint= (int)(randomN * 3 +1); //how many do u need, smallest number
    System.out.println(randint);






}
}
