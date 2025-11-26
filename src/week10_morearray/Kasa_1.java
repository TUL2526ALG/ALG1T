package week10_morearray;

/**
 *
 * @author Korner-J-1174
 */
public class Kasa {

    public static void main(String[] args) {
        final int[] p = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] pocetHodnot = new int[p.length];
        int cash = 12458;
        for (int i = 0; i < pocetHodnot.length; i++) {
            if (cash >= p[i]) {
                pocetHodnot[i] = cash / p[i];
                cash = cash % p[i];
            }
        }
        for (int i = 0; i < pocetHodnot.length; i++) {
            System.out.println(p[i] + " - " + pocetHodnot[i] + "x");

        }
    }
}
