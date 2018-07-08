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
         double sum = 0;
         for (int j = 0; j < AX[n].length; j++) {
            sum += AX[n][j] * Math.cos(BX[n][j] + (CX[n][j] * t));
         }
         sum *= Math.pow(t, n);
         X += sum;
         /*
         System.out.println("INFO Coefs: X" + n + "    = " + X);
         EarthXyzFuncs exf = new EarthXyzFuncs();
         double Xexf = 0;
         Xexf = exf.byName(Xyz.X, n, t);
         System.out.println("INFO Coefs: Xexf" + n + " = " + Xexf);
         System.out.println("INFO Coefs: diff = " + Math.abs(X - Xexf));
          */

      }

      return X;
   }

   public static double Y(double t, double[][] AY, double[][] BY, double[][] CY) {
      double Y = 0;

      for (int n = 0; n < NUMGROUPS; n++) {
       double sum = 0;
         for (int j = 0; j < AY[n].length; j++) {
            Y += AY[n][j] * Math.cos(BY[n][j] + (BY[n][j] * t));
         }
         sum *= Math.pow(t, n);
         Y += sum;
                 System.out.println("INFO Coefs: Y" + n + "    = " + Y);
         EarthXyzFuncs exf = new EarthXyzFuncs();
         double Yexf = 0;
         Yexf = exf.byName(Xyz.Y, n, t);
         System.out.println("INFO Coefs: Yexf" + n + " = " + Yexf);
         System.out.println("INFO Coefs: diff = " + Math.abs(Y - Yexf));

      }

      return Y;
   }

   public static double Z(double t, double[][] AZ, double[][] BZ, double[][] CZ) {
      double Z = 0;

      for (int n = 0; n < NUMGROUPS; n++) {
         double sum = 0;
         for (int j = 0; j < AZ[n].length; j++) {
            Z += AZ[n][j] * Math.cos(BZ[n][j] + (CZ[n][j] * t));
         }
         sum *= Math.pow(t, n);
         Z += sum;
      }

      return Z;
   }

   public static double R(double X, double Y, double Z) {
      double R = 0;

      R = Math.sqrt(X * X + Y * Y + Z * Z);

      return R;
   }

   public static double X0(double t, double[][] AX, double[][] BX, double[][] CX) {
      double X0 = 0;

      int n = 0;
      for (int j = 0; j < AX[n].length; j++) {
         X0 += AX[n][j] * Math.cos(BX[n][j] + (CX[n][j] * t));
      }
      X0 *= Math.pow(t, n);

      return X0;
   }

   public static double X1(double t, double[][] AX, double[][] BX, double[][] CX) {
      double X1 = 0;

      int n = 1;
      for (int j = 0; j < AX[n].length; j++) {
         X1 += AX[n][j] * Math.cos(BX[n][j] + (CX[n][j] * t));
      }
      X1 *= Math.pow(t, n);

      return X1;
   }

   public static double X2(double t, double[][] AX, double[][] BX, double[][] CX) {
      double X2 = 0;

      int n = 2;
      for (int j = 0; j < AX[n].length; j++) {
         X2 += AX[n][j] * Math.cos(BX[n][j] + (CX[n][j] * t));
      }
      X2 *= Math.pow(t, n);

      return X2;
   }

   public static double X3(double t, double[][] AX, double[][] BX, double[][] CX) {
      double X3 = 0;

      int n = 3;
      for (int j = 0; j < AX[n].length; j++) {
         X3 += AX[n][j] * Math.cos(BX[n][j] + (CX[n][j] * t));
      }
      X3 *= Math.pow(t, n);

      return X3;
   }

   public static double X4(double t, double[][] AX, double[][] BX, double[][] CX) {
      double X4 = 0;

      int n = 4;
      for (int j = 0; j < AX[n].length; j++) {
         X4 += AX[n][j] * Math.cos(BX[n][j] + (CX[n][j] * t));
      }
      X4 *= Math.pow(t, n);

      return X4;
   }

   public static double X5(double t, double[][] AX, double[][] BX, double[][] CX) {
      double X5 = 0;

      int n = 5;
      for (int j = 0; j < AX[n].length; j++) {
         X5 += AX[n][j] * Math.cos(BX[n][j] + (CX[n][j] * t));
      }
      X5 *= Math.pow(t, n);

      return X5;
   }

   public Coefs() {
   }

}
