/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsoplibmain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author owner
 */
public class ConvertXyzToCoefs {
   
   public static final String XYZPATHNAM = "D:\\JOrbit\\VSOP\\VsopLib\\src\\vsop\\EarthXyzFuncs.java";
   
   public static void main(String[] args) {
      
      try {
         FileReader xyzFR = new FileReader(XYZPATHNAM);
         BufferedReader br = new BufferedReader(xyzFR);
         String line;
         while ((line = br.readLine()) != null) {
            if (line.contains("double")) {
               if (!line.contains("//")) {
                  while (((line = br.readLine()) != null) && (!line.contains("return"))) {
                     System.out.println(line);
                  }
               }
            }
         }
         br.close();
         xyzFR.close();
         
      } catch (Exception ex) {
         Logger.getLogger(ConvertXyzToCoefs.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
   
}
