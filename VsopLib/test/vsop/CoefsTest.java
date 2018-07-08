/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop;

import java.math.BigDecimal;
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
public class CoefsTest {

   public static final double EPS = 1.0E-8;

   public CoefsTest() {
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

   @Test
   public void testSomeMethod() {
      System.out.println("Planets.EARTH = " + Coefs.Planets.EARTH);
      System.out.println("Planets.valueOf(\"EARTH\") = " + Coefs.Planets.valueOf("EARTH"));
      System.out.println("Planets.EARTH.orinal = " + Coefs.Planets.EARTH.ordinal());
      Coefs.Planets planets[] = Coefs.Planets.values();
      for (Coefs.Planets planet : planets) {
         System.out.println("planet = " + planet);
         System.out.println("planets.ordinal() = " + planet.ordinal());
      }

   }

   /**
    * Test of X method, of class Coefs.
    */
   @Test
   public void testX() {
      System.out.println("X");
      EarthCoefs ec = new EarthCoefs();
      EarthXyzFuncs ef = new EarthXyzFuncs();
      for (int i = 0; i < TestData.JDN.length; i++) {
         double t = TestData.JDN[i];
         double expResult = ef.X(t);
         double[][] AX = ec.createAX();
         double[][] BX = ec.createBX();
         double[][] CX = ec.createCX();
         double result = Coefs.X(t, AX, BX, CX);

         System.out.println("testX: expResult = " + expResult);
         System.out.println("testX: result    = " + result);

         assertTrue(TestData.scaledComparison(expResult, result, CoefsTest.EPS));
      }
   }

   /**
    * Test of Y method, of class Coefs.
    */
   @Test
   public void testY() {
      System.out.println("Y");
      EarthCoefs ec = new EarthCoefs();
      EarthXyzFuncs ef = new EarthXyzFuncs();
      for (int i = 0; i < TestData.JDN.length; i++) {
         double t = TestData.JDN[i];
         double expResult = ef.Y(t);
         double[][] AY = ec.createAY();
         double[][] BY = ec.createBY();
         double[][] CY = ec.createCY();
         double result = Coefs.Y(t, AY, BY, CY);

         System.out.println("testY: expResult = " + expResult);
         System.out.println("testY: result    = " + result);

         assertTrue(TestData.scaledComparison(expResult, result, CoefsTest.EPS));
      }
   }

   /**
    * Test of Z method, of class Coefs.
    */
   @Test
   public void testZ() {
      System.out.println("Z");
      EarthCoefs ec = new EarthCoefs();
      EarthXyzFuncs ef = new EarthXyzFuncs();
      for (int i = 0; i < TestData.JDN.length; i++) {
         double t = TestData.JDN[i];
         double expResult = ef.Z(t);
         double[][] AZ = ec.createAZ();
         double[][] BZ = ec.createBZ();
         double[][] CZ = ec.createCZ();
         double result = Coefs.Z(t, AZ, BZ, CZ);

         System.out.println("testZ: expResult = " + expResult);
         System.out.println("testZ: result    = " + result);

         assertTrue(TestData.scaledComparison(expResult, result, CoefsTest.EPS));
      }
   }

   /**
    * Test of R method, of class Coefs.
    */
   @Test
   public void testR() {
      System.out.println("R");
      double X = 0.0;
      double Y = 0.0;
      double Z = 0.0;
      double expResult = 0.0;
      double result = Coefs.R(X, Y, Z);
   }

   /**
    * Test of X0 method, of class Coefs.
    */
   @Test
   public void testX0() {
      System.out.println("X0");

      EarthCoefs ec = new EarthCoefs();
      EarthXyzFuncs ef = new EarthXyzFuncs();

      for (int i = 0; i < TestData.JDN.length; i++) {
         double t = TestData.JDN[i];

         double expResult = ef.X0(t);

         double[][] AX = ec.createAX();
         double[][] BX = ec.createBX();
         double[][] CX = ec.createCX();
         double result = Coefs.X0(t, AX, BX, CX);

         System.out.println("testX0: expResult = " + expResult);
         System.out.println("testX0: result    = " + result);

         assertTrue(TestData.scaledComparison(expResult, result, CoefsTest.EPS));
      }
   }

   /**
    * Test of X1 method, of class Coefs.
    */
   @Test
   public void testX1() {
      System.out.println("X1");

      EarthCoefs ec = new EarthCoefs();
      EarthXyzFuncs ef = new EarthXyzFuncs();

      for (int i = 0; i < TestData.JDN.length; i++) {
         double t = TestData.JDN[i];

         double expResult = ef.X1(t);

         double[][] AX = ec.createAX();
         double[][] BX = ec.createBX();
         double[][] CX = ec.createCX();
         double result = Coefs.X1(t, AX, BX, CX);

         System.out.println("testX1: expResult = " + expResult);
         System.out.println("testX1: result    = " + result);

         assertTrue(TestData.scaledComparison(expResult, result, CoefsTest.EPS));
      }
   }

   /**
    * Test of X2 method, of class Coefs.
    */
   @Test
   public void testX2() {
      System.out.println("X2");

      EarthCoefs ec = new EarthCoefs();
      EarthXyzFuncs ef = new EarthXyzFuncs();

      for (int i = 0; i < TestData.JDN.length; i++) {
         double t = TestData.JDN[i];

         double expResult = ef.X2(t);

         double[][] AX = ec.createAX();
         double[][] BX = ec.createBX();
         double[][] CX = ec.createCX();
         double result = Coefs.X2(t, AX, BX, CX);

         System.out.println("testX2: expResult = " + expResult);
         System.out.println("testX2: result    = " + result);

         assertTrue(TestData.scaledComparison(expResult, result, CoefsTest.EPS));
      }

   }

   /**
    * Test of X3 method, of class Coefs.
    */
   @Test
   public void testX3() {
      System.out.println("X3");

      EarthCoefs ec = new EarthCoefs();
      EarthXyzFuncs ef = new EarthXyzFuncs();

      for (int i = 0; i < TestData.JDN.length; i++) {
         double t = TestData.JDN[i];

         double expResult = ef.X3(t);

         double[][] AX = ec.createAX();
         double[][] BX = ec.createBX();
         double[][] CX = ec.createCX();
         double result = Coefs.X3(t, AX, BX, CX);

         System.out.println("testX3: expResult = " + expResult);
         System.out.println("testX3: result    = " + result);

         assertTrue(TestData.scaledComparison(expResult, result, CoefsTest.EPS));
      }

   }

   /**
    * Test of X4 method, of class Coefs.
    */
   @Test
   public void testX4() {
      System.out.println("X4");
      EarthCoefs ec = new EarthCoefs();
      EarthXyzFuncs ef = new EarthXyzFuncs();

      for (int i = 0; i < TestData.JDN.length; i++) {
         double t = TestData.JDN[i];

         double expResult = ef.X4(t);

         double[][] AX = ec.createAX();
         double[][] BX = ec.createBX();
         double[][] CX = ec.createCX();
         double result = Coefs.X4(t, AX, BX, CX);

         System.out.println("testX4: expResult = " + expResult);
         System.out.println("testX4: result    = " + result);

         assertTrue(TestData.scaledComparison(expResult, result, CoefsTest.EPS));
      }

   }

   /**
    * Test of X5 method, of class Coefs.
    */
   @Test
   public void testX5() {
      System.out.println("X5");

      EarthCoefs ec = new EarthCoefs();
      EarthXyzFuncs ef = new EarthXyzFuncs();

      for (int i = 0; i < TestData.JDN.length; i++) {
         double t = TestData.JDN[i];

         double expResult = ef.X5(t);

         double[][] AX = ec.createAX();
         double[][] BX = ec.createBX();
         double[][] CX = ec.createCX();
         double result = Coefs.X5(t, AX, BX, CX);

         System.out.println("testX5: expResult = " + expResult);
         System.out.println("testX5: result    = " + result);

         assertTrue(TestData.scaledComparison(expResult, result, CoefsTest.EPS));
      }
   }

}
