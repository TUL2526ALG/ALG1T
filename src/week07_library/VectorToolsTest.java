
package week07_library;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class VectorToolsTest {
    public static void main(String[] args) {
        System.out.println(VectorTools.length(3, 4, 0)); //5.0
        System.out.println(VectorTools.lengthOfVectorProduct(1, 2, 3, -3, -2 , -1)); //9.7979
        System.out.println(VectorTools.scalarProduct(1, 0, 2, 0, 1, 0)); //0
        System.out.println(VectorTools.vectorDegree(1, 0, 0, 1, 0, 0)); //0
    }
    
}
