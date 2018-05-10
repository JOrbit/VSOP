/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop;

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
      int year = 2000;
      int month = 1;
      int day = 1;
      int expResult = 2451545;
      int result = DateFuncs.jDN(year, month, day);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
   }

   /**
    * Test of jD method, of class DateFuncs.
    */
   @Test
   public void testJD() {
      System.out.println("jD");
      int year = 2000;
      int month = 1;
      int day = 1;
      int julianDayNuber = DateFuncs.jDN(year, month, day);
      int hour = 0;
      int minute = 0;
      double second = 0.0;
      double expResult = 2451545.0;
      double result = DateFuncs.jD(julianDayNuber, hour, minute, second);
      assertEquals(expResult, result, 0.0);
      // TODO review the generated test code and remove the default call to fail.
   }

   /**
    * Test of t method, of class DateFuncs.
    */
   @Test
   public void testT() {
      System.out.println("t");
      
      int year = 2000;
      int month = 1;
      int day = 1;
      int julianDayNuber = DateFuncs.jDN(year, month, day);
      
      int hour = 0;
      int minute = 0;
      double second = 0.0;
      double julianDate = DateFuncs.jD(julianDayNuber, hour, minute, second);

      double expResult = 0.0;
      double result = DateFuncs.t(julianDate);
      System.out.println("t = " + result);
      assertEquals(expResult, result, 0.0);
      // TODO review the generated test code and remove the default call to fail.
   }

}
