/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author owner
 */
public class EarthCoefs {

   public static final String COEFPATHNAM = "D:\\JOrbit\\VSOP\\VsopLib\\src\\vsop\\EarthCoefs.txt";

   public static final int[] XTERMS = {843, 491, 204, 18, 15, 6};
   public static final int[] YTERMS = {854, 496, 202, 17, 15, 6};
   public static final int[] ZTERMS = {178, 120, 53, 12, 6, 2};

   private List<Double> coefs = null;

   public EarthCoefs() {
      this.coefs = new ArrayList();
      this.parseDataFile();
   }

   public double[][] createAX() {
      double AX[][] = new double[Coefs.NUMGROUPS][];

      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         AX[i] = new double[XTERMS[i]];
      }

      int fromIndex = 0;
      int toIndex = 0;
      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         toIndex = EarthCoefs.XTERMS[i] + fromIndex;
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
      double AY[][] = new double[Coefs.NUMGROUPS][];

      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         AY[i] = new double[YTERMS[i]];
      }

      int fromIndex = 0;
      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         fromIndex += XTERMS[i];
      }

      int toIndex = 0;
      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         toIndex = EarthCoefs.YTERMS[i] + fromIndex;
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
      double AZ[][] = new double[Coefs.NUMGROUPS][];

      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         AZ[i] = new double[ZTERMS[i]];
      }

      int fromIndex = 0;
      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         fromIndex += XTERMS[i] + YTERMS[i];
      }

      int toIndex = 0;
      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         toIndex = EarthCoefs.ZTERMS[i] + fromIndex;
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
      double BX[][] = new double[Coefs.NUMGROUPS][];

      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         BX[i] = new double[XTERMS[i]];
      }

      int fromIndex = 0;
      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         fromIndex += EarthCoefs.XTERMS[i] + EarthCoefs.YTERMS[i] + EarthCoefs.ZTERMS[i];
      }
      int toIndex = 0;
      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         toIndex = EarthCoefs.XTERMS[i] + fromIndex;
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
      double BY[][] = new double[Coefs.NUMGROUPS][];

      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         BY[i] = new double[YTERMS[i]];
      }

      int fromIndex = 0;
      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         fromIndex += EarthCoefs.XTERMS[i] + EarthCoefs.YTERMS[i] + EarthCoefs.ZTERMS[i];
         fromIndex += EarthCoefs.XTERMS[i];
      }
      int toIndex = 0;
      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         toIndex = EarthCoefs.YTERMS[i] + fromIndex;
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
      double BZ[][] = new double[Coefs.NUMGROUPS][];

      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         BZ[i] = new double[ZTERMS[i]];
      }

      int fromIndex = 0;
      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         fromIndex += EarthCoefs.XTERMS[i] + EarthCoefs.YTERMS[i] + EarthCoefs.ZTERMS[i];
         fromIndex += EarthCoefs.XTERMS[i];
         fromIndex += EarthCoefs.YTERMS[i];
      }
      int toIndex = 0;
      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         toIndex = EarthCoefs.ZTERMS[i] + fromIndex;
         List<Double> adList = this.coefs.subList(fromIndex, toIndex);
         int j = 0;
         for (Double ad : adList) {
            BZ[i][j++] = ad;
         }
         fromIndex = toIndex;
      }

      return BZ;

   }

   private void parseDataFile() {
      try {
         FileReader coefFR = new FileReader(EarthCoefs.COEFPATHNAM);
         BufferedReader br = new BufferedReader(coefFR);
         String line;
         while ((line = br.readLine()) != null) {
            Double d = Double.parseDouble(line);
            this.coefs.add(d);

         }
      } catch (Exception ex) {
         Logger.getLogger(EarthCoefs.class
                 .getName()).log(Level.SEVERE, null, ex);
      }
   }

   public List<Double> getCoefs() {
      return coefs;
   }

}
