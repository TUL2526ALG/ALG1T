package week10_more_array;

/**
 *
 * @author Korner-J-1174
 */
import java.util.Scanner;

public class Cifry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //long number = 2338;
        //long[] pocet = cifry(number);
        //System.out.println(Arrays.toString(pocet));

        long[] pole = new long[2];
        boolean end = false;
        int index = 0;
        while (!end) {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                break;
            }
            long value = Long.parseLong(input);

            if (index < pole.length) {
                pole[index] = value;
            } else {
                long[] copy = new long[2 * pole.length];
                System.arraycopy(pole, 0, copy, 0, pole.length);
                pole = copy;
            }
            index++;
        }
    }

    public static long[] cifry(long number) {
        int pocetCifer = ("" + number).length();
        System.out.println("Pocet cifer: " + ("" + number).length());
        long[] pocet = new long[10];
        for (int i = 0; i < pocetCifer; i++) {
            int cislo = (int) (number % 10);
            System.out.println(cislo);
            number = number / 10;
            pocet[cislo]++;
        }
        return pocet;
    }
}
