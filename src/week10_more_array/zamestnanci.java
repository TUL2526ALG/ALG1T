/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10_more_array;

/**
 *
 * @author Korner-J-1174
 */
public class zamestnanci {

    public final static String[] jmena = {
        "Svobodová",
        "Novák",
        "Dvořáková",
        "Černý",
        "Malý",
        "Procházková"
    };

    public final static int[] platy = {
        35000,
        42000,
        39000,
        45000,
        38000,
        41000
    };

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String prijmeni = sc.nextLine();
        System.out.println(najdiZamestnance(jmena, "černý"));
        System.out.println("" + kolikBere(jmena, platy, "novák"));
        System.out.println("" + kdoBereNejvic(jmena, platy));
        System.out.println("" + suma(platy));
        System.out.println("" + prumer(platy));
        System.out.println("" + zenyBerou(jmena, platy));
        System.out.println("" + muziBerou(jmena, platy));
    }

    /**
     * Najde zaměstnance podle příjmení
     *
     * @param jmena
     * @param prijmeni
     * @return index (-1 pokud nenalezen)
     */
    public static int najdiZamestnance(String[] jmena, String prijmeni) {
        for (int i = 0; i < jmena.length; i++) {
            if (jmena[i].equalsIgnoreCase(prijmeni)) {
                return i;
            }
        }
        return -1;
    }

    public static int kolikBere(String[] jmena, int[] platy, String prijmeni) {
        return platy[najdiZamestnance(jmena, prijmeni)];
    }

    public static int max(int[] pole) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] > max) {
                max = pole[i];
            }
        }
        return max;
    }

    public static int indexOf(int[] pole, int value) {
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static String kdoBereNejvic(String[] jmena, int[] platy) {
        return jmena[indexOf(platy, max(platy))];
    }

    public static int suma(int[] pole) {
        int soucet = 0;
        for (int i = 0; i < pole.length; i++) {
            soucet += pole[i];

        }
        return soucet;
    }

    public static double prumer(int[] pole) {
        return (double) suma(pole) / pole.length;
    }

    /**
     * Určí zda je zaměstnanec žena podle jména
     *
     * @param jmeno
     * @return true pokud je žena, false pokud je muž
     */
    public static boolean isWoman(String jmeno) {
        return jmeno.toLowerCase().endsWith("ová");

    }

    public static double zenyBerou(String[] jmeno, int[] platy) {
        int soucet = 0;
        int pocet = 0;
        for (int i = 0; i < jmeno.length; i++) {
            if (isWoman(jmeno[i])) {
                soucet += platy[i];
                pocet++;
            }
        }
        return (double) soucet / pocet;
    }

    public static double muziBerou(String[] jmeno, int[] platy) {
        int soucet = 0;
        int pocet = 0;

        for (int i = 0; i < jmeno.length; i++) {
            if (!isWoman(jmeno[i])) {
                soucet += platy[i];
                pocet++;
            }
        }
        return (double) soucet / pocet;
    }

}
