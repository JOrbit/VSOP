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
public class JupiterCoefsGeneratedTest {

   public JupiterCoefsGeneratedTest() {
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
    * Test of Jupiter_X0 method, of class JupiterCoefsGenerated.
    */
   @Test
   public void testJupiterXYZ() {

      System.out.println("testJupiterXYZ");
      JupiterCoefsGenerated jupiterXyzFuncs = new JupiterCoefsGenerated();

      for (int i = 0; i < JupiterCoordTestValues.JDN.length; i++) {
         int jdn = JupiterCoordTestValues.JDN[i];
         double t = DateFuncs.t(jdn);
         double result = jupiterXyzFuncs.X(t);
         //System.out.println("X result = " + result);
         double expResult = JupiterCoordTestValues.X[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = jupiterXyzFuncs.Y(t);
         //System.out.println("Y result = " + result);
         expResult = JupiterCoordTestValues.Y[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = jupiterXyzFuncs.Z(t);
         //System.out.println("Z result = " + result);
         expResult = JupiterCoordTestValues.Z[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

      }
   }
}
