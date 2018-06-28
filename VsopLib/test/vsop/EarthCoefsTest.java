/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop;

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

   /**
    * Test of validate method, of class EarthCoefs.
    */
   @Test
   public void testValidate() {
      System.out.println("validate");
      EarthCoefs instance = new EarthCoefs();
      boolean expResult = true;
      boolean result = instance.validate();
      assertEquals(expResult, result);
      
   }
   
}
