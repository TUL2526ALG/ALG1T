package week07_library;

/**
 *
 * @author kyrul
 */
public class NumberToolsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // ukol 1
        System.out.println(NumberTools.spolecnyNasobek(10, 3)); //30
        System.out.println(NumberTools.spolecnyNasobek(21, 28)); //84
        System.out.println(NumberTools.spolecnyNasobek(12, 24)); //24
        System.out.println(NumberTools.spolecnyNasobek(63, 28)); //252
        System.out.println(NumberTools.spolecnyNasobek(42, 28)); //84
        System.out.println("");
   // ukol 2     
        for (int i = 0; i < 10; i++) {
            System.out.println(NumberTools.randomNumber(20, 10));
        }
    
 
        
    }
}