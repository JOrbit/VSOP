/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsoplibmain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author owner
 */
public class GeneratedToArrays {

   public static final String XYZPATHNAM = "D:\\JOrbit\\VSOP\\VsopLib\\src\\vsop\\EarthCoefsGenerated.java";
   public static final String COFPATHNAM = "D:\\JOrbit\\VSOP\\VsopLib\\src\\vsop\\EarthCoefsArrays.txt";

   public static class FuncNumKey {

      public static void main(String[] args) {

         try {

            FileWriter coefsFW = new FileWriter(COFPATHNAM);
            String output = null;
            List<String> aStrings = new ArrayList();
            List<String> bStrings = new ArrayList();
            List<String> cStrings = new ArrayList();
            FileReader xyzFR = new FileReader(XYZPATHNAM);
            BufferedReader br = new BufferedReader(xyzFR);
            String line;
            while ((line = br.readLine()) != null) {
               if (line.contains("double")) {
                  if (!line.contains("//")) {
//                  System.out.println("\n");
                     while (((line = br.readLine()) != null) && (!line.contains("return"))) {

                        // System.out.println("line = " + line + "\n");
                        String[] tokens = line.trim().split(" ");
                        String aValue;
                        if (tokens[1].contains("-")) {
                           aValue = "-" + tokens[2].replace(";", "");
                        } else {
                           aValue = tokens[2].replace(";", "");
                        }
                        // System.out.println("aValue = " + aValue);
                        aStrings.add(aValue);
                        String bValue = "0";
                        String cValue = "0";
                        if (line.contains("cos")) {
                           bValue = tokens[4].replace("Math.cos(", "");
//                        System.out.println("bValue = " + bValue);
                           cValue = tokens[6];
//                        System.out.println("cValue = " + cValue);
                        }
                        bStrings.add(bValue);
                        cStrings.add(cValue);

                     }

                  }
               }
            }
            for (String ad : aStrings) {
               output = ad + "\n";
               coefsFW.write(output);

            }
            for (String bd : bStrings) {
               output = bd + "\n";
               coefsFW.write(output);

            }
            for (String cd : cStrings) {
               output = cd + "\n";
               coefsFW.write(output);

            }

            coefsFW.flush();
            coefsFW.close();
            br.close();
            xyzFR.close();

         } catch (Exception ex) {
            Logger.getLogger(GeneratedToArrays.class
                    .getName()).log(Level.SEVERE, null, ex);
         }
      }
   }
}
