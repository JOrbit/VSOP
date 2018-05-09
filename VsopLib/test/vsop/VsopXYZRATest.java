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
public class VsopXYZRATest {

   public VsopXYZRATest() {
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
    * Test of jDN method, of class VsopXYZRA.
    */
   @Test
   public void testJDN() {
      System.out.println("jDN");
      int year = 2000;
      int month = 1;
      int day = 12;
      int expResult = 2451545;
      int result = VsopXYZRA.jDN(year, month, day);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of jD method, of class VsopXYZRA.
    */
   @Test
   public void testJD() {
      System.out.println("jD");
      int year = 2000;
      int month = 1;
      int day = 12;
      int julianDayNuber = VsopXYZRA.jDN(year, month, day);
      int hour = 0;
      int minute = 0;
      double second = 0.0;
      double expResult = 2451545.0;
      double result = VsopXYZRA.jD(julianDayNuber, hour, minute, second);
      assertEquals(expResult, result, 0.0);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

   /**
    * Test of t method, of class VsopXYZRA.
    */
   @Test
   public void testT() {
      System.out.println("t");
      
      int year = 2000;
      int month = 1;
      int day = 12;
      int julianDayNuber = VsopXYZRA.jDN(year, month, day);
      
      int hour = 0;
      int minute = 0;
      double second = 0.0;
      double julianDate = VsopXYZRA.jD(julianDayNuber, hour, minute, second);

      double expResult = 0.0;
      double result = VsopXYZRA.t(julianDate);
      System.out.println("t = " + result);
      assertEquals(expResult, result, 0.0);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }

}
