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

   public enum Planets {
      MERCURY, VENUS, EARTH, MARS,
      JUPITER, SATURN, URANUS, NEPTUNE
   }

   
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {

      System.out.println("Planets.EARTH = " + Planets.EARTH);
      System.out.println("Planets.valueOf(\"EARTH\") = " + Planets.valueOf("EARTH"));
      System.out.println("Planets.EARTH.orinal = " + Planets.EARTH.ordinal());
      Planets planets[] = Planets.values();
      for (Planets planet : planets) {
         System.out.println("planet = " + planet);
         System.out.println("planets.ordinal() = " + planet.ordinal());
      }

      timeLocalDateJdn();

      timejDN();

      testLocalDateVsjND();

      int jdn = vsop.DateFuncs.getApiUsnoNavyJDN(2000, 1, 1);
      System.out.println("jdn = " + jdn);

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

      System.out.println("Start: timeLocalDateJdn");

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

      System.out.println("End: timeLocalDateJdn");
   }

   public static void timejDN() {
      System.out.println("Start: timejDN");

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

      System.out.println("End: timejDN");

   }

   public static void testLocalDateVsjND() {
      System.out.println("Start: testLocalDateVsjND");

      int year, month, day, jdn1, jdn2;
      long daysBetween, diff;
      ChronoLocalDate ld1, ld2;

      month = 10;
      day = 15;

      for (year = 1582; year < 2300; year = year + 99) {

         ld1 = LocalDate.of(year, month, day);
         jdn1 = vsop.DateFuncs.jDN(year, month, day);
         //System.out.println("ld1 = " + ld1);
         ld2 = LocalDate.of(year + 3, month, day);
         jdn2 = vsop.DateFuncs.jDN(year, month, day);
         //System.out.println("ld2 = " + ld2);
         daysBetween = ld1.until(ld2, ChronoUnit.DAYS);
         //System.out.println("daysBetween = " + daysBetween);
         diff = jdn2 - jdn1;
         if (diff != 0) {
            System.out.println("ERROR: diff is not 0 diff = " + diff);

         }
      }
      System.out.println("End: testLocalDateVsjND");
   }

}
