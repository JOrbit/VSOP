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
   public  void testEarthXYZ() {

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

      EarthXyzFuncs earthXyzFuncs = new EarthXyzFuncs();
      
      double result = earthXyzFuncs.X0(t);
      System.out.println("result = " + result);
      double expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_X1");
      result = earthXyzFuncs.X1(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_X2");
      result = earthXyzFuncs.X2(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_X3");
      result = earthXyzFuncs.X3(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_X4");
      result = earthXyzFuncs.X4(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_X5");
      result = earthXyzFuncs.X5(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_Y0");
      result = earthXyzFuncs.Y0(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_Y1");
      result = earthXyzFuncs.Y1(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_Y2");
      result = earthXyzFuncs.Y2(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_Y3");
      result = earthXyzFuncs.Y3(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_Y4");
      result = earthXyzFuncs.Y4(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);

      System.out.println("Test_Y5");
      result = earthXyzFuncs.Y5(t);
      System.out.println("result = " + result);
      expResult = result; //TODO:
      System.out.println("No assertions!!!");
      assertEquals(expResult, result, 0.0);
   }

}
