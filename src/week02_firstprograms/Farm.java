package week02_firstprograms;

import java.util.Scanner;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class Farm {
    public static void main(String[] args) {
        //V1: fixni vstupni data
//        int pocetHus = 5;
//        int pocetKraliku = 4;
        
        //V2: nacitani od uzivatele
//        Scanner sc = new Scanner(System.in);
//        System.out.print("zadejte pocet hus: ");
//        int pocetHus = sc.nextInt();
//        System.out.print("zadejte pocet kraliku: ");
//        int pocetKraliku = sc.nextInt();
        
        //V3: nacitani parametru pri spusteni programu
        int pocetHus = Integer.parseInt(args[0]); //"5" potrebuji int 5
        int pocetKraliku = Integer.parseInt(args[1]);      
        
        int pocetZvirat = pocetHus + pocetKraliku;
        int pocetNohou = (pocetHus * 2) + (pocetKraliku * 4); //hodili by se konstanty
        
        System.out.printf("Na farme je %d zvirat a maji %d nohou.%n", pocetZvirat, pocetNohou);
    }
}
