/*Kirat Singh
APCS
1 November 2022
*/

import java.util.Arrays;
import java.util.Scanner;

public class MasterMind {
    private char[] cha;
    private int numGuess;

    private String guessname;
    final static String[] wordPool = {"JESUS", "WORLD", "BOBBY", "ADAMS", "EMILY"}; // final will not change

    public MasterMind() {
        int i = (int) (Math.random() * wordPool.length);
        String word = wordPool[i];
        cha = new char[word.length()];
        for (int j = 0; j < word.length(); j++) {
            cha[j] = word.charAt(j);
        }
        numGuess = 0;
    }

    /**
     * int exactMatch(String guess)
     * pre: guess is a string (not null)
     * post: return the number of exact matches
     */
    public int exactMatch(String guessname) {
        char[] guessnamechar = new char[guessname.length()];

        for (int i = 0; i < guessname.length(); i++) {
            guessnamechar[i] = guessname.charAt(i);
        }
        boolean retval = Arrays.equals(cha, guessnamechar);
        if (retval == true) {
            System.out.println("Good Job you guessed it right!");
        } else {
            System.out.println("Not exact match!");
        }
        return 5;
    }

    public int anyMatch(String guessname) {
        char[] guessnamechar = new char[guessname.length()];
        for (int i = 0; i < guessname.length(); i++) {
            guessnamechar[i] = guessname.charAt(i);
        }
        boolean retval = Arrays.equals(cha, guessnamechar);
        String chararrytosrting = String.valueOf(cha);
        String guessnametosrting = String.valueOf(guessnamechar);

        if (retval == false) {
            int character = 0;
            for (int i = 0; i < chararrytosrting.length(); i++) {
                if (guessnametosrting.indexOf(chararrytosrting.charAt(i)) >= 0) {
                    character += 1;
                } else {
                    character += 0;
                }
            }
            System.out.println("Number of matching characters are: " + character + "\n");
        }
        return 0;
    }


    public static void main(String args[]) {
        MasterMind m = new MasterMind();
        m.exactMatch("WORLD");
        m.anyMatch("WORLD");

        Scanner kb = new Scanner(System.in);


        while (true) {
            System.out.print("Enter guessed word:");
            String guessnumbers = kb.next();
            char[] guessnamechar = new char[guessnumbers.length()];
            for (int i = 0; i < guessnumbers.length(); i++) {
                guessnamechar[i] = guessnumbers.charAt(i);
            }
            boolean retval = Arrays.equals(m.cha, guessnamechar);
            String chararrytosrting = String.valueOf(m.cha);
            String guessnametosrting = String.valueOf(guessnamechar);

            int character = 0;
            if (retval == false) {
                for (int i = 0; i < chararrytosrting.length(); i++) {
                    if (guessnametosrting.indexOf(chararrytosrting.charAt(i)) >= 0) {
                        character += 1;
                    } else {
                        character += 0;
                    }
                }
                m.numGuess++;
                System.out.println("Number of matching characters are: " + character);

            } else {
                m.numGuess++;
                System.out.println("Good Job you guessed it right!");
                System.out.println("Total tries: " + m.numGuess);

                break;
            }
        }
    }

}
