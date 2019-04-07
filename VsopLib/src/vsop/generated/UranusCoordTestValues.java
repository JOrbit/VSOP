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
public class UranusCoordTestValues {

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
      14.4318934159, -6.4810833337, -18.2708335178, -4.2214391936, 16.1020987626
   };

   public static final double[] Y = {
      -13.7343162527, -17.8526893406, 0.9877655715, 18.3160266384, 11.4900726864
   };

   //
   // WARNING: The Z data does not match that from;
   // http://neoprogrammics.com/vsop87/
   // VSOP87 Coord Test Values
   //
   // There of by ~2 times
   //
   public static final double[] Z = {
      -0.4762843925600014, 0.035894872845014685, 0.4831836864758424, 0.2478876781079249, -0.3324291806293236
   };

}
