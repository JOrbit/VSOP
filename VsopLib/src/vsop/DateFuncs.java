/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsop;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author owner
 */
public class DateFuncs {

   public static int J2000 = 2451545;
   public static int DAYS_PER_MILLENNIUM = 365250;
   public static LocalDate JDN0 = LocalDate.of(-4713, 1, 1);

   //
   // NOTE: Does not work for Gregorian Dates prior to 1588
   //
   public static int jDN(int year, int month, int day) {

      /*
      Taken from http://aa.usno.navy.mil/faq/docs/JD_Formula.php
      NOTE: Most other websites have truncated version of the above site's 
      formula.
      
      NOTE!!! This fornula only works for dates greater than 10/15/1582
       */
      int julianDayNumber;

      long I = year;
      long J = month;
      long K = day;

      double jdnd = K - 32075 + 1461 * (I + 4800 + (J - 14) / 12) / 4 + 367 * (J - 2 - (J - 14) / 12 * 12) / 12
              - 3 * ((I + 4900 + (J - 14) / 12) / 100) / 4;

      // System.out.println("jdnd = " + jdnd);
      julianDayNumber = (int) jdnd;

      return julianDayNumber;
   }

   public static double jD(int julianDayNuber, int hour, int minute, double second) {
      double jD;

      jD = julianDayNuber + (hour - 12) / 24 + minute / 1440 + second / 864000;

      return jD;
   }

   // 
   // Calculate offset from J2000
   //
   public static double t(double julianDate) {
      double t;

      t = (julianDate - DateFuncs.J2000) / DateFuncs.DAYS_PER_MILLENNIUM;

      return t;
   }

   public static int getApiUsnoNavyJDN(int year, int month, int day) {
      int jdn = Integer.MAX_VALUE;
      String urlString = "https://api.usno.navy.mil/"
              + "jdconverter?date=M/D/Y&time=12:00:00";

      urlString = urlString.replaceFirst("M", Integer.toString(month));
      urlString = urlString.replaceFirst("D", Integer.toString(day));
      urlString = urlString.replaceFirst("Y", Integer.toString(year));

      // System.out.println("urlString = " + urlString);
      HttpURLConnection connection = null;

      try {
         //Create connection
         URL url = new URL(urlString);
         connection = (HttpURLConnection) url.openConnection();
         connection.setRequestMethod("POST");
         connection.setRequestProperty("Content-Type",
                 "application/x-www-form-urlencoded");

         connection.setRequestProperty("Content-Length",
                 Integer.toString(urlString.getBytes().length));
         connection.setRequestProperty("Content-Language", "en-US");

         connection.setUseCaches(false);
         connection.setDoOutput(true);

         //Send request
         DataOutputStream wr = new DataOutputStream(
                 connection.getOutputStream());
         wr.writeBytes(urlString);
         wr.close();

         //Get Response  
         InputStream is = connection.getInputStream();
         BufferedReader rd = new BufferedReader(new InputStreamReader(is));
         String line;
         while ((line = rd.readLine()) != null) {
            // System.out.println("line = " + line);
            if (line.contains("jd")) {
               // System.out.println("line = " + line.trim());
               line = line.trim();
               line = line.replaceFirst("\"jd\":", " ");
               line = line.trim();
               // System.out.println("jd line" + line);
               double jd = Double.parseDouble(line);
               jdn = (int) jd;
            }
         }
         rd.close();
         return jdn;
      } catch (Exception e) {
         e.printStackTrace();
         return Integer.MIN_VALUE;
      } finally {
         if (connection != null) {
            connection.disconnect();
         }
      }
   }

   public static int localDateJdn(int year, int month, int day) {
      LocalDate ld = LocalDate.of(year, month, day);
      int daysBetween = (int) JDN0.until(ld, ChronoUnit.DAYS);
      return daysBetween;
   }

}
