/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop;

import java.util.List;
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
public class EarthCoefsTest {

   public EarthCoefsTest() {
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
      EarthCoefs earthCoefs = new EarthCoefs();
      System.out.println("earthCoefs.getCoefs().size() = " + earthCoefs.getCoefs().size());
      int terms = 0;
      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         terms += 3 * (EarthCoefs.XTERMS[i] + EarthCoefs.YTERMS[i] + EarthCoefs.ZTERMS[i]);
      }
      System.out.println("terms = " + terms);
   }

   /**
    * Test of createAX method, of class EarthCoefs.
    */
   @Test
   public void testCreateAX() {
      System.out.println("createAX");
      EarthCoefs instance = new EarthCoefs();
      double[][] result = instance.createAX();
      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         for (int j = 0; j < EarthCoefs.XTERMS[i]; j++) {
            System.out.println("AX[" + i + "][" + j + "] = " + result[i][j]);
         }
      }
   }

   /**
    * Test of getCoefs method, of class EarthCoefs.
    */
   @Test
   public void testGetCoefs() {
      System.out.println("getCoefs");
      EarthCoefs instance = new EarthCoefs();
      List<Double> expResult = null;
      //     List<Double> result = instance.getCoefs();
      //   assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
   }

   /**
    * Test of createAY method, of class EarthCoefs.
    */
   @Test
   public void testCreateAY() {
      System.out.println("createAY");
      EarthCoefs instance = new EarthCoefs();
      double[][] result = instance.createAY();
      for (int i = 0; i < Coefs.NUMGROUPS; i++) {
         for (int j = 0; j < EarthCoefs.YTERMS[i]; j++) {
            System.out.println("AY[" + i + "][" + j + "] = " + result[i][j]);
         }
      }

   }

}
