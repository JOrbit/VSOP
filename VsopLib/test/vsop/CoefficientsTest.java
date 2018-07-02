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
import vsop.Coefficients.Planets;
import vsop.Coefficients.SixGroups;

/**
 *
 * @author owner
 */
public class CoefficientsTest {
   
   public CoefficientsTest() {
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
      
      System.out.println("Planets.EARTH = " + Planets.EARTH);
      System.out.println("Planets.valueOf(\"EARTH\") = " + Planets.valueOf("EARTH"));
      System.out.println("Planets.EARTH.orinal = " + Planets.EARTH.ordinal());
      Planets planets[] = Planets.values();
      for (Planets planet : planets) {
         System.out.println("planet = " + planet);
         System.out.println("planets.ordinal() = " + planet.ordinal());
      }
      
      SixGroups sixGroups[] = SixGroups.values();
      for (SixGroups sixGroup : sixGroups) {
         System.out.println("sixGroup = " + sixGroup);
         System.out.println("sixGroups.ordinal() = " + sixGroup.ordinal());
      }
      
   }
   
}
