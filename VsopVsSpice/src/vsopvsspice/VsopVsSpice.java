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

/**
 *
 * @author owner
 */
public class VsopVsSpice {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {

      for (String planet : CoefsGenerated.PLANETS_SPICE) {

         String fileName = "D:\\JOrbit\\Spice\\SpiceVsopMain\\" + planet
                 + "-ECLIPJ2000-SUN-XyzR.txt";

         System.out.println("fileName = " + fileName);

         int jdn = DateFuncs.J2000;

         double etSpice;
         double xSpice;
         double ySpice;
         double zSpice;
         double rSpice;
         double tVsop;
         double etVsop;
         double xVsop;
         double yVsop;
         double zVsop;
         double rVsop;

         double etMaxDiff = Double.NEGATIVE_INFINITY;
         double xMaxDiff = Double.NEGATIVE_INFINITY;
         double etXmaxDiff = Double.NEGATIVE_INFINITY;
         double yMaxDiff = Double.NEGATIVE_INFINITY;
         double etYmaxDiff = Double.NEGATIVE_INFINITY;
         double zMaxDiff = Double.NEGATIVE_INFINITY;
         double etZmaxDiff = Double.NEGATIVE_INFINITY;
         double rMaxDiff = Double.NEGATIVE_INFINITY;
         double etRmaxDiff = Double.NEGATIVE_INFINITY;

         double etMaxPrctDiff = Double.NEGATIVE_INFINITY;
         double xMaxPrctDiff = Double.NEGATIVE_INFINITY;
         double etXmaxPrctDiff = Double.NEGATIVE_INFINITY;
         double yMaxPrctDiff = Double.NEGATIVE_INFINITY;
         double etYmaxPrctDiff = Double.NEGATIVE_INFINITY;
         double zMaxPrctDiff = Double.NEGATIVE_INFINITY;
         double etZmaxPrctDiff = Double.NEGATIVE_INFINITY;
         double rMaxPrctDiff = Double.NEGATIVE_INFINITY;
         double etRmaxPrctDiff = Double.NEGATIVE_INFINITY;

         CoefsGenerated xyzFuncs = CoefsGenerated.stringConstructor(fileName);

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
               //
               // Convert VSOP AU to Kilometers
               //
               xVsop = xyzFuncs.X(tVsop) * CoefsGenerated.KM_PER_AU;
               yVsop = xyzFuncs.Y(tVsop) * CoefsGenerated.KM_PER_AU;
               zVsop = xyzFuncs.Z(tVsop) * CoefsGenerated.KM_PER_AU;
rVsop = CoefsGenerated.calcR(xVsop, yVsop, zVsop);

               double aDiff = Math.abs(etSpice - etVsop);
               if (aDiff > etMaxDiff) {
                  etMaxDiff = aDiff;
               }

               aDiff = Math.abs(xSpice - xVsop);
               if (aDiff > xMaxDiff) {
                  xMaxDiff = aDiff;
                  etXmaxDiff = etVsop;
               }

               aDiff = Math.abs(ySpice - yVsop);
               if (aDiff > yMaxDiff) {
                  yMaxDiff = aDiff;
                  etYmaxDiff = etVsop;
               }

               aDiff = Math.abs(zSpice - zVsop);
               if (aDiff > zMaxDiff) {
                  zMaxDiff = aDiff;
                  etZmaxDiff = etVsop;
               }

               aDiff = Math.abs(rSpice - rVsop);
               if (aDiff > rMaxDiff) {
                  rMaxDiff = aDiff;
                  etRmaxDiff = etVsop;
               }

               aDiff = percentDiff(etSpice, etVsop);
               if (aDiff > etMaxPrctDiff) {
                  etMaxPrctDiff = aDiff;
               }

               aDiff = percentDiff(xSpice, xVsop);
               if (aDiff > xMaxPrctDiff) {
                  xMaxPrctDiff = aDiff;
                  etXmaxPrctDiff = etSpice;
               }

               aDiff = percentDiff(ySpice, yVsop);
               if (aDiff > yMaxPrctDiff) {
                  yMaxPrctDiff = aDiff;
                  etYmaxPrctDiff = etSpice;
               }

               aDiff = percentDiff(zSpice, zVsop);
               if (aDiff > zMaxPrctDiff) {
                  zMaxPrctDiff = aDiff;
                  etZmaxPrctDiff = etSpice;
               }

               aDiff = percentDiff(rSpice, rVsop);
               if (aDiff > rMaxPrctDiff) {
                  rMaxPrctDiff = aDiff;
                  etRmaxPrctDiff = etSpice;
               }

               // System.out.println();
               line = reader.readLine();
            }

            //
            // Print Max Diffs
            //
            System.out.println("For Planet = " + planet);

            System.out.println("Max ET diff = " + etMaxDiff + "(s)");
            System.out.println("Max X diff = " + xMaxDiff + "(km)" + " at ET = " + etXmaxDiff);
            System.out.println("Max Y diff = " + yMaxDiff + "(km)" + " at ET = " + etYmaxDiff);
            System.out.println("Max Z diff = " + zMaxDiff + "(km)" + " at ET = " + etZmaxDiff);
            System.out.println("Max R diff = " + rMaxDiff + "(km)" + " at ET = " + etRmaxDiff);
            System.out.println("");

            System.out.println("Max ET% diff = " + etMaxPrctDiff + "(%)");
            System.out.println("Max X diff = " + xMaxPrctDiff + "(%)" + " at ET = " + etXmaxPrctDiff);
            System.out.println("Max Y diff = " + yMaxPrctDiff + "(%)" + " at ET = " + etYmaxPrctDiff);
            System.out.println("Max Z diff = " + zMaxPrctDiff + "(%)" + " at ET = " + etZmaxPrctDiff);
            System.out.println("Max R diff = " + rMaxPrctDiff + "(%)" + " at ET = " + etRmaxPrctDiff);
            System.out.println("");

            reader.close();
         } catch (IOException e) {
            e.printStackTrace();
         }

      }
   }

   public static double percentDiff(double vsop, double spice) {
      double diff = Math.abs(vsop - spice);
      double percent = 100.0 * diff / Math.abs(spice);
      return percent;
   }

}
