/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop.arrays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vsop.XyzRCalcsInter;

/**
 *
 * @author owner
 */
public class EarthCoefsArrays implements XyzRCalcsInter {

   public static final String COEFPATHNAM = "D:\\JOrbit\\VSOP\\VsopLib\\src\\vsop\\arrays\\EarthCoefsArrays.txt";

   public static final int[] XTERMS = {843, 491, 204, 18, 15, 6};
   public static final int[] YTERMS = {854, 496, 202, 17, 15, 6};
   public static final int[] ZTERMS = {178, 120, 53, 12, 6, 2};

   private List<Double> coefs = null;

   public EarthCoefsArrays() {
      this.coefs = new ArrayList<Double>();
      this.parseDataFile();
   }

   public double[][] createAX() {
      double AX[][] = new double[CoefsArrays.NUMGROUPS][];

      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         AX[i] = new double[XTERMS[i]];
      }

      int fromIndex = 0;
      int toIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         toIndex = EarthCoefsArrays.XTERMS[i] + fromIndex;
         List<Double> adList = this.coefs.subList(fromIndex, toIndex);
         int j = 0;
         for (Double ad : adList) {
            AX[i][j++] = ad;
         }
         fromIndex = toIndex;
      }

      return AX;
   }

   public double[][] createAY() {
      double AY[][] = new double[CoefsArrays.NUMGROUPS][];

      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         AY[i] = new double[YTERMS[i]];
      }

      int fromIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         fromIndex += XTERMS[i];
      }

      int toIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         toIndex = EarthCoefsArrays.YTERMS[i] + fromIndex;
         List<Double> adList = this.coefs.subList(fromIndex, toIndex);
         int j = 0;
         for (Double ad : adList) {
            AY[i][j++] = ad;
         }
         fromIndex = toIndex;
      }

      return AY;
   }

   public double[][] createAZ() {
      double AZ[][] = new double[CoefsArrays.NUMGROUPS][];

      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         AZ[i] = new double[ZTERMS[i]];
      }

      int fromIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         fromIndex += XTERMS[i] + YTERMS[i];
      }

      int toIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         toIndex = EarthCoefsArrays.ZTERMS[i] + fromIndex;
         List<Double> adList = this.coefs.subList(fromIndex, toIndex);
         int j = 0;
         for (Double ad : adList) {
            AZ[i][j++] = ad;
         }
         fromIndex = toIndex;
      }

      return AZ;

   }

   public double[][] createBX() {
      double BX[][] = new double[CoefsArrays.NUMGROUPS][];

      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         BX[i] = new double[XTERMS[i]];
      }

      int fromIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         fromIndex += EarthCoefsArrays.XTERMS[i] + EarthCoefsArrays.YTERMS[i] + EarthCoefsArrays.ZTERMS[i];
      }
      int toIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         toIndex = EarthCoefsArrays.XTERMS[i] + fromIndex;
         List<Double> adList = this.coefs.subList(fromIndex, toIndex);
         int j = 0;
         for (Double ad : adList) {
            BX[i][j++] = ad;
         }
         fromIndex = toIndex;
      }

      return BX;

   }

   public double[][] createBY() {
      double BY[][] = new double[CoefsArrays.NUMGROUPS][];

      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         BY[i] = new double[YTERMS[i]];
      }

      int fromIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         fromIndex += EarthCoefsArrays.XTERMS[i] + EarthCoefsArrays.YTERMS[i] + EarthCoefsArrays.ZTERMS[i];
         fromIndex += EarthCoefsArrays.XTERMS[i];
      }
      int toIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         toIndex = EarthCoefsArrays.YTERMS[i] + fromIndex;
         List<Double> adList = this.coefs.subList(fromIndex, toIndex);
         int j = 0;
         for (Double ad : adList) {
            BY[i][j++] = ad;
         }
         fromIndex = toIndex;
      }

      return BY;

   }
   
   public double[][] createBZ() {
      double BZ[][] = new double[CoefsArrays.NUMGROUPS][];

      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         BZ[i] = new double[ZTERMS[i]];
      }

      int fromIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         fromIndex += EarthCoefsArrays.XTERMS[i] + EarthCoefsArrays.YTERMS[i] + EarthCoefsArrays.ZTERMS[i];
         fromIndex += EarthCoefsArrays.XTERMS[i];
         fromIndex += EarthCoefsArrays.YTERMS[i];
      }
      int toIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         toIndex = EarthCoefsArrays.ZTERMS[i] + fromIndex;
         List<Double> adList = this.coefs.subList(fromIndex, toIndex);
         int j = 0;
         for (Double ad : adList) {
            BZ[i][j++] = ad;
         }
         fromIndex = toIndex;
      }

      return BZ;

   }
   
   public double[][] createCX() {
      double CX[][] = new double[CoefsArrays.NUMGROUPS][];

      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         CX[i] = new double[XTERMS[i]];
      }

      int fromIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         fromIndex += EarthCoefsArrays.XTERMS[i] + EarthCoefsArrays.YTERMS[i] + EarthCoefsArrays.ZTERMS[i];
         fromIndex += EarthCoefsArrays.XTERMS[i] + EarthCoefsArrays.YTERMS[i] + EarthCoefsArrays.ZTERMS[i];
      }
 
      int toIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         toIndex = EarthCoefsArrays.XTERMS[i] + fromIndex;
         List<Double> adList = this.coefs.subList(fromIndex, toIndex);
         int j = 0;
         for (Double ad : adList) {
            CX[i][j++] = ad;
         }
         fromIndex = toIndex;
      }

      return CX;

   }

    public double[][] createCY() {
      double CY[][] = new double[CoefsArrays.NUMGROUPS][];

      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         CY[i] = new double[YTERMS[i]];
      }

      int fromIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         fromIndex += EarthCoefsArrays.XTERMS[i] + EarthCoefsArrays.YTERMS[i] + EarthCoefsArrays.ZTERMS[i];
         fromIndex += EarthCoefsArrays.XTERMS[i] + EarthCoefsArrays.YTERMS[i] + EarthCoefsArrays.ZTERMS[i];
         fromIndex += EarthCoefsArrays.XTERMS[i];
      }
 
      int toIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         toIndex = EarthCoefsArrays.YTERMS[i] + fromIndex;
         List<Double> adList = this.coefs.subList(fromIndex, toIndex);
         int j = 0;
         for (Double ad : adList) {
            CY[i][j++] = ad;
         }
         fromIndex = toIndex;
      }

      return CY;
   }

    public double[][] createCZ() {
      double CZ[][] = new double[CoefsArrays.NUMGROUPS][];

      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         CZ[i] = new double[ZTERMS[i]];
      }

      int fromIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         fromIndex += EarthCoefsArrays.XTERMS[i] + EarthCoefsArrays.YTERMS[i] + EarthCoefsArrays.ZTERMS[i];
         fromIndex += EarthCoefsArrays.XTERMS[i] + EarthCoefsArrays.YTERMS[i] + EarthCoefsArrays.ZTERMS[i];
         fromIndex += EarthCoefsArrays.XTERMS[i] + EarthCoefsArrays.YTERMS[i];
      }
 
      int toIndex = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         toIndex = EarthCoefsArrays.ZTERMS[i] + fromIndex;
         List<Double> adList = this.coefs.subList(fromIndex, toIndex);
         int j = 0;
         for (Double ad : adList) {
            CZ[i][j++] = ad;
         }
         fromIndex = toIndex;
      }

      return CZ;
   }

   private void parseDataFile() {
      try {
         FileReader coefFR = new FileReader(EarthCoefsArrays.COEFPATHNAM);
         BufferedReader br = new BufferedReader(coefFR);
         String line;
         while ((line = br.readLine()) != null) {
            Double d = Double.parseDouble(line);
            this.coefs.add(d);

         }
      } catch (Exception ex) {
         Logger.getLogger(EarthCoefsArrays.class
                 .getName()).log(Level.SEVERE, null, ex);
      }
   }

   public List<Double> getCoefs() {
      return coefs;
   }

   @Override
   public double X0(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double X1(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double X2(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double X3(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double X4(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double X5(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double Y0(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double Y1(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double Y2(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double Y3(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double Y4(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double Y5(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double Z0(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double Z1(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double Z2(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double Z3(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double Z4(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public double Z5(double t) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

}
