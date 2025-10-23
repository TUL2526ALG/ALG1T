package week05_loops;

/**
 *
 * @author Korner-J-1174
 */
public class PrimeNumber {

    public static boolean isPrimeNumber_for(int number) {
        if (number < 0) {
            System.out.println("Prvocisla musi byt kladna");
            return false;
        }
        if (number % 2 == 0 && number != 2) {
            return false;
        }
        for (int i = 3; i < number / 2; i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeNumber_while(int number) {
        boolean jeDelitelne = false;
        int delitel = 3;
        if (number % 2 == 0 && number != 2) {
            return false;
        }
        while (jeDelitelne == false && delitel < Math.sqrt(number)) {
            if (number % delitel == 0) {
                jeDelitelne = true;
            }             
            delitel+=2;
        }
        return !jeDelitelne;

    }

    public static void main(String[] args) {
        int number;
        boolean isPrime;
        int[] cisla = {1, 2, 4, 3, 7, 1561, 7877, -42};
        boolean[] validation = {true, true, false, true, true, false, true, false};
        for (int i = 0; i < cisla.length; i++) {
            number = cisla[i];
            isPrime = isPrimeNumber_while(number);
            System.out.println("number: " + number + " is prime: " + isPrime);
            if (isPrime != validation[i]) {
                System.out.println("CHYBA!!");
            }
        }
    }
}