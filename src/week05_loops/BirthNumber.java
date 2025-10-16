/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week05_loops;

import java.util.Scanner;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class BirthNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        int part1; //deklarace promennych mimo cyklus
        int part2;
        boolean isValid;
        char response;
        
        while (!end) { //end == false
            System.out.println("Zadej prvni cast rodneho cisla: ");
            part1 = sc.nextInt();
            //int part1 = 50730;
            System.out.println("Zadej druhou cast rodneho cisla: ");
            part2 = sc.nextInt();
            //int part2 = 1421;

            int digits9 = part1 * 1000 + part2 / 10;
            int lastDigit = part2 % 10;
            //System.out.println(lastDigit);
            //System.out.println(digits9);

            int zbytek = digits9 % 11;
            //System.out.println(zbytek);
            
            //varianta s if-else
            //isValid = false; //inicializace
            //if (lastDigit == 0 && zbytek == 10){
            //    isValid = true;
            //}else if (zbytek == lastDigit){
            //    isValid = true;
            //}
            
            isValid = (lastDigit == 0 && zbytek == 10) || (zbytek == lastDigit);

            System.out.println(isValid ? "Cislo je platne" : "Cislo neni platne");

            System.out.println("Chcete pokračovat? (a/n): ");
            response = sc.next().toLowerCase().charAt(0);
            end = response == 'n';

            //end = response.equals("n"); //porovnani textovych retezcu pomoci metody equals
        }
        
        
    }
}
