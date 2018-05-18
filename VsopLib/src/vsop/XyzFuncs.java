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
public abstract class XyzFuncs {

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
      return Z;
   }

}
