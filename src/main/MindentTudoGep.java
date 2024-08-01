
package main;

import java.util.Arrays;
import java.util.Random;

public class MindentTudoGep {
    private int[] lottoSzamok = new int[5];
    private String[] totoEredmenyek;
    private String[][] zenek;
    
    Random rnd = new Random();
    
    public MindentTudoGep() {
        for (int i = 0; i < lottoSzamok.length; i++) {
            while (true) {
                int number = rnd.nextInt(90) + 1;
                if (!tartalmazza(lottoSzamok, number)) {
                    lottoSzamok[i] = number;
                    break;
                }
            }
        }
    }
    
    private static boolean tartalmazza(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    
    public String lottoMegjelenit() {
        Arrays.sort(this.lottoSzamok);
        
        String str = "Lottószámok: ";
        for (int i = 0; i < this.lottoSzamok.length; i++) {
            str += lottoSzamok[i] + ", ";
        }
        
        return str.substring(0, str.length() - 2);
    }
}
