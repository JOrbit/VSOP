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
public class NeptuneCoordTestValues {

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
      16.8121116576, 1.5164557467, -20.3138943578, 29.5022811950, -26.5823264272
   };

   public static final double[] Y = {
      -24.9916630908, 29.8254538901, -22.4908255796, 4.5987701114, 14.1935610229
   };

   //
   // WARNING: The Z data does not match that from;
   // http://neoprogrammics.com/vsop87/
   // VSOP87 Coord Test Values
   //
   // There of by ~2 times
   //
   public static final double[] Z = {
      0.2544380342135641, -1.2982881576004313, 1.8620580154929924, -1.5485217225957832, 0.6399267709861712
   };

}
