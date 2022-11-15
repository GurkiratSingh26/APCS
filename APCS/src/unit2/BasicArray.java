package unit2;
import java.lang.Math;

public class BasicArray {
    public static void main(String args[]){
        int[] ia = new int[20];
        for(int i=0;i<ia.length;i++){
            ia[i] = (int) (Math.random() * 99 + 1);
            //System.out.println(ia[i]);
        }
        int sum=0;
        for(int i=ia.length-1;i>=0;i--){
            sum+=ia[i];
        }
        System.out.println("Avg: "+sum/ia.length);
        String[] sa={"dsgdgsf","hgesdr","dfsfssffs","srgfd","dgssgefsdgs"};
        for (int i=0;i<sa.length;i++) {
            int l=sa[i].length();
            System.out.println(sa[i]+" has "+l+" letters");
        }
    }
}
