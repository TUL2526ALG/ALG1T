package week10_more_array;

import java.util.Scanner;
import week09_array.ArrayTools;

/**
 *
 * @author Jaroslav Korner
 */
public class Zamestnanci {

    // data o zaměstnancích
    // Svobodová Novák Dvořáková Černý Malý Procházková
    public final static String[] jmena = {
        "Svobodová",
        "Novák",
        "Dvořáková",
        "Černý",
        "Malý",
        "Procházková"
    };

    // 35000 42000 39000 45000 38000 41000
    public final static int[] platy = {
        35000,
        42000,
        39000,
        45000,
        38000,
        41000
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prijmeni = sc.nextLine();
        System.out.println(najdiZamestnance(jmena, prijmeni));

        int[] myArray = {4, 8, 2, 0, -3};
        System.out.println(ArrayTools.sum(myArray)); //11
        System.out.println(ArrayTools.max(myArray)); //8
    }

    /**
     * Najde zaměstnance podle příjmení
     *
     * @param jmena
     * @param prijmeni
     * @return index (-1 pokud nenalezen)
     */
    public static int najdiZamestnance(String[] jmena, String prijmeni) {
        return -1;
    }

    /**
     * Určí zda je zaměstnanec žena podle jména
     *
     * @param jmeno
     * @return true pokud je žena, false pokud je muž
     */
    public static boolean isWoman(String jmeno) {
        return false;
    }

}
