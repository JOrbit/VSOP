/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop.generated;

/**
 *
 * @author owner
 */
public class MarsCoordTestValues {

   /*
   Test data from http://neoprogrammics.com/vsop87/ Coord test values
    */
   //
   // Inputs
   //
   public static final int[] JDN = {2451545, 2415020, 2378495, 2341970, 2305445};

   // 
   // Results
   //
   public static final double[] X = {
      1.3907159264, 0.4284332474, -1.1119219621, -1.6387489524, -0.8307668241
   };

   public static final double[] Y = {
      -0.0134157043, -1.3552354250, -1.0963263014, 0.2507105242, 1.4098595097
   };

   //
   // WARNING: The Z data does not match that from;
   // http://neoprogrammics.com/vsop87/
   // VSOP87 Coord Test Values
   //
   // There of by ~2 times
   //
   public static final double[] Z = {
      -0.0689355933089216, -0.07787478435878915, 0.009265701285478113, 0.09202734516712589, 0.10042216525326973
   };

}
