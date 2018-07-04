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
public class Coefs {

   public static enum Planets {
      MERCURY, VENUS, EARTH, MARS,
      JUPITER, SATURN, URANUS, NEPTUNE
   }
  
   public static final int NUMABC = 3;
   

   public static enum Abc {
      A, B, C
   }

   public static final int NUMXYZ = 3;
   
   public static enum Xyz {
      X, Y, Z
   }

   public static final int NUMGROUPS = 6;

   public static double X(double t, double[][] AX, double[][] BX, double[][] CX) {
      double X = 0;

      for (int n = 0; n < NUMGROUPS; n++) {
         for (int j = 0; j < AX[n].length; j++) {
            X += AX[n][j] * Math.cos(BX[n][j] + t * CX[n][j]) * Math.pow(t, n);
         }
      }
      return X;
   }

   public static double Y(double t, double[][] AY, double[][] BY, double[][] CY) {
      double Y = 0;

      for (int n = 0; n < NUMGROUPS; n++) {
         for (int j = 0; j < AY[n].length; j++) {
            Y += AY[n][j] * Math.cos(BY[n][j] + t * CY[n][j]) * Math.pow(t, n);
         }
      }
      return Y;
   }

   public static double Z(double t, double[][] AZ, double[][] BZ, double[][] CZ) {
      double Z = 0;

      for (int n = 0; n < NUMGROUPS; n++) {
         for (int j = 0; j < AZ[n].length; j++) {
            Z += AZ[n][j] * Math.cos(BZ[n][j] + t * CZ[n][j]) * Math.pow(t, n);
         }
      }
      return Z;
   }

   public static double R(double X, double Y, double Z) {
      double R = 0;
      R = Math.sqrt(X * X + Y * Y + Z * Z);
      return R;
   }

   public Coefs() {
   }
   
}
