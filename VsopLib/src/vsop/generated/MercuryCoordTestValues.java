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
public class MercuryCoordTestValues {

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
      -0.1300934115, -0.3897246931, -0.1683565237, 0.3256720360, 0.2314047967
   };

   public static final double[] Y = {
      -0.4472876716, -0.1502242199, 0.2735108157, 0.0880865802, -0.3620120986
   };

   //
   // WARNING: The Z data does not match that from;
   // http://neoprogrammics.com/vsop87/
   // VSOP87 Coord Test Values
   //
   // There of by ~2 times
   //
   public static final double[] Z = {
      -0.0491967603, 0.04708877760, 0.0755437677, -0.0458046501, -0.1017832350
   };

}
