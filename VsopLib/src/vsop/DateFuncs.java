/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop;

/**
 *
 * @author owner
 */
public class DateFuncs {

   //
   // NOTE: Does not work for Gregorian Dates prior to 1588
   //
   public static int jDN(int year, int month, int day) {

      int julianDayNumber;
      /* 
           From Wikipedia
       */
      double yd = year;
      double md = month;
      double dd = day;
      double jdnd = (1461d * (yd + 4800d + (md - 14d) / 12d)) / 4d
              + (367d * (md - 2d - 12d * ((md - 14d) / 12d))) / 12d
              - (3d * ((yd + 4900d + (md - 14d) / 12d) / 100d)) / 4d
              + dd - 32075d;

      System.out.println("jdnd = " + jdnd);

      /*
      Taken from 
       */
      int A = year / 100;
      int B = A / 4;
      int C = 2 - A + B;
      double Ed = 365.25d * (year + 4716);
      int E = (int) Ed;
      double Fd = 30.6001d * (month + 1);
      int F = (int) Fd;
      jdnd = C + day + E + F - 1524.5;
      System.out.println("jdnd = " + jdnd);
      julianDayNumber = (int) jdnd;

      /*
      Taken from http://aa.quae.nd/en/reken/judiaansedag.html see Julian Date to CJDN
      
      int J0 = 1721117;
      int c0 = Math.floorDiv(month - 3, 12);
      int J1 = Math.floorDiv(1461 * (year + c0), 4);
      int J2 = Math.floorDiv(153*month - 1836*c0 - 457, 5);
      
      julianDayNumber = J1 + J2 + day + J0;
       */
      return julianDayNumber;
   }

   public static double jD(int julianDayNuber, int hour, int minute, double second) {
      double jD;

      jD = julianDayNuber + (hour - 12) / 24 + minute / 1440 + second / 864000;

      return jD;
   }

   public static double t(double julianDate) {
      double t;

      t = (julianDate - 2451545) / 365250;

      return t;
   }

}
