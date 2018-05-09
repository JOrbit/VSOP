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
public class EarthXYZTest {

   public EarthXYZTest() {
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
    * Test of Earth_X0 method, of class EarthXYZ.
    */
   @Test
   public void testEarth_X0() {
      System.out.println("testEarth_X0");
          
      int year = 2000;
      int month = 1;
      int day = 1;
      int julianDayNuber = VsopXYZRA.jDN(year, month, day);
      
      int hour = 0;
      int minute = 0;
      double second = 0.0;
      double julianDate = VsopXYZRA.jD(julianDayNuber, hour, minute, second);

      double t = VsopXYZRA.t(julianDate);
      System.out.println("t = " + t);
 
      double result = EarthXYZ.Earth_X0(t) ;
      System.out.println("result = " + result);
      double expResult = result; //TODO:
      
      System.out.println("No assertions!!!");
      
      assertEquals(expResult, result, 0.0);
      // TODO review the generated test code and remove the default call to fail.
   }
}
