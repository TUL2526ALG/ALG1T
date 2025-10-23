
package week06_for_loop;

import java.util.Scanner;

public class GuessingNumber {

    static int lower = 1;
    static int upper = 100;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {     
        boolean end = false;

        while(!end){
            menu();
            System.out.println("Zadej volbu");
            int choice = sc.nextInt();
            switch(choice){
                case 0: System.out.println("Konec programu"); 
                        end = true;
                        break;
                case 1: computerGuesses();
                        break;
                case 2: userGuesses();
                        break;
                default: System.out.println("Neplatna volba");
            }
        }
    }

    private static void menu() {
//        System.out.println("Zde to vypise menu");
        System.out.println("Menu");
        System.out.println("1. Hada pocitac");
        System.out.println("2. Hada uzivatel");
        System.out.println("0. Konec programu");
    }
    
    private static void menuAnswers(){
        System.out.println("Menu");
        System.out.println(" 0. Uhodl jsem");
        System.out.println("-1. Myslene cislo je mensi");
        System.out.println(" 1. Myslene cislo je vetsi");
    }

    private static void computerGuesses() {
//        System.out.println("Zde bude hadat pocitac");
        System.out.println("Uzivateli, mysli si cislo."); 
        int middle;
        boolean found = false;
        int min = lower;
        int max = upper;
        
        while(!found && min <= max){//program ma skoncit, kdyz uhodl nebo kdyz min > max 
            middle = (max + min)/2;
            System.out.println("Myslel jsi si cislo " + middle + "?");
            menuAnswers();
            int answer = sc.nextInt();
            switch (answer){
                case 0: System.out.println("Jsem dobry, uhodl jsem"); found = true; break;
                case -1: max = middle - 1; break;
                case  1: min = middle + 1; break;
                default: System.out.println("Neplatna volba");
            }
        }
    }

    private static void userGuesses() {
        System.out.println("Zde bude hadat uzivatel");
    }
    
}
