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
public class SaturnCoordTestValues {

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
      6.4064068573, -0.3695973750, -5.6790910870, 8.9934758992, -8.6570276346
   };

   public static final double[] Y = {
      6.5699929449, -10.0582398188, 7.1152478120, -3.7883225437, -4.4809792498
   };

   //
   // WARNING: The Z data does not match that from;
   // http://neoprogrammics.com/vsop87/
   // VSOP87 Coord Test Values
   //
   // There of by ~2 times
   //
   public static final double[] Z = {
     -0.73815360583626, 0.3814594401048153, 0.19832123110643668, -0.5798712191519958, 0.8436898052397432
   };

}
