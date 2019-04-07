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
public class UranusCoefsGeneratedTest {

   public UranusCoefsGeneratedTest() {
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
    * Test of Uranus_X0 method, of class UranusCoefsGenerated.
    */
   @Test
   public void testUranusXYZ() {

      System.out.println("testUranusXYZ");
      UranusCoefsGenerated uranusXyzFuncs = new UranusCoefsGenerated();

      for (int i = 0; i < UranusCoordTestValues.JDN.length; i++) {
         int jdn = UranusCoordTestValues.JDN[i];
         double t = DateFuncs.t(jdn);
         double result = uranusXyzFuncs.X(t);
         //System.out.println("X result = " + result);
         double expResult = UranusCoordTestValues.X[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = uranusXyzFuncs.Y(t);
         //System.out.println("Y result = " + result);
         expResult = UranusCoordTestValues.Y[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

         result = uranusXyzFuncs.Z(t);
         //System.out.println("Z result = " + result);
         expResult = UranusCoordTestValues.Z[i];
         //System.out.println("expResult = " + expResult);
         assertEquals(expResult, result, 0.0000000001);

      }
   }
}
