/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop.generated;

import vsop.arrays.CoefsArrays;

/**
 *
 * @author owner
 */
public abstract class CoefsGenerated {
   
   public static double KM_PER_AU = 149597870.691;
   //SpiceDouble AU2KM = 149597870.691;
   //SpiceDouble KM2AU = 1.0 / AU2KM;


   abstract public double X0(double t);

   abstract public double X1(double t);

   abstract public double X2(double t);

   abstract public double X3(double t);

   abstract public double X4(double t);

   abstract public double X5(double t);

   abstract public double Y0(double t);

   abstract public double Y1(double t);

   abstract public double Y2(double t);

   abstract public double Y3(double t);

   abstract public double Y4(double t);

   abstract public double Y5(double t);

   abstract public double Z0(double t);

   abstract public double Z1(double t);

   abstract public double Z2(double t);

   abstract public double Z3(double t);

   abstract public double Z4(double t);

   abstract public double Z5(double t);

   public double X(double t) {
      double X = Double.NaN;
      X = X0(t) + X1(t) + X2(t) + X3(t) + X4(t) + X5(t);
      return X;
   }

   public double Y(double t) {
      double Y = Double.NaN;
      Y = Y0(t) + Y1(t) + Y2(t) + Y3(t) + Y4(t) + Y5(t);
      return Y;
   }

   public double Z(double t) {
      double Z = Double.NaN;
      Z = Z0(t) + Z1(t) + Z2(t) + Z3(t) + Z4(t) + Z5(t);
      //
      // KLUDGE
      // The Z compent differs from the Spice data by 100%.  So divide it by 2.
      //
      Z /= 2.0;
      return Z;
   }

   public double byName(CoefsArrays.Axsis axis, int level, double t) {
      double xyz = 0;
      if (axis == CoefsArrays.Axsis.X) {
         if (level == 0) {
            xyz = this.X0(t);
         }
         if (level == 1) {
            xyz = this.X1(t);
         }
         if (level == 2) {
            xyz = this.X2(t);
         }
         if (level == 3) {
            xyz = this.X3(t);
         }
         if (level == 4) {
            xyz = this.X4(t);
         }
         if (level == 5) {
            xyz = this.X5(t);
         }
      }

      if (axis == CoefsArrays.Axsis.Y) {
         if (level == 0) {
            xyz = this.Y0(t);
         }
         if (level == 1) {
            xyz = this.Y1(t);
         }
         if (level == 2) {
            xyz = this.Y2(t);
         }
         if (level == 3) {
            xyz = this.Y3(t);
         }
         if (level == 4) {
            xyz = this.Y4(t);
         }
         if (level == 5) {
            xyz = this.Y5(t);
         }
      }

      if (axis == CoefsArrays.Axsis.Z) {
         if (level == 0) {
            xyz = this.Z0(t);
         }
         if (level == 1) {
            xyz = this.Z1(t);
         }
         if (level == 2) {
            xyz = this.Z2(t);
         }
         if (level == 3) {
            xyz = this.Z3(t);
         }
         if (level == 4) {
            xyz = this.Z4(t);
         }
         if (level == 5) {
            xyz = this.Z5(t);
         }
      }

      return xyz;
   }

}
