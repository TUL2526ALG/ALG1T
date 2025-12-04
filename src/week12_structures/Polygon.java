package week12_structures;

import java.util.Scanner;

/**
 * Tests:
 * in: 4 2 1 4 1 4 2 2 2
 * out: 6, 2, 3
 * @author Vitvarova-J-31c9
 */
public class Polygon {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //in
        System.out.println("Zadej pocet bodu:");
        int m = sc.nextInt(); //pocet bodu
        double[][] points = new double [m][2];
        System.out.println("Zadej souradnice bodu:");
//        for (int i = 0; i < points.length; i++) { //vseobecne nacteni
//            for(int j = 0; j < points[i].length; j++){
//                points[i][j] = sc.nextDouble();
//            }
//        }
        
        for (int i = 0; i < points.length; i++) { //protoze jen 2 sloupce, muzu je nacist bez for
            points[i][0] = sc.nextDouble();
            points[i][1] = sc.nextDouble();
            
        }
        
        
        //processing
        double circum = 0;
        //vypocitat delky stran
        //secist delky
        
        double distance;
        double distanceLastFirst;
        for(int i = 0; i < points.length-1; i++){
            //vypocitat delku strany mezi bodem i a i+1
            distance = Math.sqrt(Math.pow(points[i+1][0] - points[i][0], 2) + Math.pow(points[i+1][1] - points[i][1],2));
            circum = circum + distance;
        }
        distanceLastFirst = Math.sqrt(Math.pow(points[points.length-1][0] - points[0][0], 2) + Math.pow(points[points.length-1][1] - points[0][1],2));
        circum = circum + distanceLastFirst;
        
        
        double area;
        double areaWhole = 0;
        double areaLastFirst;
        for (int i = 0; i < points.length - 1; i++) {
            area = points[i][0]*points[i+1][1] - points[i+1][0]*points[i][1];
            areaWhole = areaWhole + area;
        }
        areaLastFirst = points[points.length-1][0]*points[0][1] - points[0][0]*points[points.length-1][1];
        areaWhole = Math.abs(areaWhole + areaLastFirst)*(0.5);
        
        double distanceTo0;
        
        double[] distancesTo0 = new double [points.length];
        for (int i = 0; i < points.length; i++) {
            distanceTo0 = Math.hypot(points[i][0], points[i][1]);
            distancesTo0[i] = distanceTo0;
        }
        
        double max = 0; //-Double.MAX_VALUE
        int maxIndex = -1;
        for (int i = 0; i < distancesTo0.length; i++) {
            if(distancesTo0[i] > max){
                max = distancesTo0[i];
                maxIndex = i;
            }
            
        }
        //output
        System.out.format("Obvod je: %.2f%n", circum);
        System.out.format("Obsah je: %.2f%n", areaWhole);
        System.out.println("Bod nejdal od pocatku je: " + (maxIndex+1));
    }
}
