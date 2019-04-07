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
public class SaturnCoefsGeneratedTest {

   public SaturnCoefsGeneratedTest() {
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
    * Test of Saturn_X0 method, of class SaturnCoefsGenerated.
    */
   @Test
   public void testSaturnXYZ() {

      System.out.println("testSaturnXYZ");
      SaturnCoefsGenerated saturnXyzFuncs = new SaturnCoefsGenerated();

      for (int i = 0; i < SaturnCoordTestValues.JDN.length; i++) {
         int jdn = SaturnCoordTestValues.JDN[i];
         double t = DateFuncs.t(jdn);
         double result = saturnXyzFuncs.X(t);
         //System.out.println("X result = " + result);
         double expResult = SaturnCoordTestValues.X[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = saturnXyzFuncs.Y(t);
         //System.out.println("Y result = " + result);
         expResult = SaturnCoordTestValues.Y[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = saturnXyzFuncs.Z(t);
         //System.out.println("Z result = " + result);
         expResult = SaturnCoordTestValues.Z[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

      }
   }
}
