package week07_library;

/**
 *
 * @author Ichinkhorloo-E-0c92
 */
public class DateTimeTools {

    /**
     * Testujeme, zda je rok prestupny
     *
     * @param year year
     * @return true, pokud je prestupny
     */
    public static boolean isleap(int year) {
        boolean isleap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        return isleap;
    }

    
    public static int DaysInMonth(int month, int year) {

        // Unor = 2
        if (month == 2) {
            return isleap(year) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }

        // Duben = 4, Cerven = 6, Zari = 9, Listopad = 11
        // return (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
    }

}