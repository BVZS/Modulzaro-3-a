
package main;

import java.util.Arrays;
import java.util.Random;

public class MindentTudoGep {
    private int[] lottoSzamok = new int[5];
    private char[] totoEredmenyek = new char[14];
    private String[][] zenek;
    
    Random rnd = new Random();
    
    public MindentTudoGep() {
        // lottó
        for (int i = 0; i < lottoSzamok.length; i++) {
            while (true) {
                int number = rnd.nextInt(90) + 1;
                if (!tartalmazza(lottoSzamok, number)) {
                    lottoSzamok[i] = number;
                    break;
                }
            }
        }
        
        // totó
        for (int i = 0; i < totoEredmenyek.length; i++) {
            char eredmeny = '1';
            switch (rnd.nextInt(3)) {
                case 0:
                    eredmeny = '1';
                    break;
                case 1:
                    eredmeny = '2';
                    break;
                case 2:
                    eredmeny = 'x';
                    break;
            }
            totoEredmenyek[i] = eredmeny;
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
    
    public String totoMegjelenit() {
        String str = "mérkőzések: 1 2 3 4 5 6 7 8 9 10 11 12 13 13+1\n";
        str += "eredmények: %c %c %c %c %c %c %c %c %c %2c %2c %2c %2c %4c".formatted(
            this.totoEredmenyek[0],
            this.totoEredmenyek[1],
            this.totoEredmenyek[2],
            this.totoEredmenyek[3],
            this.totoEredmenyek[4],
            this.totoEredmenyek[5],
            this.totoEredmenyek[6],
            this.totoEredmenyek[7],
            this.totoEredmenyek[8],
            this.totoEredmenyek[9],
            this.totoEredmenyek[10],
            this.totoEredmenyek[11],
            this.totoEredmenyek[12],
            this.totoEredmenyek[13]
        );
        return str;
    }
}
