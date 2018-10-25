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
public class XyzRCalcs {
   
   private XyzRCalcsInter impl;

   public XyzRCalcs(XyzRCalcsInter impl) {
      this.impl = impl;
   }
   
   public double X(double t) {
      double X = Double.NaN;
      X = impl.X0(t) + impl.X1(t) + impl.X2(t) + impl.X3(t) + impl.X4(t) + impl.X5(t);
      return X;
   }

   public double Y(double t) {
      double Y = Double.NaN;
      Y = impl.Y0(t) + impl.Y1(t) + impl.Y2(t) + impl.Y3(t) + impl.Y4(t) + impl.Y5(t);
      return Y;
   }

   public double Z(double t) {
      double Z = Double.NaN;
      Z = impl.Z0(t) + impl.Z1(t) + impl.Z2(t) + impl.Z3(t) + impl.Z4(t) + impl.Z5(t);
      return Z;
   }
}
