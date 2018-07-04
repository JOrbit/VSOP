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
public class CoefsTest {
   
   public CoefsTest() {
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
      System.out.println("Planets.EARTH = " + Coefs.Planets.EARTH);
      System.out.println("Planets.valueOf(\"EARTH\") = " + Coefs.Planets.valueOf("EARTH"));
      System.out.println("Planets.EARTH.orinal = " + Coefs.Planets.EARTH.ordinal());
      Coefs.Planets planets[] = Coefs.Planets.values();
      for (Coefs.Planets planet : planets) {
         System.out.println("planet = " + planet);
         System.out.println("planets.ordinal() = " + planet.ordinal());
      }

   }
   
}
