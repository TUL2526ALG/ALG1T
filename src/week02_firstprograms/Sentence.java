package week02_firstprograms;

import java.time.Year;
import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        //in
        String jmeno;
        int narozeni;
        char trida;
        final int SKOLNI_VEK = 6; //konstanta
        
        //data
//        jmeno = "Filip";
//        narozeni = 2010;
//        trida = 'A';
        
        //nacteni od uzivatele
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej jmeno, rok narozeni a tridu");
        jmeno = sc.next();
        narozeni = sc.nextInt();
        trida = sc.next().charAt(0);
        
        //algoritmus
        //int vek = 2025 - narozeni;
        int vek = Year.now().getValue() - narozeni;
        //int rocnik = vek - 6;
        int rocnik = vek - SKOLNI_VEK;
        
        //output
        System.out.println("Dite " + jmeno + " ma " + vek + " let a chodi do " 
                + rocnik + "." + trida + ".");
        
        
    }
    
}
