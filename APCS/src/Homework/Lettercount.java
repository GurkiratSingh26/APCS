public class Lettercount {
    public static void main(String arrgs[]){
        String count=("ThE 1 2 sTring");

        int digits = 0;
        int lower=0;
        int upper=0;
        for (int i = 0; i < count.length(); i++) {
            if (count.charAt(i) >= 48 && count.charAt(i) <= 57)
                digits++;
        }
        System.out.println("Total digits" + digits);

        for (int i = 0; i < count.length(); i++) {
            if (count.charAt(i) >= 65 && count.charAt(i) <= 90)
                upper++;
        }
        System.out.println("Total upper:" + upper);
        for (int i = 0; i < count.length(); i++) {
            if (count.charAt(i) >= 97 && count.charAt(i) <= 122)
                lower++;
        }
        System.out.println("Total lower:" + lower);

    }
}

