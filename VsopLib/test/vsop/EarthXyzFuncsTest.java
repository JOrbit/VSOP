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
public class EarthXyzFuncsTest {

   public EarthXyzFuncsTest() {
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
    * Test of Earth_X0 method, of class EarthXyzFuncs.
    */
   @Test
   public void testEarthXYZ() {
      System.out.println("testEarthXYZ");

      System.out.println("Tesing for 01/01/2000 12:00:00");

      int year = 2000;
      int month = 1;
      int day = 1;
      int julianDayNuber = DateFuncs.jDN(year, month, day);

      int hour = 12;
      int minute = 0;
      double second = 0.0;
      double julianDate = DateFuncs.jD(julianDayNuber, hour, minute, second);

      double t = DateFuncs.t(julianDate);
      System.out.println("t = " + t);

      System.out.println("Run 5 XYZ parameters.");
      EarthXyzFuncsTest.xYZParameters(t);

      System.out.println("Tesing for 06/01/2000 12:00:00");

      month = 8;
      julianDayNuber = DateFuncs.jDN(year, month, day);

      julianDate = DateFuncs.jD(julianDayNuber, hour, minute, second);

      t = DateFuncs.t(julianDate);
      System.out.println("t = " + t);

      System.out.println("Run 5 XYZ parameters.");
      EarthXyzFuncsTest.xYZParameters(t);

   }

   public static void xYZParameters(double t) {
      System.out.println("Test_X0");
      double result = EarthXyzFuncs.Earth_X0(t);
      System.out.println("result = " + result);
      double expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_X1");
      result = EarthXyzFuncs.Earth_X1(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_X2");
      result = EarthXyzFuncs.Earth_X2(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_X3");
      result = EarthXyzFuncs.Earth_X3(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_X4");
      result = EarthXyzFuncs.Earth_X4(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_X5");
      result = EarthXyzFuncs.Earth_X5(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_Y0");
      result = EarthXyzFuncs.Earth_Y0(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_Y1");
      result = EarthXyzFuncs.Earth_Y1(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_Y2");
      result = EarthXyzFuncs.Earth_Y2(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_Y3");
      result = EarthXyzFuncs.Earth_Y3(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_Y4");
      result = EarthXyzFuncs.Earth_Y4(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_Y5");
      result = EarthXyzFuncs.Earth_Y5(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);
   }

}
