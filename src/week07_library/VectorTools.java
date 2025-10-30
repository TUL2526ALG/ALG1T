package week07_library;

/**
 * Library class with methods dealing with 3D vectors
 *
 * @author Vitvarova-J-31c9
 */
public class VectorTools {

    /**
     * Calculates the length of a 3D vector
     *
     * @param x - x-coordinate of the vector
     * @param y - y-coordinate of the vector
     * @param z - z-coordinate of the vector
     * @return the length of the vector
     */
    public static double length(double x, double y, double z) {
        //return Math.sqrt(x*x + y*y + z*z);
        double length = Math.sqrt(x * x + y * y + z * z);
        return length;
    }

    /**
     * Calculates the scalar product of two 3D vectors
     *
     * @param ax - x coordinate of the first vector
     * @param ay - y coordinate of the first vector
     * @param az - z coordinate of the first vector
     * @param bx - x coordinate of the second vector
     * @param by - y coordinate of the second vector
     * @param bz - z coordinate of the second vector
     * @return the scalar product of two 3D vectors
     */
    public static double scalarProduct(double ax, double ay, double az, double bx, double by, double bz) {
        double scalarProduct = (ax * bx + ay * by + az * bz);
        return scalarProduct;
    }

    /**
     * Calculates degree between two vectors
     *
     * @param ax - x coordinate of the first vector
     * @param ay - y coordinate of the first vector
     * @param az - z coordinate of the first vector
     * @param bx - x coordinate of the second vector
     * @param by - y coordinate of the second vector
     * @param bz - z coordinate of the second vector
     * @return the degree between vectors
     */
    public static double vectorDegree(double ax, double ay, double az, double bx, double by, double bz) {
        double vectorDegree = Math.acos(scalarProduct(ax, ay, az, bx, by, bz) / (length(ax, ay, az) * length(bx, by, bz)));
        return vectorDegree;
    }

    /**
     * Calculates the length of vector product of two 3D vectors
     *
     * @param ax - x coordinate of the first vector
     * @param ay - y coordinate of the first vector
     * @param az - z coordinate of the first vector
     * @param bx - x coordinate of the second vector
     * @param by - y coordinate of the second vector
     * @param bz - z coordinate of the second vector
     * @return the length of vector product of two 3D vectors
     */

    public static double lengthOfVectorProduct(double ax, double ay, double az, double bx, double by, double bz) {
        double vectorProductCoordinateX = (ay * bz - az * by);
        double vectorProductCoordinateY = (az * bx - ax * bz);
        double vectorProductCoordinateZ = (ax * by - ay * bx);
        double vectorLength = length(vectorProductCoordinateX, vectorProductCoordinateY, vectorProductCoordinateZ);

        return vectorLength;
    }
}
