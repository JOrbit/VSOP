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
import vsop.Coefficients.Abc;
import vsop.Coefficients.Xyz;

/**
 *
 * @author owner
 */
public class EarthtXyzToCoefs {

   public static final String XYZPATHNAM = "D:\\JOrbit\\VSOP\\VsopLib\\src\\vsop\\EarthXyzFuncs.java";
   public static final String COFPATHNAM = "D:\\JOrbit\\VSOP\\VsopLibMain\\src\\vsoplibmain\\EarthCoefs.java";

   
   public static class FuncNumKey {

      public Xyz function;
      public int number;

      public FuncNumKey(Xyz function, int number) {
         this.function = function;
         this.number = number;
      }

      @Override
      public int hashCode() {
         int hash = 5;
         return hash;
      }

      @Override
      public boolean equals(Object obj) {
         if (this == obj) {
            return true;
         }
         if (obj == null) {
            return false;
         }
         if (getClass() != obj.getClass()) {
            return false;
         }
         final FuncNumKey other = (FuncNumKey) obj;
         if (this.number != other.number) {
            return false;
         }
         if (this.function != other.function) {
            return false;
         }
         return true;
      }

   }

   public static void main(String[] args) {

      try {

         FileWriter coefsFW = new FileWriter(COFPATHNAM);
         String output;

         output = "/*\n"
                 + " * To change this license header, choose License Headers in Project Properties.\n"
                 + " * To change this template file, choose Tools | Templates\n"
                 + " * and open the template in the editor.\n"
                 + " */\n"
                 + "package vsoplibmain;\n"
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

         Map<FuncNumKey, Map<Abc, List<Double>>> funcNumAbcDoubles = new HashMap();
         String function = null;
         String number = null;
         FuncNumKey funcNumKey = null;
         List<Double> aDoubles = null;
         List<Double> bDoubles = null;
         List<Double> cDoubles = null;
         FileReader xyzFR = new FileReader(XYZPATHNAM);
         BufferedReader br = new BufferedReader(xyzFR);
         String line;
         while ((line = br.readLine()) != null) {
            if (line.contains("double")) {
               if (!line.contains("//")) {
//                  System.out.println("\n");

                  aDoubles = new ArrayList();
                  bDoubles = new ArrayList();
                  cDoubles = new ArrayList();

                  while (((line = br.readLine()) != null) && (!line.contains("return"))) {

                     String[] tokens = line.trim().split(" ");
//                     for (int i = 0; i < tokens.length; i++) {
//                        System.out.println("tokens[" + i + "] = " + tokens[i]);
//                     }
                     function = tokens[0].substring(0, 1);
//                     System.out.println("function = " + function);
                     number = tokens[0].substring(1);
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

                  Map<Abc, List<Double>> abcDoubles = new HashMap();
                  abcDoubles.put(Abc.A, aDoubles);
                  abcDoubles.put(Abc.B, bDoubles);
                  abcDoubles.put(Abc.C, cDoubles);

                  Xyz funct = null;
                  if (function.contains("X")) {
                     funct = Xyz.X;
                  } else if (function.contains("Y")) {
                     funct = Xyz.Y;
                  } else if (function.contains("Z")) {
                     funct = Xyz.Z;
                  }

                  funcNumKey = new FuncNumKey(funct, Integer.parseInt(number));
                  funcNumAbcDoubles.put(funcNumKey, abcDoubles);
                  Map<Abc, List<Double>> abcListDouble = funcNumAbcDoubles.getOrDefault(funcNumKey, new HashMap());
                  //                 System.out.println("System.out.printlnabcListDouble = " + abcListDouble);
               }
            }
         }

         Abc abcs[] = Abc.values();
         for (Abc abc : abcs) {
//            System.out.println("abc.toString = " + abc.toString());
            Xyz xyzs[] = Xyz.values();
            for (Xyz xyz : xyzs) {
//               System.out.println("xyz.toString() = " + xyz.toString());
               output = "public static final double[][] "
                       + abc.toString() + xyz.toString()
                       + " = {\n{";
               for (int i = 0; i < Coefficients.NUMGROUPS; i++) {
//                  System.out.println("output = " + output);
                  funcNumKey = new FuncNumKey(xyz, i);
//                 System.out.println("funcNumKey = " + funcNumKey);
                  Map<Abc, List<Double>> abcListDouble = funcNumAbcDoubles.getOrDefault(funcNumKey, null);
                  List<Double> listDoubles = abcListDouble.getOrDefault(abc, null);
                  Double[] doubleArray = new Double[listDoubles.size()];
                  doubleArray = (Double[]) listDoubles.toArray(doubleArray);

                  for (int j = 0; j < doubleArray.length; j++) {
                     output += doubleArray[j];
//                   System.out.println("output = " + output);
                     if (j < (doubleArray.length - 1)) {
                        output += ",\n";
                     } else {
                        output += "\n";
                     }
                  }
                  if (i < (Coefficients.NUMGROUPS - 1)) {
                     output += "},\n{";
                  } else {
                     output += "}\n";
                  }
               }

               output += "};\n";
               //                 System.out.println("output = " + output);
               coefsFW.write(output);
               coefsFW.flush();

            }
            //           System.out.println("output = " + output);
            //coefsFW.write(output);
            //coefsFW.flush();
         }

         output = "}\n";
//         System.out.println("output = " + output);
         coefsFW.write(output);

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
