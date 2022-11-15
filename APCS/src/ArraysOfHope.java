/*Kirat Singh
APCS
7 November 2022
*/
public class ArraysOfHope {
    public static void main(String args[]){
        char[] alphabetarray=new char[26];

        for(int i=0;i<26;i++){
            alphabetarray[i] = (char) (i+65);
        }
        for( char c: alphabetarray){
            //System.out.print(c + ",");
        }


        char ch[]=new char[26];
        String str="HOPE";

        for(int i=65;i<=90;i++){
            ch[i-65]=(char)i;
        }
        int[] code=new int[str.length()];
        for(int i=0;i<code.length;i++){
            code[i]=str.charAt(i)-'A';
        }

        for(int i=0;i<code.length;i++){
            System.out.print(ch[code[i]]);
        }
        System.out.println("");
        int shift=3;
        for(int i=0;i<code.length;i++){
            code[i]=(code[i]+shift)%26;
            System.out.print(ch[code[i]]);
        }
    }
}
