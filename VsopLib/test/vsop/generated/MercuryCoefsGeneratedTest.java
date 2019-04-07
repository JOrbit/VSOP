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
public class MercuryCoefsGeneratedTest {

   public MercuryCoefsGeneratedTest() {
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
    * Test of Mercury_X0 method, of class MercuryCoefsGenerated.
    */
   @Test
   public void testMercuryXYZ() {

      System.out.println("testMercuryXYZ");
      MercuryCoefsGenerated mercuryXyzFuncs = new MercuryCoefsGenerated();

      for (int i = 0; i < MercuryCoordTestValues.JDN.length; i++) {
         int jdn = MercuryCoordTestValues.JDN[i];
         double t = DateFuncs.t(jdn);
         double result = mercuryXyzFuncs.X(t);
         //System.out.println("X result = " + result);
         double expResult = MercuryCoordTestValues.X[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = mercuryXyzFuncs.Y(t);
         //System.out.println("Y result = " + result);
         expResult = MercuryCoordTestValues.Y[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = mercuryXyzFuncs.Z(t);
         //System.out.println("Z result = " + result);
         expResult = MercuryCoordTestValues.Z[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

      }
   }
}
