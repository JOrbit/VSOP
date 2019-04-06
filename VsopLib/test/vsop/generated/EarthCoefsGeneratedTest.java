/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop.generated;

import vsop.generated.EarthCoefsGenerated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import vsop.DateFuncs;
import static org.junit.Assert.*;

/**
 *
 * @author owner
 */
public class EarthCoefsGeneratedTest {

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
    * Test of Earth_X0 method, of class EarthCoefsGenerated.
    */
   @Test
   public void testEarthXYZ() {

      System.out.println("testEarthXYZ");
      EarthCoefsGenerated earthXyzFuncs = new EarthCoefsGenerated();

      for (int i = 0; i < EarthCoordTestValues.YYYY.length; i++) {
         int jdn = EarthCoordTestValues.JDN[i];
         double t = DateFuncs.t(jdn);
         double result = earthXyzFuncs.X(t);
         //System.out.println("X result = " + result);
         double expResult = EarthCoordTestValues.X[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = earthXyzFuncs.Y(t);
         //System.out.println("Y result = " + result);
         expResult = EarthCoordTestValues.Y[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = earthXyzFuncs.Z(t);
         //System.out.println("Z result = " + result);
         expResult = EarthCoordTestValues.Z[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

}

   }

   public void oldEarthXYZ() {

      System.out.println("oldEarthXYZ");
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
      EarthCoefsGeneratedTest.xYZParameters(t);

      System.out.println("Tesing for 06/01/2000 12:00:00");

      month = 8;
      julianDayNuber = DateFuncs.jDN(year, month, day);

      julianDate = DateFuncs.jD(julianDayNuber, hour, minute, second);

      t = DateFuncs.t(julianDate);
      System.out.println("t = " + t);

      System.out.println("Run 5 XYZ parameters.");
      EarthCoefsGeneratedTest.xYZParameters(t);

   }

   public static void xYZParameters(double t) {
      System.out.println("Test_X");

      EarthCoefsGenerated earthXyzFuncs = new EarthCoefsGenerated();

      double result = earthXyzFuncs.X(t);
      System.out.println("result = " + result);
      double expResult = -0.1771354586;
      System.out.println("expResult = " + expResult);
      assertEquals(expResult, result, 0.0000000001);

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
