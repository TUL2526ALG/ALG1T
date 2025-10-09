
package week04_branching;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class TestDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(ObsahObvod.distance(0, 0, 3, 0) == 3); //3
        System.out.println(ObsahObvod.distance(1, 1, 4, 5) == 5); //
        System.out.println(ObsahObvod.distance(0, 1, 1, 0) == Math.sqrt(2)); //odmocnina 2
    }
    
}
