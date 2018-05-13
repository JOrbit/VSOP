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

      int year, month, day, usno;

      year = -4713;
      month = 1;
      day = 1;
      usno = 0;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = -10;
      month = 3;
      day = 22;
      usno = 1717851;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = 1000;
      month = 3;
      day = 22;
      usno = 2086389;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = 1582;
      month = 10;
      day = 4;
      usno = 2299160;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = 1582;
      month = 10;
      day = 15;
      usno = 2299161;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = 1953;
      month = 9;
      day = 30;
      usno = 2434651;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = 1969;
      month = 7;
      day = 16;
      usno = 2440419;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = 2000;
      month = 1;
      day = 1;
      usno = 2451545;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

      year = 2018;
      month = 5;
      day = 13;
      usno = 2458252;
      VsopLibMain.printJulianDayNumber(year, month, day, usno);

   }

   public static void printJulianDayNumber(int year, int month, int day, int usno) {
      System.out.println("year = " + year);
      System.out.println("month = " + month);
      System.out.println("day = " + day);
      System.out.println("usno = " + usno);
      int julianDayNumber = vsop.DateFuncs.jDN(year, month, day);
      System.out.println("julianDayNumber = " + julianDayNumber);
      int diff = usno - julianDayNumber;
      System.out.println("diff = " + diff);
   }

}
