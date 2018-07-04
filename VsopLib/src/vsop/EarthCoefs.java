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

   private List<Double> coefs = null;

   public EarthCoefs() {
      this.coefs = new ArrayList();
      this.parseDataFile();
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
