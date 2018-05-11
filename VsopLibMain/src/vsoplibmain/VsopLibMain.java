/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsoplibmain;

/**
 *
 * @author owner
 */
public class VsopLibMain {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int julianDayNumber;
      
      int year, month, day;

      year = -4713;
      month = 1;
      day = 1;
      VsopLibMain.printJulianDayNumber(year, month, day);

      year = 1582;
      month = 10;
      day = 15;
      VsopLibMain.printJulianDayNumber(year, month, day);

      year = 1588;
      month = 1;
      day = 1;
      VsopLibMain.printJulianDayNumber(year, month, day);

      year = 1950;
      month = 01;
      day = 01;
      VsopLibMain.printJulianDayNumber(year, month, day);

      year = 2000;
      month = 01;
      day = 01;
      VsopLibMain.printJulianDayNumber(year, month, day);

      year = 2018;
      month = 05;
      day = 11;
      VsopLibMain.printJulianDayNumber(year, month, day);

      year = 2200;
      month = 01;
      day = 01;
      VsopLibMain.printJulianDayNumber(year, month, day);
   }

   public static void printJulianDayNumber(int year, int month, int day) {
      System.out.println("year = " + year);
      System.out.println("month = " + month);
      System.out.println("day = " + day);
      int julianDayNumber = vsop.DateFuncs.jDN(year, month, day);
      System.out.println("julianDayNumber = " + julianDayNumber);
   }

}
