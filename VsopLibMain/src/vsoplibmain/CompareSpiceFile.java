/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsoplibmain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import vsop.DateFuncs;
import vsop.generated.CoefsGenerated;
import vsop.generated.EarthCoefsGenerated;

/**
 *
 * @author owner
 */
public class CompareSpiceFile {

   public static void main(String[] args) {
      String fileName = "D:\\JOrbit\\Spice\\SpiceVsopMain\\EARTHJ2000SUNXyzR.txt";

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
            CompareSpiceFile.percentDiff(etVsop, etSpice, "ET");
            //
            // TODO: Get planet from filename
            //
            CoefsGenerated xyzFuncs = CompareSpiceFile.construct(fileName);

            xVsop = xyzFuncs.X(tVsop) * CoefsGenerated.KM_PER_AU;
            CompareSpiceFile.percentDiff(xVsop, xSpice, "X");

            yVsop = xyzFuncs.Y(tVsop) * CoefsGenerated.KM_PER_AU;
            CompareSpiceFile.percentDiff(yVsop, ySpice, "Y");

            zVsop = xyzFuncs.Z(tVsop) * CoefsGenerated.KM_PER_AU;
            CompareSpiceFile.percentDiff(zVsop, zSpice, "Z");

            rVsop = Math.sqrt(xVsop * xVsop + yVsop * yVsop + zVsop * zVsop);
            CompareSpiceFile.percentDiff(rVsop, rSpice, "R");

            System.out.println();
            line = reader.readLine();
         }
         reader.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static void percentDiff(double vsop, double spice, String var) {
      double diff = Math.abs(vsop - spice);
      double percent = 100.0 * diff / Math.abs(spice);
      System.out.println("Var " + var + " percentage difference = "
              + String.format("%.6f", percent));
   }
   
   public static CoefsGenerated construct(String fileName) {
      CoefsGenerated xyzFuncs = null;
      if (fileName.contains("EARTH")) {
         xyzFuncs = new EarthCoefsGenerated();
      }
      return xyzFuncs;
   }

}
