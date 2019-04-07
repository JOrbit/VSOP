/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop.generated;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import vsop.DateFuncs;

/**
 *
 * @author owner
 */
public class MarsCoefsGeneratedTest {

   public MarsCoefsGeneratedTest() {
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
    * Test of Mars_X0 method, of class MarsCoefsGenerated.
    */
   @Test
   public void testMarsXYZ() {

      System.out.println("testMarsXYZ");
      MarsCoefsGenerated marsXyzFuncs = new MarsCoefsGenerated();

      for (int i = 0; i < MarsCoordTestValues.JDN.length; i++) {
         int jdn = MarsCoordTestValues.JDN[i];
         double t = DateFuncs.t(jdn);
         double result = marsXyzFuncs.X(t);
         //System.out.println("X result = " + result);
         double expResult = MarsCoordTestValues.X[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = marsXyzFuncs.Y(t);
         //System.out.println("Y result = " + result);
         expResult = MarsCoordTestValues.Y[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = marsXyzFuncs.Z(t);
         //System.out.println("Z result = " + result);
         expResult = MarsCoordTestValues.Z[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

      }
   }
}
