/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week04_branching;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class ObsahObvod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //in
       double ax;
       double ay;
       double bx;
       double by;
       double cx;
       double cy;
       //data
       ax = 0;   
       ay = 0;
       bx = 3;
       by = 0;
       cx = 0;
       cy = 4;
       
       //delka stran
//       double a = Math.sqrt(Math.pow((bx-cx),2)+Math.pow((by-cy),2));
//       double b = Math.sqrt(Math.pow((ax-cx),2)+Math.pow((ay-cy),2));
//       double c = Math.sqrt(Math.pow((ax-bx),2)+Math.pow((ay-by),2));
        double a = distance(bx, by, cx, cy); //ObsahObvod.distance(bx, by, cx, cy);
        double b = distance(ax, ay, cx, cy); 
        double c = distance(bx, by, ax, ay); 
       
       //obvod
       double obvod = a+b+c;
       // System.out.println(obvod);
       
       //obsah
       double s = obvod/2;
       double obsah = Math.sqrt(s*(s-a)*(s-b)*(s-c));
       
       //out
        System.out.println("obvod trojuhelniku je " + obvod + " a obsah je " + obsah);
        
     
       
    }
    
    //Deklarace metody
    /**
     * Calculates distance between two 2D points
     * @param p1x x coordinate of point 1
     * @param p1y y coordinate of point 1
     * @param p2x x coordinate of point 2
     * @param p2y y coordinate of point 2
     * @return distance(length)
     */ //dokumentace javadoc metody
    public static double distance (double p1x, double p1y, double p2x, double p2y){ //signatura(hlavicka) metody
        //double distance = Math.sqrt(Math.pow((p1x-p2x),2)+Math.pow((p1y-p2y),2)); //implementace(kod) metody
        double distance = Math.hypot(p1x-p2x, p1y-p2y);
        return distance;
    }
    
}
