
package main;

public class Modulzaro_3_A {

    public static void main(String[] args) {
        vonalProgramBemutatas();
        mindentTudoGepBemutatasa();
    }

    private static void vonalProgramBemutatas() {
        System.out.println(" ");
        try {
            Vonal vonal = new Vonal(10);
            System.out.println(vonal.info());
            System.out.println(vonal.megjelenit());
            
            Vonal vonal2 = new Vonal(6, 1, Vonal.Szinek.KEK, Vonal.Stilusok.PONT);
            System.out.println(vonal2.info());
            System.out.println(vonal2.megjelenit());
            
            Vonal vonal3 = new Vonal(3, 5, Vonal.Szinek.ZOLD, Vonal.Stilusok.DUPLA);
            System.out.println(vonal3.info());
            System.out.println(vonal3.megjelenit());
            
            Vonal vonal4 = new Vonal(-3);
            System.out.println(vonal4.info());
            System.out.println(vonal4.megjelenit());
            
        } catch(IllegalArgumentException x) {
            System.out.println(x.getMessage());
        }
    }

    private static void mindentTudoGepBemutatasa() {
        System.out.println(" ");
        
        MindentTudoGep gep = new MindentTudoGep();
        System.out.println(gep.lottoMegjelenit());
        
        System.out.println(" ");
        
        System.out.println(gep.totoMegjelenit());
        
        System.out.println(" ");
        
        gep.zeneKeres();
    }
    
}
