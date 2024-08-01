
package main;

public class Vonal {
    private int hossz;
    private int eltolas;
    private Szinek szin;
    private Stilusok stilus;
    
    public enum Szinek { PIROS, KEK, ZOLD };
    public enum Stilusok { DUPLA, SZIMPLA, PONT };
    
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public Vonal(int hossz) throws IllegalArgumentException {
        this(hossz, 0, Szinek.PIROS, Stilusok.SZIMPLA);
    }
    
    public Vonal(int hossz, int eltolas) throws IllegalArgumentException {
        this(hossz, eltolas, Szinek.PIROS, Stilusok.SZIMPLA);
    }
    
    public Vonal(int hossz, int eltolas, Szinek szin) throws IllegalArgumentException {
        this(hossz, eltolas, szin, Stilusok.SZIMPLA);
    }
    
    public Vonal(int hossz, int elotlas, Szinek szin, Stilusok stilus) throws IllegalArgumentException {
        if (hossz < 1) {
            throw new IllegalArgumentException("Egy vonal nem jött létre, mert nem létező a hossz!");
        }
        this.hossz = hossz;
        this.eltolas = eltolas;
        this.szin = szin;
        this.stilus = stilus;
    }
}
