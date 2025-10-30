package week07_library;

/**
 *
 * @author Ichinkhorloo-E-0c92
 */
public class DateTimeToolsTest {

    public static void main(String[] args) {
        System.out.println("Je prestupny rok? " + DateTimeTools.isleap(2024)); //true 
        System.out.println("Je prestupny rok? " + DateTimeTools.isleap(1600)); //true 
        System.out.println("Je prestupny rok? " + DateTimeTools.isleap(1700)); //false
        System.out.println("Je prestupny rok? " + DateTimeTools.isleap(2000)); //true
        
        System.out.println("Je prestupny rok? " + DateTimeTools.isleap(96)); //true
        System.out.println("Je prestupny rok? " + DateTimeTools.isleap(100)); //false 
        System.out.println("Je prestupny rok? " + DateTimeTools.isleap(104)); //true
        System.out.println("Je prestupny rok? " + DateTimeTools.isleap(396)); //true
        System.out.println("Je prestupny rok? " + DateTimeTools.isleap(400)); //true 
        System.out.println("Je prestupny rok? " + DateTimeTools.isleap(404)); //true




        System.out.println("Pocet dni? " + DateTimeTools.DaysInMonth(2, 2024)); //29 - je přestupný
        System.out.println("Pocet dni? " + DateTimeTools.DaysInMonth(2, 2025)); //28 - není přestupný
        System.out.println("Pocet dni? " + DateTimeTools.DaysInMonth(3, 404)); //31
        System.out.println("Pocet dni? " + DateTimeTools.DaysInMonth(4, 1700)); //30
        System.out.println("Pocet dni? " + DateTimeTools.DaysInMonth(6, 1821)); //30
        System.out.println("Pocet dni? " + DateTimeTools.DaysInMonth(8, 1944)); //31
        System.out.println("Pocet dni? " + DateTimeTools.DaysInMonth(11, 2005)); //30
        System.out.println("Pocet dni? " + DateTimeTools.DaysInMonth(9, 2011)); //30

    }

}