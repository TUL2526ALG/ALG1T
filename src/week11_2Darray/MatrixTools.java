/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11_2Darray;

import java.util.Scanner;

/**
 *
 * @author Korner-J-1174
 */
public class MatrixTools {
    
    public static Scanner sc = new Scanner(System.in);

    public static void print(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.format("%5.2f ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] load() {
        System.out.println("Zadej rozmery matice: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        double [][] array = new double [m][n];
        System.out.println("Zadej hodnoty matice: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j]= sc.nextDouble();
            }
        }
        return array;
    }

    public static double[][] sum(double[][] array1, double[][] array2) {
        if (array1.length != array2.length || array1[0].length != array2[0].length) {
            throw new IllegalArgumentException("Size of matrices do not match");
        }
        double[][] array_sum = new double[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                array_sum[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return array_sum;
    }

    public static double[][] copy(double[][] array) {
        double[][] array_new = new double[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array_new[i][j] = array[i][j];
            }
        }
        return array_new;
    }

    public static double[][] scaleMult(double[][] array, double scale) {
        double[][] array_new = copy(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array_new[i][j] = array_new[i][j] * scale;
            }
        }
        return array_new;
    }

    public static double[][] normalize(double[][] array) {
        double max = Math.abs(array[0][0]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (Math.abs(array[i][j]) > max) {
                    max = Math.abs(array[i][j]);
                }
            }
        }

        return scaleMult(array, 1 / max);
    }

    public static boolean isStochastic(double[][] array) {
        double soucet = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                // val != 0
                if (Math.abs(array[i][j]) < Double.MIN_VALUE) {
                    return false;
                }
                soucet += array[i][j];
            }
            // soucet == 1
            if (Math.abs(soucet - 1) > Double.MIN_VALUE) {
                return false;
            }
            soucet = 0;
        }
        return true;
    }

    public static void main(String[] args) {
        double[][] test1 = {
            {1, -12, 3},
            {5, 4, 1}};
        System.out.println("Test print");
        print(test1);

        double[][] test2 = {
            {1, 1, 1},
            {1, 1, 1}};
        System.out.println("Test sum");
        print(sum(test1, test2));

        System.out.println("Test norm");
        print(normalize(test1));

        System.out.println("Test stochastic");
        double[][] test3 = {
            {0.5, 0.1, 0.4},
            {0.2, 0.4, 0.4}};
        System.out.println(isStochastic(test3)); //true
        double[][] test4 = {
            {0.5, 0.0, 0.5},
            {0.2, 0.4, 0.4}};
        System.out.println(isStochastic(test4)); //false

        System.out.println("Test load");
        double[][] loaded = load();
        print(loaded);
    }
}
