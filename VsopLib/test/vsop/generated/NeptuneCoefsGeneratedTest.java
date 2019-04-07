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
public class NeptuneCoefsGeneratedTest {

   public NeptuneCoefsGeneratedTest() {
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
    * Test of Neptune_X0 method, of class NeptuneCoefsGenerated.
    */
   @Test
   public void testNeptuneXYZ() {

      System.out.println("testNeptuneXYZ");
      NeptuneCoefsGenerated neptuneXyzFuncs = new NeptuneCoefsGenerated();

      for (int i = 0; i < NeptuneCoordTestValues.JDN.length; i++) {
         int jdn = NeptuneCoordTestValues.JDN[i];
         double t = DateFuncs.t(jdn);
         double result = neptuneXyzFuncs.X(t);
         //System.out.println("X result = " + result);
         double expResult = NeptuneCoordTestValues.X[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = neptuneXyzFuncs.Y(t);
         //System.out.println("Y result = " + result);
         expResult = NeptuneCoordTestValues.Y[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = neptuneXyzFuncs.Z(t);
         //System.out.println("Z result = " + result);
         expResult = NeptuneCoordTestValues.Z[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

      }
   }
}
