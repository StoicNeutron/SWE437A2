/** *****************************************************************
    conversion.java
    Converts various measures from one unit to another

    @author Jeff Offutt & Ren Li

        @version 1.0    October 2000
        @version 2.0    June 2015
        @version 2.1    January 2020
********************************************************************* */
// Import Servlet Libraries
import javax.servlet.*;
import javax.servlet.http.*;

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

public class conversion extends HttpServlet
{


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

/** *****************************************************
 *  Overrides HttpServlet's doPost().
 *  Converts each entry in the form and prints the results
 *  at the top of an HTML page.
 *  The new values are printed in red (#FF0000).
********************************************************* */

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


private float convertF2C (String FAsStr)
{  // Convert farenheit to celsius
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf(FAsStr).floatValue());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) ( ( (num1-32.0) * 5.0) / 9.0);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return (num2);
}

private float convertC2F (String CAsStr)
{  // Convert celsius to farenheit
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (CAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) ( (num1 * 9.0 / 5.0) + 32.0);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

// small distance
private float convertIn2Cm (String inAsStr)
{  // Convert inches to centimeters
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (inAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 2.54);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

private float convertCm2In (String cmAsStr)
{  // Convert centimeters to inches
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (cmAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 0.3937);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

// medium distance
private float convertF2M (String ftAsStr)
{  // Convert feet to meters
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (ftAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 0.3048);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

private float convertM2F (String mAsStr)
{  // Convert meters to feet
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (mAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 / 0.3048);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

// large distance
private float convertM2K (String miAsStr)
{  // Convert miles to kilometers
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (miAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 1.609);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

private float convertK2M (String kmAsStr)
{  // Convert kilometers to miles
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (kmAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 0.6214);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

// volume
private float convertG2L (String galAsStr)
{  // Convert gallons to liters
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (galAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 3.785);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

private float convertL2G (String LAsStr)
{  // Convert liters to gallons
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (LAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 / 3.785);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

// small weight
private float convertOz2G (String ozAsStr)
{  // Convert ounces to grams
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (ozAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 28.35);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

private float convertG2Oz (String gAsStr)
{  // Convert grams to ounces
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (gAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 / 28.35);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

// medium weight
private float convertLb2K (String lbAsStr)
{  // Convert pounds to kilograms
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (lbAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 0.4536);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

private float convertK2Lb (String kgAsStr)
{  // Convert kilograms to pounds
   float num1, num2; // temporary variables
   int n; // temporary variable
   // Round to 2 digits past decimal
   num1 = (Float.valueOf (kgAsStr).floatValue ());
   n    = Math.round(num1 * (float)100.0);
   num1 = (float) (n / (float)100.0);
   // Convert
   num2 = (float) (num1 * 2.205);
   // Back to 2 digits
   n    = Math.round(num2 * (float)100.0);
   num2 = (float) (n / (float)100.0);
   return(num2);
}

}
