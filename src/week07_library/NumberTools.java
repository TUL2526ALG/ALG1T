package week07_library;

/**
 *
 * @author kyrul
 */
public class NumberTools {

    public static int spolecnyNasobek(int a, int b) {

        if (a == 0 || b == 0) {
            return 0;
        }

        int maxCislo = Math.max(a, b);
        int minCislo = Math.min(a, b);

        int nasobek = maxCislo;

        while (!(nasobek % minCislo == 0)) {
            nasobek += maxCislo;
        }
        
        return nasobek;
    }

    public static int randomNumber(int max, int min) {
        double randomNumber = Math.random() * (max - min + 1) + min;
        return (int) randomNumber;
    }

    
}
