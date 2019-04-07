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
public class VenusCoordTestValues {

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
      -0.7183022797, 0.6971428331, -0.5983535208, 0.4531193265, -0.2501974249
   };

   public static final double[] Y = {
      -0.0326546017, -0.2033631151, 0.3958502156, -0.5692420969, 0.6732855399
   };

   //
   // WARNING: The Z data does not match that from;
   // http://neoprogrammics.com/vsop87/
   // VSOP87 Coord Test Values
   //
   // There of by ~2 times
   //
   public static final double[] Z = {
      0.08202859495, -0.0860394066, 0.0797758461, -0.0674915016, 0.0466218135
   };
   
}
