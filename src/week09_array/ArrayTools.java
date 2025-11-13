package week09_array;

import java.util.Scanner;

public class ArrayTools {

    //metoda, ktera pocita soucet prvku v zadanem poli
    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static int max(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int max1(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    
    //pretizena metoda - ma stejny nazev, jen jiny typ nebo pocet vstupnich parametru
    public static double max(double[] a) {
        double max = -Double.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    //zjisti prvni index minima
    // 5, -3, 8, 15, 1000000 
    public static int indexMin(int[] a) {
        int min = Integer.MAX_VALUE; //inf
        int indexMin = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static int pocetHodnoty(int[] a, int b) {
        int pocet = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                pocet = pocet + 1;
            }
        }
        return pocet;
    }
    
    public static boolean vzestupnostPole (int[] a){
        boolean stoupa = true;
        for (int i = 1; i < a.length; i++) {
            if(a[i] < a[i-1] ){
                stoupa = false;
                break;
                //return false;
            }
        }
        return stoupa;
        //return true;
    }
    
    //obraci prvky primo v zadanem poli
    public static void reverse(int[] a){
        int temp;
        //int j = a.length-1;
        int j;
        for (int i = 0; i < a.length/2; i++) {
            j = a.length -1 - i;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp; 
            //j--;
        }
    }
    
    //vraci nove pole s obracenymi hodnotami
    public static int[] reverse1(int[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[a.length - 1 - i] = a[i];
        }
        return b;
    }
    
    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


         
    
    
    
    //test jestli hodnoty v poli porad stoupaji

    //testovaci main
    public static void main(String[] args) {
//        int[] a = new int[4];
//        a[0] = 4;
//        a[1] = 8;        
        int[] myArray = {4, 8, 1, 2}; //staticky inicializator
        //System.out.println(a); //!nevraci prvky v poli
        //System.out.println(sum(myArray)); //15
        int[] b = {5, 3, 7, -3, 7, 1};
        //System.out.println(max(b));//7
        int[] c = {-5, 6, 9, 10, -26};
        System.out.println(indexMin(c));
        int[] d = {5, 5, 8, 9, 10, 5};
        //System.out.println(pocetHodnoty(d, 5));//3
        int[] e = {1,-2,3,4,5};
        System.out.println(vzestupnostPole(e));
        int[] f = {4, 8, 1, 2};
        print(f);
        reverse(f);
        print(f);
        System.out.println("");
        print(f);
        int[] rf = reverse1(f);
        print(rf);
        print(f);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej pocet prvku");
        int n = sc.nextInt();
        int[] my = new int[n];
        System.out.println("Zadej prvky pole");{
        for (int i = 0; i < my.length; i++) {
            my[i] = sc.nextInt(); 
        }
    }
        
    }
}
