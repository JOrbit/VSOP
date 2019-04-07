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
public class VenusCoefsGeneratedTest {

   public VenusCoefsGeneratedTest() {
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
    * Test of Venus_X0 method, of class VenusCoefsGenerated.
    */
   @Test
   public void testVenusXYZ() {

      System.out.println("testVenusXYZ");
      VenusCoefsGenerated venusXyzFuncs = new VenusCoefsGenerated();

      for (int i = 0; i < VenusCoordTestValues.JDN.length; i++) {
         int jdn = VenusCoordTestValues.JDN[i];
         double t = DateFuncs.t(jdn);
         double result = venusXyzFuncs.X(t);
         //System.out.println("X result = " + result);
         double expResult = VenusCoordTestValues.X[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = venusXyzFuncs.Y(t);
         //System.out.println("Y result = " + result);
         expResult = VenusCoordTestValues.Y[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = venusXyzFuncs.Z(t);
         //System.out.println("Z result = " + result);
         expResult = VenusCoordTestValues.Z[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

      }
   }
}
