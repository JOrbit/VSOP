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

   //
   // NOTE: Does not work for Gregorian Dates prior to 1588
   //
   public static int jDN(int year, int month, int day) {

      /*
      Taken from http://aa.usno.navy.mil/faq/docs/JD_Formula.php
      NOTE: Most other websites have truncated version of the above site's 
      formula.
       */
      int julianDayNumber;

      long I = year;
      long J = month;
      long K = day;

      double jdnd = K - 32075 + 1461 * (I + 4800 + (J - 14) / 12) / 4 + 367 * (J - 2 - (J - 14) / 12 * 12) / 12
              - 3 * ((I + 4900 + (J - 14) / 12) / 100) / 4;

      //
      // NOTE: There are no Gregorian Dats between 10/15/1582 and 10/04/1582
      //
      if (year <= 1582) {
         if (year < 1582) {
            jdnd += 10;
         } else if (month <= 10) {
            if (month < 10) {
               jdnd += 10;
            } else if (day < 15) {
               jdnd += 10;
            }
         }
      }

         System.out.println("jdnd = " + jdnd);
         julianDayNumber = (int) jdnd;

         return julianDayNumber;
      }

   

   public static double jD(int julianDayNuber, int hour, int minute, double second) {
      double jD;

      jD = julianDayNuber + (hour - 12) / 24 + minute / 1440 + second / 864000;

      return jD;
   }

   public static double t(double julianDate) {
      double t;

      t = (julianDate - 2451545) / 365250;

      return t;
   }

}
