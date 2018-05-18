/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsoplibmain;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

/**
 *
 * @author owner
 */
public class VsopLibMain {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {

      timeLocalDateJdn();

      timejDN();

      int jdn = vsop.DateFuncs.getApiUsnoNavyJDN(2000, 1, 1);
      System.out.println("jdn = " + jdn);

      //testLocalDateVsjND();
      /*
      int year, month, day;

      int usno;

      year = -4713;
      month = 1;
      day = 1;
      usno = 0;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = -10;
      month = 3;
      day = 22;
      usno = 1717851;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = 1000;
      month = 3;
      day = 22;
      usno = 2086389;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = 1582;
      month = 10;
      day = 4;
      usno = 2299160;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = 1582;
      month = 10;
      day = 15;
      usno = 2299161;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = 1953;
      month = 9;
      day = 30;
      usno = 2434651;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = 1969;
      month = 7;
      day = 16;
      usno = 2440419;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = 2000;
      month = 1;
      day = 1;
      usno = 2451545;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = 2018;
      month = 5;
      day = 13;
      usno = 2458252;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);
       */
   }

   public static void printJulianDayNumber(int year, int month, int day, int usno) {
      System.out.println("year = " + year);
      System.out.println("month = " + month);
      System.out.println("day = " + day);
      System.out.println("usno = " + usno);
      int julianDayNumber = vsop.DateFuncs.jDN(year, month, day);
      System.out.println("julianDayNumber = " + julianDayNumber);
      int diff = usno - julianDayNumber;
      System.out.println("diff = " + diff);

   }

   public static void timeLocalDateJdn() {

      long start = System.currentTimeMillis();
      int i;
      for (i = 0; i < 1000000; i++) {
         Random r = new Random();
         int Low = 1584;
         int High = 2300;
         int year1 = r.nextInt(High - Low) + Low;
         Low = 1;
         High = 12;
         int month1 = r.nextInt(High - Low) + Low;
         Low = 1;
         High = 28;
         int day1 = r.nextInt(High - Low) + Low;

         int jdn = vsop.DateFuncs.localDateJdn(year1, month1, day1);
         // System.out.println("Result = " + Result);
      }
      long end = System.currentTimeMillis();
      int elapsed = (int) (end - start);
      System.out.println("timeLocalDate elapsed = " + elapsed);

   }

   public static void timejDN() {

      long start = System.currentTimeMillis();
      int i;
      for (i = 0; i < 1000000; i++) {
         Random r = new Random();
         int Low = 1584;
         int High = 2300;
         int year1 = r.nextInt(High - Low) + Low;
         Low = 1;
         High = 12;
         int month1 = r.nextInt(High - Low) + Low;
         Low = 1;
         High = 28;
         int day1 = r.nextInt(High - Low) + Low;

         int jdn = vsop.DateFuncs.jDN(year1, month1, day1);
      }
      long end = System.currentTimeMillis();
      int elapsed = (int) (end - start);
      System.out.println("timejDN elapsed = " + elapsed);

   }

   public static void testLocalDateVsjND() {
      int year, month, day, jdn1, jdn2;
      long daysBetween, diff;
      ChronoLocalDate ld1, ld2;

      month = 10;
      day = 15;

      for (year = 1582; year < 2300; year = year + 99) {

         ld1 = LocalDate.of(year, month, day);
         jdn1 = vsop.DateFuncs.jDN(year, month, day);
         System.out.println("ld1 = " + ld1);
         ld2 = LocalDate.of(year + 3, month, day);
         jdn2 = vsop.DateFuncs.jDN(year, month, day);
         System.out.println("ld2 = " + ld2);
         daysBetween = ld1.until(ld2, ChronoUnit.DAYS);
         System.out.println("daysBetween = " + daysBetween);
         diff = jdn2 - jdn1;
         if (diff != 0) {
            System.out.println("ERROR: diff is not 0 diff = " + diff);

         }
      }
   }

}
