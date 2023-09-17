/** *****************************************************************
    conversion.java
    Converts various measures from one unit to another

    @author Jeff Offutt & Ren Li

        @version 1.0    October 2000
        @version 2.0    June 2015
        @version 2.1    January 2020
********************************************************************* */
// Import Servlet Libraries
//import javax.servlet.*;
//import javax.servlet.http.*;

// Import Java Libraries
import java.io.*;
import java.util.*;
import java.lang.*;

// conversion class
//
// CONSTRUCTOR: no constructor specified (default)
//
// ****************  PUBLIC OPERATIONS  **********************************
// void  doGet()      --> Uses PrintHead() and PrintForm() to print the screen
// void  PrintHead()  --> Generates the head of the web page
// void  PrintForm()  --> Generates the form of the web page
// void  doPost()     --> Handles the conversions
// float convertX2Y() --> One for each conversion pair
//*************************************************************************
//
// The possible IOException on the PrintWriter is thrown up.

public class Conversion //extends HttpServlet
{

/*
public void doGet (HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException
{  // Prints the form initially with no values
   response.setContentType ("TEXT/HTML");
   PrintWriter out = response.getWriter ();
   PrintHead (response);
   // Needed for PrintForm, but empty is okay.
   Properties newvals = new Properties ();
   PrintForm (response, newvals);
}
*/

/*
private void PrintHead (HttpServletResponse response)
   throws ServletException, IOException
{
   PrintWriter out=response.getWriter ();
   out.println ("<html>");
   out.println ("<head>");
   out.println ("<title>Measurement units conversion</title>");

   out.println (" <script language=\"JavaScript\">");
   out.println ("");
   out.println (" <!--");
   out.println (" // Function borrowed from Thilo Rusche");
   out.println (" function ClearForm()");
   out.println (" {  // Set all the form values to blank.");
   out.println ("    var form = document.forms[0];");
   out.println ("    for (i=0; i < form.elements.length; i++)");
   out.println ("    {");
   out.println ("       if (form.elements[i].name != \"submit\" &&");
   out.println ("           form.elements[i].name != \"clear\")");
   out.println ("           form.elements[i].value = \"\";");
   out.println ("  }");
   out.println ("  return false;");
   out.println (" }");
   out.println (" //-->");
   out.println (" </script>");

   out.println ("</head>");
   out.println ("<body>");
   out.println ("<center><h2>On-line Measurement Conversion</h2></center>");
   out.println ("Jeff Offutt and Ren Li");
   out.println ("<hr>");
}
*/

/*
private void PrintForm (HttpServletResponse response, Properties newvals)
   throws ServletException, IOException
{
   response.setContentType ("text/html");
   PrintWriter out=response.getWriter ();

   out.print   ("<form method=\"post\"");
   out.println (" action=\"https://cs.gmu.edu:8443/offutt/servlet/conversion\">");
   out.println (" <p>");
   out.println (" <table cellspacing=0 cellpadding=5 border=0");
   out.print   ("  align=center>");
   out.println (" <tr align=right>");
   out.print   ("  <td><b>Fahrenheit  (F&#186;):</b> ");
   out.print   ("  <input type=\"text\" name=\"F\" size=6 value=\"");
   // New: Add the value from the newvals container.
   if (newvals.getProperty ("F") != null)
      out.print (newvals.getProperty ("F"));
    out.println ("\"></td>");

   out.println ("  <td><-----></td>");
   out.println ("  <td><b>Celsius (C&#186;):</b> ");
   out.print   ("  <input type=\"text\" name=\"C\" size=6 value=\"");
   if (newvals.getProperty ("C") != null)
      out.print (newvals.getProperty ("C"));
    out.println ("\"></td>");

   out.println (" <tr align=right>");
   out.println ("  <td><b>Inch (in):</b> ");
   out.print   ("  <input type=\"text\" name=\"in\" size=6 value=\"");
   if (newvals.getProperty ("in") != null)
      out.print (newvals.getProperty ("in"));
    out.println ("\"></td>");

   out.println ("  <td><-----></td>");
   out.println ("  <td><b>Centimeter (cm):</b> ");
   out.print   ("  <input type=\"text\" name=\"cm\" size=6 value=\"");
   if (newvals.getProperty ("cm") != null)
      out.print (newvals.getProperty ("cm"));
    out.println ("\"></td>");

   out.println (" <tr align=right>");
   out.println ("  <td><b>Feet (ft):</b> ");
   out.print   ("  <input type=\"text\" name=\"ft\" size=6 value=\"");
   if (newvals.getProperty ("ft") != null)
      out.print (newvals.getProperty ("ft"));
    out.println ("\"></td>");

   out.println ("  <td><-----></td>");
   out.println ("  <td><b>Meter (m):</b> ");
   out.print   ("  <input type=\"text\" name=\"m\" size=6 value=\"");
   if (newvals.getProperty ("m") != null)
      out.print (newvals.getProperty ("m"));
    out.println ("\"></td>");

   out.println (" <tr align=right>");
   out.println ("  <td><b>Mile (mi):</b> ");
   out.print   ("  <input type=\"text\" name=\"mi\" size=6 value=\"");
   if (newvals.getProperty ("mi") != null)
      out.print (newvals.getProperty ("mi"));
    out.println ("\"></td>");

   out.println ("  <td><-----></td>");
   out.println ("  <td><b>Kilometer (km):</b> ");
   out.print   ("  <inpUt type=\"text\" name=\"km\" size=6 value=\"");
   if (newvals.getProperty ("km") != null)
      out.print (newvals.getProperty ("km"));
    out.println ("\"></td>");

   out.println (" <tr align=right>");
   out.println ("  <td><b>Gallon (gal):</b> ");
   out.print   ("  <input type=\"text\" name=\"gal\" size=6 value=\"");
   if (newvals.getProperty ("gal") != null)
      out.print (newvals.getProperty ("gal"));
    out.println ("\"></td>");

   out.println ("  <td><-----></td>");
   out.println ("  <td><b>Liter (L):</b> ");
   out.print   ("  <input type=\"text\" name=\"L\" size=6 value=\"");
   if (newvals.getProperty ("L") != null)
      out.print (newvals.getProperty ("L"));
    out.println ("\"></td>");

   out.println (" <tr align=right>");
   out.println ("  <td><b>Ounce (oz):</b> ");
   out.print   ("  <input type=\"text\" name=\"oz\" size=6 value=\"");
   if (newvals.getProperty ("oz") != null)
      out.print (newvals.getProperty ("oz"));
    out.println ("\"></td>");

   out.println ("  <td><-----></td>");
   out.println ("  <td><b>Gram (g):</b> ");
   out.print   ("  <input type=\"text\" name=\"g\" size=6 value=\"");
   if (newvals.getProperty ("g") != null)
      out.print (newvals.getProperty ("g"));
    out.println ("\"></td>");

   out.println (" <tr align=right>");
   out.println ("  <td><b>Pound (lb):</b> ");
   out.print   ("  <input type=\"text\" name=\"lb\" size=6 value=\"");
   if (newvals.getProperty ("lb") != null)
      out.print (newvals.getProperty ("lb"));
    out.println ("\"></td>");

   out.println ("  <td><-----></td>");
   out.println ("  <td><b>Kilogram (kg):</b> ");
   out.print   ("  <input type=\"text\" name=\"kg\" size=6 value=\"");
   if (newvals.getProperty ("kg") != null)
      out.print (newvals.getProperty ("kg"));
    out.println ("\"></td>");

   out.println (" </table>");
   out.print   (" <table cellspacing=0 cellpadding=10");
   out.println ("   BORDER=0 ALIGN=center WIDTH=\"50%\">");
   out.println ("  <tr align=center>");
   out.println ("   <td><input name=\"submit\" type=\"submit\" value=\"Convert\"></td>");
   out.println ("   <td><input name=\"clear\" type=\"button\" value=\"Clear Form\"");
   out.println ("              onClick=\"ClearForm()\"></td>");
   out.println ("  </tr>");
   out.println (" </table>");
   out.println ("</form>");
   out.println ("<p>");

   out.println ("<hr>");

   out.println ("</body>");
   out.println ("</html>");
   out.close ();
}
*/

/** *****************************************************
 *  Overrides HttpServlet's doPost().
 *  Converts each entry in the form and prints the results
 *  at the top of an HTML page.
 *  The new values are printed in red (#FF0000).
********************************************************* */

/*
public void doPost (HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException
{
   response.setContentType("TEXT/HTML");
   PrintWriter out = response.getWriter();

   PrintHead(response);

   // Get the values from the textboxes in the form
   // Most are probably empty
   String FAsStr   = request.getParameter("F");
   String CAsStr   = request.getParameter("C");
   String inAsStr  = request.getParameter("in");
   String cmAsStr  = request.getParameter("cm");
   String ftAsStr  = request.getParameter("ft");
   String mAsStr   = request.getParameter("m");
   String miAsStr  = request.getParameter("mi");
   String kmAsStr  = request.getParameter("km");
   String galAsStr = request.getParameter("gal");
   String LAsStr   = request.getParameter("L");
   String ozAsStr  = request.getParameter("oz");
   String gAsStr   = request.getParameter("g");
   String lbAsStr  = request.getParameter("lb");
   String kgAsStr  = request.getParameter("kg");

   int n; // temporary number
   float num1, num2; // temporary numbers

   // Save the converted values into a container to add to form
   Properties newvals = new Properties();

   // temperature
   if (FAsStr != null && FAsStr.length() > 0)
   {  // Convert farenheit to celsius
      newvals.put("C", String.valueOf(convertF2C(FAsStr)));
   }
   if  (CAsStr != null && CAsStr.length() > 0)
   {  // Convert celsius to farenheit
      newvals.put("F", String.valueOf(convertC2F(CAsStr)));
   }

   // small distance
   if  (inAsStr != null && inAsStr.length() > 0)
   {  // Convert inches to centimeters
      newvals.put("cm", String.valueOf(convertIn2Cm(inAsStr)));
   }
   if  (cmAsStr != null && cmAsStr.length() > 0)
   {  // Convert centimeters to inches
      newvals.put("in", String.valueOf(convertCm2In(cmAsStr)));
   }

   // medium distance
   if  (ftAsStr != null && ftAsStr.length() > 0)
   {  // Convert feet to meters
      newvals.put("m", String.valueOf(convertF2M(ftAsStr)));
   }
   if  (mAsStr != null && mAsStr.length() > 0)
   {  // Convert meters to feet
      newvals.put("ft", String.valueOf(convertM2F(mAsStr)));
   }

   // large distance
   if  (miAsStr != null && miAsStr.length() > 0)
   {  // Convert miles to kilometers
      newvals.put("km", String.valueOf(convertM2K(miAsStr)));
   }
   if  (kmAsStr != null && kmAsStr.length() > 0)
   {  // Convert kilometers to miles
      newvals.put("mi", String.valueOf(convertK2M(kmAsStr)));
   }

   // volume
   if (galAsStr != null && galAsStr.length() > 0)
   {  // Convert gallons to liters
      newvals.put("L", String.valueOf(convertG2L(galAsStr)));
   }
   if  (LAsStr != null && LAsStr.length() > 0)
   {  // Convert liters to gallons
      newvals.put("gal", String.valueOf(convertL2G(LAsStr)));
   }

   // small weight
   if  (ozAsStr != null && ozAsStr.length() > 0)
   {  // Convert ounces to grams
      newvals.put("g", String.valueOf(convertOz2G(ozAsStr)));
   }
   if  (gAsStr != null && gAsStr.length() > 0)
   {  // Convert grams to ounces
      newvals.put("oz", String.valueOf(convertG2Oz(gAsStr)));
   }

   // medium weight
   if (lbAsStr != null && lbAsStr.length() > 0)
   {  // Convert pounds to kilograms
      newvals.put("kg", String.valueOf(convertLb2K(lbAsStr)));
   }
   if (kgAsStr != null && kgAsStr.length() > 0)
   {  // Convert kilograms to pounds
      newvals.put("lb", String.valueOf(convertK2Lb(kgAsStr)));
   }

   PrintForm (response, newvals);

   out.close ();
}
*/

/**
 * Gets the float from the string and rounds it to 2 digits past the decimal.
 * @param str The string argument that holds the float.
 * @return The float rounded to 2 digits past the decimal
 */
private static float RoundFirst(String str){
   float num1;
   int n;
   num1 = (Float.valueOf(str).floatValue());
   n    = Math.round(num1 * (float)100.0);
   return (float) (n / (float)100.0);
}

/**
 * Takes a float and rounds it to 4 decimals
 * @param num2 Float input argument
 * @return Float output with 4 decimals
 */
private static float RoundBack(float num2){
   int n;
   n    = Math.round(num2 * (float)10000.0);
   return (float) (n / (float)10000.0);
}

/**
 * Converts farenheit to celsius
 * @param FAsStr String input for farenheit
 * @return Float output for celsius
 */
private static float convertF2C (String FAsStr)
{
   float num1, num2;
   // Round
   num1 = RoundFirst(FAsStr);
   // Convert
   num2 = (float) ( ( (num1-32.0) * 5.0) / 9.0);
   // Round again
   num2 = RoundBack(num2);
   return (num2);
}

/**
 * Converts celsius to farenheit
 * @param CAsStr String input for celcius
 * @return Float output for farenheit
 */
private static float convertC2F (String CAsStr)
{
   float num1, num2;
   // Round
   num1 = RoundFirst(CAsStr);
   // Convert
   num2 = (float) ( (num1 * 9.0 / 5.0) + 32.0);
   // Round again
   num2 = RoundBack(num2);
   return(num2);
}

/**
 * Converts inches to centimeters
 * @param inAsStr String input for inches
 * @return Float output for centimeters
 */
private static float convertIn2Cm (String inAsStr)
{
   float num1, num2;
   // Round
   num1 = RoundFirst(inAsStr);
   // Convert
   num2 = (float) (num1 * 2.54);
   // Round again
   num2 = RoundBack(num2);
   return(num2);
}

/**
 * Converts centimeters to inches
 * @param cmAsStr String input for centimeters
 * @return Float output for inches
 */
private static float convertCm2In (String cmAsStr)
{
   float num1, num2;
   // Round
   num1 = RoundFirst(cmAsStr);
   // Convert
   num2 = (float) (num1 * 0.3937);
   // Round again
   num2 = RoundBack(num2);
   return(num2);
}

/**
 * Converts feet to meters
 * @param ftAsStr String input for feet
 * @return Float output for meters
 */
private static float convertF2M (String ftAsStr)
{
   float num1, num2;
   // Round
   num1 = RoundFirst(ftAsStr);
   // Convert
   num2 = (float) (num1 * 0.3048);
   // Round again
   num2 = RoundBack(num2);
   return(num2);
}

/**
 * Converts meters to feet
 * @param mAsStr String input for meters
 * @return Float output for feet
 */
private static float convertM2F (String mAsStr)
{
   float num1, num2;
   // Round
   num1 = RoundFirst(mAsStr);
   // Convert
   num2 = (float) (num1 / 0.3048);
   // Round again
   num2 = RoundBack(num2);
   return(num2);
}

/**
 * Converts miles to kilometers
 * @param miAsStr String input for miles
 * @return Float output for kilometers
 */
private static float convertM2K (String miAsStr)
{
   float num1, num2;
   // Round
   num1 = RoundFirst(miAsStr);
   // Convert
   num2 = (float) (num1 * 1.609);
   // Round again
   num2 = RoundBack(num2);
   return(num2);
}

/**
 * Converts kilometers to miles
 * @param kmAsStr String input for kilometers
 * @return Float output for miles
 */
private static float convertK2M (String kmAsStr)
{
   float num1, num2;
   // Round
   num1 = RoundFirst(kmAsStr);
   // Convert
   num2 = (float) (num1 * 0.6214);
   // Round again
   num2 = RoundBack(num2);
   return(num2);
}

/**
 * Converts gallons to liters
 * @param galAsStr String input for gallons
 * @return Float output for liters
 */
private static float convertG2L (String galAsStr)
{
   float num1, num2;
   // Round
   num1 = RoundFirst(galAsStr);
   // Convert
   num2 = (float) (num1 * 3.785);
   // Round again
   num2 = RoundBack(num2);
   return(num2);
}

/**
 * Converts liters to gallons
 * @param LAsStr String input for liters
 * @return Float output for gallons
 */
private static float convertL2G (String LAsStr)
{
   float num1, num2;
   // Round
   num1 = RoundFirst(LAsStr);
   // Convert
   num2 = (float) (num1 / 3.785);
   // Round again
   num2 = RoundBack(num2);
   return(num2);
}

/**
 * Converts ounces to grams
 * @param ozAsStr String input for ounces
 * @return Float output for grams
 */
private static float convertOz2G (String ozAsStr)
{
   float num1, num2;
   // Round
   num1 = RoundFirst(ozAsStr);
   // Convert
   num2 = (float) (num1 * 28.35);
   // Round again
   num2 = RoundBack(num2);
   return(num2);
}

/**
 * Converts grams to ounces
 * @param gAsStr String input for grams
 * @return Float output for ounches
 */
private static float convertG2Oz (String gAsStr)
{
   float num1, num2;
   // Round
   num1 = RoundFirst(gAsStr);
   // Convert
   num2 = (float) (num1 / 28.35);
   // Round again
   num2 = RoundBack(num2);
   return(num2);
}

/**
 * Converts pounds to kilograms
 * @param lbAsStr String input for pounds
 * @return Float output for kilograms
 */
private static float convertLb2K (String lbAsStr)
{
   float num1, num2;
   // Round
   num1 = RoundFirst(lbAsStr);
   // Convert
   num2 = (float) (num1 * 0.4536);
   // Round again
   num2 = RoundBack(num2);
   return(num2);
}

/**
 * Converts kilograms to pounds
 * @param kgAsStr String input for kilograms
 * @return Float output for pounds
 */
private static float convertK2Lb (String kgAsStr)
{
   float num1, num2;
   // Round
   num1 = RoundFirst(kgAsStr);
   // Convert
   num2 = (float) (num1 * 2.205);
   // Round again
   num2 = RoundBack(num2);
   return(num2);
}

/**
 * Converts hours to seconds
 * @param hrAsString String input for hours
 * @return Float output for seconds
 */
private static float convertH2S (String hrAsString)
{
    float num1, num2;
    num1 = Float.valueOf(hrAsString).floatValue();
    // Convert using unrounded value
    num2 = (float) (num1 * 60 * 60);
    // Round
    num2 = RoundBack(num2);
    return(num2);
}

/**
 * Converts seconds to hours
 * @param secAsString String input for seconds
 * @return Float output for hours
 */
private static float convertS2H (String secAsString)
{   // Convert seconds to hours
    float num1, num2;
    num1 = Float.valueOf(secAsString).floatValue();
    // Convert using unrounded value
    num2 = (float) ((num1 / 60f) / 60f);
    // Back to 2 digits
    num2 = RoundBack(num2);
    return(num2);
}

public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Welcome to conversion.java, type help for commands or exit to quit.");

