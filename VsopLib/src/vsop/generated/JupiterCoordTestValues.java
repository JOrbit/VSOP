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
public class JupiterCoordTestValues {

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
      4.0011740268, -3.0191224350, -0.0180390004, 1.2817318353, -4.0547959775
   };

   public static final double[] Y = {
      2.9385810077, -4.4582563705, 5.1317748839, -5.0280079874, 3.4799857072
   };

   //
   // WARNING: The Z data does not match that from;
   // http://neoprogrammics.com/vsop87/
   // VSOP87 Coord Test Values
   //
   // There of by ~2 times
   //
   public static final double[] Z = {
      -0.20356750021212916, 0.17186917515986294, -0.04067028895921907, -0.01696521781284426, 0.15442414787601924
   };

}
