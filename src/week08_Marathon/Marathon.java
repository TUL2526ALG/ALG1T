package week08_Marathon;

import java.util.Scanner;

/**
 * 5
 * 1 11 16 39 2 11 21 48 4 11 21 23 12 11 23 46 13 11 23 16
 *
 * @
 */
public class Marathon {

    public static void main(String[] args) {

        final double TRACK = 42195;
        int start_time = 33300; //9*3600 +15
        int time_limit = 7620; //2*3600 + 7
        int pod_limit = 0;
        
        int nejpomalejsi_cas = Integer.MIN_VALUE; //nebo i 0
        int nejrychlejsi_1 = 0;
        int nejrychlejsi_2 = 0;
        int nejrychlejsi_3 = 0;
        int nejrychlejsi_1_cas = Integer.MAX_VALUE;
        int nejrychlejsi_2_cas = Integer.MAX_VALUE;
        int nejrychlejsi_3_cas = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej pocet bezcu");
        int pocet_bezcu = sc.nextInt();
        for (int i = 0; i < pocet_bezcu; i++) {
            System.out.println("Zadej cislo bezce");
            int bezec = sc.nextInt();
            System.out.println("Zadej hodiny");
            int h = sc.nextInt();
            System.out.println("Zadej minuty");
            int m = sc.nextInt();
            System.out.println("Zadej vteriny");
            int s = sc.nextInt();

            int time = (h * 3600 + m * 60 + s) - start_time; //v sec

            if (time < time_limit) {
                pod_limit++;
            }

            if (time < nejrychlejsi_1_cas) {
                nejrychlejsi_3_cas = nejrychlejsi_2_cas;
                nejrychlejsi_3 = nejrychlejsi_2;
                nejrychlejsi_2_cas = nejrychlejsi_1_cas;
                nejrychlejsi_2 = nejrychlejsi_1;
                nejrychlejsi_1_cas = time;
                nejrychlejsi_1 = bezec;
            } else if (time < nejrychlejsi_2_cas) {
                nejrychlejsi_3_cas = nejrychlejsi_2_cas;
                nejrychlejsi_3 = nejrychlejsi_2;
                nejrychlejsi_2_cas = time;
                nejrychlejsi_2 = bezec;
            } else if (time < nejrychlejsi_3_cas){
                nejrychlejsi_3_cas = time;
                nejrychlejsi_3 = bezec;
            }
            
            if (time > nejpomalejsi_cas) {
                nejpomalejsi_cas = time;
            }

        }

        int ztrata = (nejpomalejsi_cas - nejrychlejsi_1_cas);
        int ztrata_min = ztrata / 60;
        int ztrata_sec = ztrata % 60;

        double speed = (TRACK / nejrychlejsi_1_cas); //v m/s

        double time_s = (1000 / speed); // v m/s
        int time_min = (int) (time_s / 60);
        int time_sec = (int) time_s % 60;

        double speed_km = (TRACK / nejrychlejsi_1_cas) * 3.6;

        System.out.println(pod_limit + " zabehli cas pod 2:07");
        System.out.println("Nejrychlejsi bezci byli " + nejrychlejsi_1 + ", " + nejrychlejsi_2 + ", " + nejrychlejsi_3);
        System.out.printf("Posledni mel ztratu na prvniho %02d:%02d %n ", ztrata_min, ztrata_sec);
        System.out.println("Prumerny cas nejryclhejsiho bezce na 1 km byl " + time_min + ":" + time_sec);
        System.out.printf("Prumerna rychlost nejrychlejsiho bezce byla %.2f km/h ", speed_km);
    }
}
