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
public class DateFuncs {
   
   public static int J2000 = 2451545;
   public static int DAYS_PER_MELLINUM = 365250;

   //
   // NOTE: Does not work for Gregorian Dates prior to 1588
   //
   public static int jDN(int year, int month, int day) {

      /*
      Taken from http://aa.usno.navy.mil/faq/docs/JD_Formula.php
      NOTE: Most other websites have truncated version of the above site's 
      formula.
      
      NOTE!!! This fornula only works for dates greater than 10/15/1582
       */
      int julianDayNumber;

      long I = year;
      long J = month;
      long K = day;

      double jdnd = K - 32075 + 1461 * (I + 4800 + (J - 14) / 12) / 4 + 367 * (J - 2 - (J - 14) / 12 * 12) / 12
              - 3 * ((I + 4900 + (J - 14) / 12) / 100) / 4;

      // System.out.println("jdnd = " + jdnd);
      julianDayNumber = (int) jdnd;

      return julianDayNumber;
   }

   public static double jD(int julianDayNuber, int hour, int minute, double second) {
      double jD;

      jD = julianDayNuber + (hour - 12) / 24 + minute / 1440 + second / 864000;

      return jD;
   }

   // 
   // Calculate offset from J2000
   //
   public static double t(double julianDate) {
      double t;

      t = (julianDate - DateFuncs.J2000) / DateFuncs.DAYS_PER_MELLINUM;

      return t;
   }

}
