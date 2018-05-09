/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop;

/**
 *
 * @author owner
 */
public class VsopXYZRA {
   
   public static int jDN(int year, int month, int day) {
      int julianDayNumber;
      
      //jDN = (1461 * (year + 4800 + (month − 14)/12))/4 +(367 * (month − 2 − 12 * ((month − 14)/12)))/12 − (3 * ((year + 4900 + (month - 14)/12)/100))/4 + D − 32075;
      julianDayNumber = (1461 * (year + 4800 + (month - 14)/12))/4 +
              (367 * (month - 2 -  12 * ((month - 14)/12)))/12 - 
              (3  *((year + 4900 + (month - 14)/12)/100))/4 + 
              day - 32075;
      
      return julianDayNumber;
   }
   
   public static double jD(int julianDayNuber, int hour, int minute, double second) {
      double jD;
      
      jD = julianDayNuber + (hour -12)/24 + minute/1440 + second/864000;
      
      return jD;
   }

   public static double t(double julianDate) {
      double t;

      t = (julianDate - 2451545) / 365250;

      return t;
   }

}
