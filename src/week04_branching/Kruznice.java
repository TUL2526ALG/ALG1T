package week04_branching;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Vitvarova-J-31c9
 */
public class Kruznice {

    /**
     * @param args the command line arguments
     */
    final static byte IN = -1; //globalni promenna
    final static byte ON = 0; 
    final static byte OUT = 1;
    final static double EPS = 0.0001;
    
    public static void main(String[] args) {
        //Inputs data
        double px = 0; //lokalni promenna
        double py = 4;
        double sx = 0;
        double sy = 0;
        double r = 4;
        
        
        double vzdalenost = ObsahObvod.distance(px,py,sx,sy);
        
        byte pozice;
        double rozdil = r - vzdalenost;
        if (Math.abs(rozdil - 0) < EPS) { //reseni nepresnosti realnych cisel
                pozice = ON;
        } else if (rozdil < 0) {
            pozice = OUT;
        } else {
            pozice = IN;
        }

        //byte pozice = pozice(vzdalenost, r);

        //vypis
        if (pozice == IN) {
            System.out.println("Bod je v kruznici.");
        } else if (pozice == ON) {
            System.out.println("Bod je na kruznici.");
        } else {
            System.out.println("Bod je mimo kruznici.");
            }
        
    }
    
//    public static byte pozice(double vzdalenost, double r) {
//        byte pozice = IN;
//        double rozdil = r - vzdalenost;
//        if (rozdil < 0) {
//            pozice = OUT;
//        } else {
//            if (rozdil == 0) {
//                pozice = ON;
//            } 
//        }
//        return pozice;
}
