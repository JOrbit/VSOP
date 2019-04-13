/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsopvsspice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import vsop.DateFuncs;
import vsop.generated.CoefsGenerated;
import vsop.generated.EarthCoefsGenerated;
import vsop.generated.JupiterCoefsGenerated;
import vsop.generated.MarsCoefsGenerated;
import vsop.generated.MercuryCoefsGenerated;
import vsop.generated.NeptuneCoefsGenerated;
import vsop.generated.SaturnCoefsGenerated;
import vsop.generated.UranusCoefsGenerated;
import vsop.generated.VenusCoefsGenerated;

/**
 *
 * @author owner
 */
public class VsopVsSpice {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {

      for (String Planet : CoefsGenerated.PLANETS_SPICE) {

         String fileName = "D:\\JOrbit\\Spice\\SpiceVsopMain\\" + Planet
                 + "-ECLIPJ2000-SUN-XyzR.txt";

         System.out.println("fileName = " + fileName);

         int jdn = DateFuncs.J2000;
         double etSpice = 0;
         double xSpice = 0;
         double ySpice = 0;
         double zSpice = 0;
         double rSpice = 0;
         double tVsop = 0;
         double etVsop = 0;
         double xVsop = 0;
         double yVsop = 0;
         double zVsop = 0;
         double rVsop = 0;

         BufferedReader reader;
         try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null) {
               //System.out.println(line);
               String[] tokens = line.split("\\s+");
               // System.out.println("token[" + i + "] = " + tokens[i]);
               etSpice = Double.parseDouble(tokens[1]);
               xSpice = Double.parseDouble(tokens[2]);
               ySpice = Double.parseDouble(tokens[3]);
               zSpice = Double.parseDouble(tokens[4]);
               rSpice = Double.parseDouble(tokens[5]);
               //
               // Convert Spice et to VSOP t
               //
               tVsop = DateFuncs.t(jdn++);
               etVsop = DateFuncs.et(tVsop) + DateFuncs.SPICE_T_OFFSET;
               VsopVsSpice.percentDiff(etVsop, etSpice, "ET");
               //
               // TODO: Get planet from filename
               //
               CoefsGenerated xyzFuncs = CoefsGenerated.stringConstructor(fileName);

               xVsop = xyzFuncs.X(tVsop) * CoefsGenerated.KM_PER_AU;
               VsopVsSpice.percentDiff(xVsop, xSpice, "X");

               yVsop = xyzFuncs.Y(tVsop) * CoefsGenerated.KM_PER_AU;
               VsopVsSpice.percentDiff(yVsop, ySpice, "Y");

               zVsop = xyzFuncs.Z(tVsop) * CoefsGenerated.KM_PER_AU;
               VsopVsSpice.percentDiff(zVsop, zSpice, "Z");

               rVsop = Math.sqrt(xVsop * xVsop + yVsop * yVsop + zVsop * zVsop);
               VsopVsSpice.percentDiff(rVsop, rSpice, "R");

               System.out.println();
               line = reader.readLine();
            }
            reader.close();
         } catch (IOException e) {
            e.printStackTrace();
         }

      }
   }

   public static void percentDiff(double vsop, double spice, String var) {
      double diff = Math.abs(vsop - spice);
      double percent = 100.0 * diff / Math.abs(spice);
      System.out.println("Var " + var + " percentage difference = "
              + String.format("%.6f", percent));
   }

}