      String cmd = "";
      String[] arguments;

      //default digits to round to
      int decimalDigits = 2;

      //command line loop
      while(!cmd.equals("exit")) {

      //get inputs
      cmd = input.nextLine();
      arguments = cmd.split(" ");

      switch (arguments[0]) {
      case "help":
         System.out.println("List of conversion commands:");
         System.out.println("F2C # - Farenheit to Celcius");
         System.out.println("C2F # - Celcius to Farenheit");
         System.out.println("In2Cm # - Inches to Centimeters");
         System.out.println("Cm2In # - Centimeters to Inches");
         System.out.println("F2M # - Feet to Meters");
         System.out.println("M2F # - Meters to Feet");
         System.out.println("M2K # - Miles to Kilometers");
         System.out.println("K2M # - Kilometers to Miles");
         System.out.println("G2L # - Gallons to Liters");
         System.out.println("L2G # - Liters to Gallons");
         System.out.println("Oz2G # - Ounces to Grams");
         System.out.println("G2Oz # - Grams to Ounces");
         System.out.println("Lb2K # - Pounds to Kilograms");
         System.out.println("K2Lb # - Kilograms to Pounds");
         System.out.println("H2S # - Hours to Seconds");
         System.out.println("S2H # - Seconds to Hours");
         System.out.println("exit - Quit the program");
         System.out.println("\nAdditional options:");
         System.out.println("decimal # - Set the number of digits past decimal point in result [0-4]");
         break;
      case "F2C":
         System.out.printf("%." + decimalDigits + "f\n", convertF2C(arguments[1]));
         break;
      case "C2F":
         System.out.printf("%." + decimalDigits + "f\n", convertC2F(arguments[1]));
         break;
      case "In2Cm":
         System.out.printf("%." + decimalDigits + "f\n", convertIn2Cm(arguments[1]));
         break;
      case "Cm2In":
         System.out.printf("%." + decimalDigits + "f\n", convertCm2In(arguments[1]));
         break;
      case "F2M":
         System.out.printf("%." + decimalDigits + "f\n", convertF2M(arguments[1]));
         break;
      case "M2F":
         System.out.printf("%." + decimalDigits + "f\n", convertM2F(arguments[1]));
         break;
      case "M2K":
         System.out.printf("%." + decimalDigits + "f\n", convertM2K(arguments[1]));
         break;
      case "K2M":
         System.out.printf("%." + decimalDigits + "f\n", convertK2M(arguments[1]));
         break;
      case "G2L":
         System.out.printf("%." + decimalDigits + "f\n", convertG2L(arguments[1]));
         break;
      case "L2G":
         System.out.printf("%." + decimalDigits + "f\n", convertL2G(arguments[1]));
         break;
      case "Oz2G":
         System.out.printf("%." + decimalDigits + "f\n", convertOz2G(arguments[1]));
         break;
      case "G2Oz":
         System.out.printf("%." + decimalDigits + "f\n", convertG2Oz(arguments[1]));
         break;
      case "Lb2K":
         System.out.printf("%." + decimalDigits + "f\n", convertLb2K(arguments[1]));
         break;
      case "K2Lb":
         System.out.printf("%." + decimalDigits + "f\n", convertK2Lb(arguments[1]));
         break;
      case "H2S":
         System.out.printf("%." + decimalDigits + "f\n", convertH2S(arguments[1]));
         break;
      case "S2H":
         System.out.printf("%." + decimalDigits + "f\n", convertS2H(arguments[1]));
         break;
      case "exit":
         System.out.println("Exiting the program.");
         break;
      case "decimal":
         int num = Integer.parseInt(arguments[1]);
         if (0 <= num && num <= 4) {
               decimalDigits = num;
               System.out.printf("Digits past decimal set to %d\n", decimalDigits);
         }
         else {
               System.out.println("Invalid argument: integer value must be from 0 to 4");
         }
         break;
      default:
         System.out.println("Invalid command, try again.");
         break;
      }
   }

   //cleanup scanner
   input.close();

	}
    
}