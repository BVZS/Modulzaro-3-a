
package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MindentTudoGep {
    private int[] lottoSzamok = new int[5];
    private char[] totoEredmenyek = new char[14];
    private String[][] zenek = {
        {"Rock", "Bohemian Rhapsody", "Stairway to Heaven", "Smells Like Teen Spirit"},
        {"Hip Hop", "Lose Yourself", "Juicy", "Heaven and Hell"},
        {"Techno", "One More Time", "Sandstorm", "Tension"}
    };
    
    Random rnd = new Random();
    Scanner sc = new Scanner(System.in);
    
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
    
    public void zeneKeres() {
        System.out.println("Milyen műfajból ajánljak zenét? (Rock, Hip Hop, Techno)");
        String valasz = sc.nextLine();
        
        while(!valasz.equals("Rock") && !valasz.equals("Hip Hop") && !valasz.equals("Techno")) {
            System.out.println("Hibás műfajt adtál meg!\nMilyen műfajból ajánljak zenét? (Rock, Hip Hop, Techno)");
            valasz = sc.nextLine();
        }
        
        if(valasz.equals("Rock")) {
            System.out.println(zenek[0][rnd.nextInt(zenek[0].length-1)+1]);
        }
        else if(valasz.equals("Hip Hop")) {
            System.out.println(zenek[1][rnd.nextInt(zenek[1].length-1)+1]);
        }
        else if(valasz.equals("Techno")) {
            System.out.println(zenek[2][rnd.nextInt(zenek[2].length-1)+1]);
        }
    }
}
