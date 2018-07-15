/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop.arrays;

import vsop.arrays.EarthCoefsArrays;
import vsop.arrays.CoefsArrays;
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
public class EarthCoefsArraysTest {

   public EarthCoefsArraysTest() {
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
      EarthCoefsArrays earthCoefs = new EarthCoefsArrays();
      System.out.println("earthCoefs.getCoefs().size() = " + earthCoefs.getCoefs().size());
      int terms = 0;
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         terms += 3 * (EarthCoefsArrays.XTERMS[i] + EarthCoefsArrays.YTERMS[i] + EarthCoefsArrays.ZTERMS[i]);
      }
      System.out.println("terms = " + terms);
   }

   /**
    * Test of createAX method, of class EarthCoefsArrays.
    */
   @Test
   public void testCreateAX() {
      System.out.println("createAX");
      EarthCoefsArrays instance = new EarthCoefsArrays();
      double[][] result = instance.createAX();
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         for (int j = 0; j < EarthCoefsArrays.XTERMS[i]; j++) {
            System.out.println("AX[" + i + "][" + j + "] = " + result[i][j]);
         }
      }
   }

   /**
    * Test of getCoefs method, of class EarthCoefsArrays.
    */
   @Test
   public void testGetCoefs() {
      System.out.println("getCoefs");
      EarthCoefsArrays instance = new EarthCoefsArrays();
      List<Double> expResult = null;
      //     List<Double> result = instance.getCoefs();
      //   assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
   }

   /**
    * Test of createAY method, of class EarthCoefsArrays.
    */
   @Test
   public void testCreateAY() {
      System.out.println("createAY");
      EarthCoefsArrays instance = new EarthCoefsArrays();
      double[][] result = instance.createAY();
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         for (int j = 0; j < EarthCoefsArrays.YTERMS[i]; j++) {
            System.out.println("AY[" + i + "][" + j + "] = " + result[i][j]);
         }
      }

   }

   /**
    * Test of createAZ method, of class EarthCoefsArrays.
    */
   @Test
   public void testCreateAZ() {
      System.out.println("createAZ");
      EarthCoefsArrays instance = new EarthCoefsArrays();
      double[][] result = instance.createAZ();
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         for (int j = 0; j < EarthCoefsArrays.ZTERMS[i]; j++) {
            System.out.println("AZ[" + i + "][" + j + "] = " + result[i][j]);
         }
      }
   }

   /**
    * Test of createBX method, of class EarthCoefsArrays.
    */
   @Test
   public void testCreateBX() {
      System.out.println("createBX");
      EarthCoefsArrays instance = new EarthCoefsArrays();
      double[][] result = instance.createBX();
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         for (int j = 0; j < EarthCoefsArrays.XTERMS[i]; j++) {
            System.out.println("BX[" + i + "][" + j + "] = " + result[i][j]);
         }
      }
   }

   /**
    * Test of createBY method, of class EarthCoefsArrays.
    */
   @Test
   public void testCreateBY() {
      System.out.println("createBY");
      EarthCoefsArrays instance = new EarthCoefsArrays();
      double[][] result = instance.createBY();
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         for (int j = 0; j < EarthCoefsArrays.YTERMS[i]; j++) {
            System.out.println("BY[" + i + "][" + j + "] = " + result[i][j]);
         }
      }
   }

   /**
    * Test of createBZ method, of class EarthCoefsArrays.
    */
   @Test
   public void testCreateBZ() {
      System.out.println("createBZ");
      EarthCoefsArrays instance = new EarthCoefsArrays();
      double[][] result = instance.createBZ();
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         for (int j = 0; j < EarthCoefsArrays.ZTERMS[i]; j++) {
            System.out.println("BZ[" + i + "][" + j + "] = " + result[i][j]);
         }
      }
   }

   /**
    * Test of createCX method, of class EarthCoefsArrays.
    */
   @Test
   public void testCreateCX() {
      System.out.println("createCX");
      EarthCoefsArrays instance = new EarthCoefsArrays();
      double[][] result = instance.createCX();
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         for (int j = 0; j < EarthCoefsArrays.XTERMS[i]; j++) {
            System.out.println("CX[" + i + "][" + j + "] = " + result[i][j]);
         }
      }
   }

   /**
    * Test of createCY method, of class EarthCoefsArrays.
    */
   @Test
   public void testCreateCY() {
      System.out.println("createCY");
      EarthCoefsArrays instance = new EarthCoefsArrays();
      double[][] result = instance.createCY();
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         for (int j = 0; j < EarthCoefsArrays.YTERMS[i]; j++) {
            System.out.println("CY[" + i + "][" + j + "] = " + result[i][j]);
         }
      }
   }

   /**
    * Test of createCZ method, of class EarthCoefsArrays.
    */
   @Test
   public void testCreateCZ() {
      System.out.println("createCZ");
      EarthCoefsArrays instance = new EarthCoefsArrays();
      double[][] result = instance.createCZ();
      for (int i = 0; i < CoefsArrays.NUMGROUPS; i++) {
         for (int j = 0; j < EarthCoefsArrays.ZTERMS[i]; j++) {
            System.out.println("CZ[" + i + "][" + j + "] = " + result[i][j]);
         }
      }
   }

}
