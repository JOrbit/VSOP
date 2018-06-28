/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop;

/**
 *
 * @author owner
 */
public class TestData {

   /*
   Test data from http://neoprogrammics.com/vsop87/ Coord test values
    */
   // Inputs
   public static final int[] YYYY = {2000, 1899, 1799, 1699, 1599};//, 1499, 1399, 1299, 1199, 1099};
   public static final int[] M = {1, 12, 12, 12, 12, 12, 12, 12, 12, 12};
   public static final int[] D = {1, 31, 30, 29, 29, 19, 19, 19, 19, 19};
   public static final int[] H = {12, 12, 12, 12, 12, 12, 12, 12, 12, 12};
   public static final int[] MM = {0, 0, 0, 0, 0, 0, 0, 0};
   public static final int[] S = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   // Results
   public static final int[] JDN = {2451545, 2415020, 2378495, 2341970, 2305445, 2268920, 2232396, 2195870, 2159345, 2122820};
   public static final double[] JD = {2451545, 2415020, 2378495,
      2341970, 2305445, 2268920, 2232395, 2195870, 2159345, 2122820};

   public static final double[] J2000OFFSET = {0.0, -0.1, -0.2, -0.3, -0.4};

   public static final double[] X = {
      -0.1771354586, -0.1883079649, -0.1993918002, -0.2104654652, -0.2214982928
   };

   public static final double[] Y = {
      0.9672416237, 0.9650688844, 0.9627974368, 0.9603579954, 0.9578483181
   };
   
   public static final double[] Z = {
      -0.0000039000, 0.0002150325, 0.0004307602, 0.0006472929, 0.0008568250
   };

}