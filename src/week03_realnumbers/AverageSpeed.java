package week03_realnumbers;

public class AverageSpeed {

    public static void main(String[] args) {
        int max_r = 60;
        int delka = 12;
        int vstup_h = 12;
        int vstup_m = 30;
        int vstup_s = 0;
        int vystup_h = 12;
        int vystup_m = 40;
        int vystup_s = 0;

        //out
        double cas = (vystup_h - vstup_h) + ((vystup_m - vstup_m) / 60.0) + ((vystup_s - vstup_s) / 3600.0);
        System.out.println(cas);
        double prumRychlost = delka / cas;
        System.out.println("ridic dosahl prumerne rychlosti " + prumRychlost + " km/h");
        
        boolean prekrocil = prumRychlost > max_r;
        double presah = prumRychlost - max_r;
        
        System.out.println("Ridic " + ((prekrocil)? "prekrocil o " + presah : "neprekrocil") + " rychlost");
    }

}
