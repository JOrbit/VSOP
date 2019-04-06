/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop;

import vsop.generated.EarthCoordTestValues;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author owner
 */
public class DateFuncsTest {

   
   /*
VSOP87A EARTH     Date=2000 Jan 01 G   Time=12:00:00 TDB   JD=2451545

 X = -0.1771354586
 YYYY = +0.9672416237
 Z = -0.0000039000
 =====================================================================
 VSOP87A EARTH     Date=1899 Dec 31 G   Time=12:00:00 TDB   JD=2415020

 X = -0.1883079649
 YYYY = +0.9650688844
 Z = +0.0002150325
 =====================================================================
 VSOP87A EARTH     Date=1799 Dec 30 G   Time=12:00:00 TDB   JD=2378495

 X = -0.1993918002
 YYYY = +0.9627974368
 Z = +0.0004307602
 =====================================================================
 VSOP87A EARTH     Date=1699 Dec 29 G   Time=12:00:00 TDB   JD=2341970

 X = -0.2104654652
 YYYY = +0.9603579954
 Z = +0.0006472929
 =====================================================================
 VSOP87A EARTH     Date=1599 Dec 29 G   Time=12:00:00 TDB   JD=2305445 ???

 X = -0.2214982928
 YYYY = +0.9578483181
 Z = +0.0008568250
 =====================================================================
 VSOP87A EARTH     Date=1499 Dec 19 J   Time=12:00:00 TDB   JD=2268920

 X = -0.2324780153
 YYYY = +0.9551975793
 Z = +0.0010692878
 =====================================================================
 VSOP87A EARTH     Date=1399 Dec 19 J   Time=12:00:00 TDB   JD=2232395

 X = -0.2435134343
 YYYY = +0.9524373311
 Z = +0.0012871020
 =====================================================================
 VSOP87A EARTH     Date=1299 Dec 19 J   Time=12:00:00 TDB   JD=2195870

 X = -0.2544603371
 YYYY = +0.9495904257
 Z = +0.0014962103
 =====================================================================
 VSOP87A EARTH     Date=1199 Dec 19 J   Time=12:00:00 TDB   JD=2159345

 X = -0.2654547156
 YYYY = +0.9465233602
 Z = +0.0017037737
 =====================================================================
 VSOP87A EARTH     Date=1099 Dec 19 J   Time=12:00:00 TDB   JD=2122820

 X = -0.2763146784
 YYYY = +0.9433985307
 Z = +0.0019115387

    */
   public DateFuncsTest() {
   }

   @BeforeClass
   public static void setUpClass() {
   }

   @AfterClass
   public static void tearDownClass() {
   }

   @Before
   public void setUp() {
   }

   @After
   public void tearDown() {
   }

   /**
    * Test of jDN method, of class DateFuncs.
    */
   @Test
   public void testJDN() {
      System.out.println("jDN");

      for (int i = 0; i < EarthCoordTestValues.YYYY.length; i++) {
         int year = EarthCoordTestValues.YYYY[i];
         int month = EarthCoordTestValues.M[i];
         int day = EarthCoordTestValues.D[i];

         int expResult = EarthCoordTestValues.JDN[i];
         int result = DateFuncs.jDN(year, month, day);

         System.out.println("i = " + i);
         System.out.println("year = " + year);
         System.out.println("month = " + month);
         System.out.println("day = " + day);
         System.out.println("expResult = " + expResult);

         System.out.println("result = " + result);

         assertEquals(expResult, result);
      }
   }

   /**
    * Test of jD method, of class DateFuncs.
    */
   @Test
   public void testJD() {
      System.out.println("jD");

      for (int i = 0; i < EarthCoordTestValues.YYYY.length; i++) {
         int year = EarthCoordTestValues.YYYY[i];
         int month = EarthCoordTestValues.M[i];
         int day = EarthCoordTestValues.D[i];
         int julianDayNuber = DateFuncs.jDN(year, month, day);

         int hour = EarthCoordTestValues.H[i];
         int minute = EarthCoordTestValues.MM[i];
         double second = EarthCoordTestValues.S[i];

         double expResult = EarthCoordTestValues.JD[i];
         double result = DateFuncs.jD(julianDayNuber, hour, minute, second);

         System.out.println("i = " + i);
         System.out.println("year = " + year);
         System.out.println("month = " + month);
         System.out.println("day = " + day);
         System.out.println("julianDayNuber = " + julianDayNuber);

         System.out.println("hour = " + hour);
         System.out.println("minute = " + minute);
         System.out.println("second = " + second);

         System.out.println("expResult = " + expResult);

         System.out.println("result = " + result);

         assertEquals(expResult, result, 0.000000);
      }
   }

   /**
    * Test of t method, of class DateFuncs.
    */
   @Test
   public void testT() {
      System.out.println("t");
      for (int i = 0; i < EarthCoordTestValues.YYYY.length; i++) {
         int year = EarthCoordTestValues.YYYY[i];
         int month = EarthCoordTestValues.M[i];
         int day = EarthCoordTestValues.D[i];
         int julianDayNuber = DateFuncs.jDN(year, month, day);

         int hour = EarthCoordTestValues.H[i];
         int minute = EarthCoordTestValues.MM[i];
         double second = EarthCoordTestValues.S[i];
         double julianDate = DateFuncs.jD(julianDayNuber, hour, minute, second);

         double expResult = EarthCoordTestValues.J2000OFFSET[i];
         double result = DateFuncs.t(julianDate);

         System.out.println("i = " + i);
         System.out.println("year = " + year);
         System.out.println("month = " + month);
         System.out.println("day = " + day);
         System.out.println("julianDayNuber = " + julianDayNuber);

         System.out.println("hour = " + hour);
         System.out.println("minute = " + minute);
         System.out.println("second = " + second);
         System.out.println("julianDate = " + julianDate);

         System.out.println("expResult = " + expResult);

         System.out.println("result = " + result);

         //assertEquals(expResult, result, 0.000000);
      }

   }

}
