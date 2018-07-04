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
public class EarthtXyzToCoefs {

   public static final String XYZPATHNAM = "D:\\JOrbit\\VSOP\\VsopLib\\src\\vsop\\EarthXyzFuncs.java";
   public static final String COFPATHNAM = "D:\\JOrbit\\VSOP\\VsopLib\\src\\vsop\\EarthCoefs.txt";

   public static class FuncNumKey {

      public static void main(String[] args) {

         try {

            FileWriter coefsFW = new FileWriter(COFPATHNAM);
            String output = null;
            List<Double> aDoubles = new ArrayList();
            List<Double> bDoubles = new ArrayList();
            List<Double> cDoubles = new ArrayList();
            FileReader xyzFR = new FileReader(XYZPATHNAM);
            BufferedReader br = new BufferedReader(xyzFR);
            String line;
            while ((line = br.readLine()) != null) {
               if (line.contains("double")) {
                  if (!line.contains("//")) {
//                  System.out.println("\n");
                     while (((line = br.readLine()) != null) && (!line.contains("return"))) {

                        String[] tokens = line.trim().split(" ");
//                     for (int i = 0; i < tokens.length; i++) {
//                        System.out.println("tokens[" + i + "] = " + tokens[i]);
//                     }
//                        function = tokens[0].substring(0, 1);
//                     System.out.println("function = " + function);
//                        number = tokens[0].substring(1);
//                     System.out.println("number = " + number);
                        String aValue = tokens[2].replace(";", "");
//                    System.out.println("aValue = " + aValue);                   
                        aDoubles.add(Double.parseDouble(aValue));
                        String bValue = "0";
                        String cValue = "0";
                        if (line.contains("cos")) {
                           bValue = tokens[4].replace("Math.cos(", "");
//                        System.out.println("bValue = " + bValue);
                           cValue = tokens[6];
//                        System.out.println("cValue = " + cValue);
                        }
                        bDoubles.add(Double.parseDouble(bValue));
                        cDoubles.add(Double.parseDouble(cValue));

                     }

                  }
               }
            }
            for (double ad : aDoubles) {
               output = ad + "\n";
               coefsFW.write(output);

            }
            for (double bd : bDoubles) {
               output = bd + "\n";
               coefsFW.write(output);

            }
            for (double cd : cDoubles) {
               output = cd + "\n";
               coefsFW.write(output);

            }

            coefsFW.flush();
            coefsFW.close();
            br.close();
            xyzFR.close();

         } catch (Exception ex) {
            Logger.getLogger(EarthtXyzToCoefs.class
                    .getName()).log(Level.SEVERE, null, ex);
         }
      }
   }
}
