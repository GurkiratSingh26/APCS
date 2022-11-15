public class Runner {
    public static void main(String[] args) {
        int a = 0;
        int b = a++,c=a;
        c--;
        --c;
        c=c+1;
        b=b+10;
        b-=2;
        b+=5;
        b=b%3;
        System.out.println(a+" " + b +" " +c);

        int d= (2+1000)%7;
        System.out.print(d);


    }
}
