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
import vsop.generated.CoefsGenerated;
import vsop.generated.EarthCoefsGenerated;
import vsop.generated.JupiterCoefsGenerated;
import vsop.generated.MarsCoefsGenerated;
import vsop.generated.MercuryCoefsGenerated;
import vsop.generated.NeptuneCoefsGenerated;
import vsop.generated.SaturnCoefsGenerated;
import vsop.generated.UranusCoefsGenerated;
import vsop.generated.VenusCoefsGenerated;

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

      testLocalDateVsjND();

      int jdn = vsop.DateFuncs.getApiUsnoNavyJDN(2000, 1, 1);
      System.out.println("jdn = " + jdn);

      timeEarthCoefsGenerated();

      timeAllCoefsGenerated();

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

   public static void timeEarthCoefsGenerated() {

      System.out.println("Start: timeEarthCoefsGenerated");

      CoefsGenerated ecg = new EarthCoefsGenerated();

      double jd = 2458578.0;

      long start = System.currentTimeMillis();

      for (int i = 0; i < 1000; i++) {
         double x = ecg.X(jd);
         double y = ecg.Y(jd);
         double z = ecg.Z(jd);
         jd += 3.1415;
      }

      long end = System.currentTimeMillis();
      int elapsed = (int) (end - start);
      System.out.println("timeEarthCoefsGenerated elapsed = " + elapsed);

      System.out.println("End: timeEarthCoefsGenerated");
   }

   public static void timeAllCoefsGenerated() {

      System.out.println("Start: timeALLCoefsGenerated");

      CoefsGenerated mcg = new MercuryCoefsGenerated();
      CoefsGenerated vcg = new VenusCoefsGenerated();
      CoefsGenerated ecg = new EarthCoefsGenerated();
      CoefsGenerated rcg = new MarsCoefsGenerated();
      CoefsGenerated jcg = new JupiterCoefsGenerated();
      CoefsGenerated scg = new SaturnCoefsGenerated();
      CoefsGenerated ucg = new UranusCoefsGenerated();
      CoefsGenerated ncg = new NeptuneCoefsGenerated();

      double jd = 2458578.0;

      long start = System.currentTimeMillis();
      double x, y, z;
      for (int i = 0; i < 1000; i++) {
         // Mercury
         x = mcg.X(jd);
         y = mcg.Y(jd);
         z = mcg.Z(jd);

         // Venus
         x = vcg.X(jd);
         y = vcg.Y(jd);
         z = vcg.Z(jd);

         // Eartth
         x = ecg.X(jd);
         y = ecg.Y(jd);
         z = ecg.Z(jd);

         // Mars
         x = rcg.X(jd);
         y = rcg.Y(jd);
         z = rcg.Z(jd);

         // Jupiter
         x = jcg.X(jd);
         y = jcg.Y(jd);
         z = jcg.Z(jd);

         // Saturn
         x = scg.X(jd);
         y = scg.Y(jd);
         z = scg.Z(jd);

         // Uranus
         x = ucg.X(jd);
         y = ucg.Y(jd);
         z = ucg.Z(jd);

         // Neptune
         x = ncg.X(jd);
         y = ncg.Y(jd);
         z = ncg.Z(jd);

         jd += 3.1415;
      }

      long end = System.currentTimeMillis();
      int elapsed = (int) (end - start);
      System.out.println("timeAllCoefsGenerated elapsed = " + elapsed);

      System.out.println("End: timeAllCoefsGenerated");
   }

}
