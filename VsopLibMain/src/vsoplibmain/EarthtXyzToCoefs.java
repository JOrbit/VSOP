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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import vsop.Coefficients;

/**
 *
 * @author owner
 */
public class EarthtXyzToCoefs {

   public static final String XYZPATHNAM = "D:\\JOrbit\\VSOP\\VsopLib\\src\\vsop\\EarthXyzFuncs.java";
   public static final String COFPATHNAM = "D:\\JOrbit\\VSOP\\VsopLibMain\\src\\vsoplibmain\\EarthCoefs.java";

   public static void main(String[] args) {

      try {

         FileWriter coefsFW = new FileWriter(COFPATHNAM);
         String output;

         output = "/*\n"
                 + " * To change this license header, choose License Headers in Project Properties.\n"
                 + " * To change this template file, choose Tools | Templates\n"
                 + " * and open the template in the editor.\n"
                 + " */\n"
                 + "package vsop;\n"
                 + "\n"
                 + "/**\n"
                 + " *\n"
                 + " * @author owner\n"
                 + " */\n"
                 + "public class EarthCoefs {\n"
                 + "\n"
                 + "";
         coefsFW.write(output);

         output = "public static final int[][] NUMPARAMS = {\n"
                 + "{843, 491, 204, 18, 15, 6},\n"
                 + "{854, 496, 202, 17, 15, 6},\n"
                 + "{178, 120, 53, 12, 6, 2}\n"
                 + "};\n";
         coefsFW.write(output);

         Map<String, Map<String, List<Double>>> arrayNameToValues = new HashMap();
         FileReader xyzFR = new FileReader(XYZPATHNAM);
         BufferedReader br = new BufferedReader(xyzFR);
         String line;
         while ((line = br.readLine()) != null) {
            if (line.contains("double")) {
               if (!line.contains("//")) {
                  System.out.println("\n");
                  String arrayName = null;
                  List<Double> aValues = new ArrayList();
                  List<Double> bValues = new ArrayList();
                  List<Double> cValues = new ArrayList();
                  while (((line = br.readLine()) != null) && (!line.contains("return"))) {

                     String[] tokens = line.trim().split(" ");
//                     for (int i = 0; i < tokens.length; i++) {
//                        System.out.println("tokens[" + i + "] = " + tokens[i]);
//                     }
                     arrayName = tokens[0];
                     String aValue = tokens[2].replace(";", "");
//                    System.out.println("aValue = " + aValue);
                     aValues.add(Double.parseDouble(aValue));
                     String bValue = "0";
                     String cValue = "0";
                     if (line.contains("cos")) {
                        bValue = tokens[4].replace("Math.cos(", "");
//                        System.out.println("bValue = " + bValue);
                        cValue = tokens[6];
//                        System.out.println("cValue = " + cValue);
                     }
                     bValues.add(Double.parseDouble(bValue));
                     cValues.add(Double.parseDouble(cValue));

                  }
//                  System.out.println("arrayName = " + arrayName);
//                  for (int i = 0; i < aValues.size(); i++) {
//                     System.out.println("aValues.get(" + i + ") = " + aValues.get(i));
                  Map<String, List<Double>> abcValues = new HashMap();
                  abcValues.put("A", aValues);
                  abcValues.put("B", bValues);
                  abcValues.put("C", cValues);
                  arrayNameToValues.put(arrayName, abcValues);
               }
            }
         }

         Map<String, List<Double>> abcValues;
         Coefficients.SixGroups sixGroups[] = Coefficients.SixGroups.values();
         for (Coefficients.SixGroups sixGroup : sixGroups) {
            abcValues = arrayNameToValues.get(sixGroup.toString());
            System.out.println("sixGroup = " + sixGroup);
            System.out.println ("abcValues = " + abcValues);
         }

         output = "}\n";
         coefsFW.write(output);

         coefsFW.flush();
         coefsFW.close();
         br.close();
         xyzFR.close();

      } catch (Exception ex) {
         Logger.getLogger(EarthtXyzToCoefs.class.getName()).log(Level.SEVERE, null, ex);
      }
   }

}
