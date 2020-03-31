/** *****************************************************************
    bathroomReview.java   servlet example

        @author Jeff Offutt
********************************************************************* */
package servlet;
// Import Java Libraries
import java.io.*;
import java.util.*;

//Import Servlet Libraries
import javax.servlet.*;
import javax.servlet.http.*;

// twoButtons class
// CONSTRUCTOR: no constructor specified (default)
//
// ***************  PUBLIC OPERATIONS  **********************************
// public void doPost ()  --> prints a blank HTML page
// public void doGet ()  --> prints a blank HTML page
// private void PrintHead (PrintWriter out) --> Prints the HTML head section
// private void PrintBody (PrintWriter out) --> Prints the HTML body with
//              the form. Fields are blank.
// private void PrintBody (PrintWriter out, String lhs, String rhs, String rslt)
//              Prints the HTML body with the form.
//              Fields are filled from the parameters.
// private void PrintTail (PrintWriter out) --> Prints the HTML bottom
//***********************************************************************
import javax.servlet.annotation.WebServlet;

@WebServlet( name = "Assignment6", urlPatterns = {"/assignment6"} )
public class bathroomReview extends HttpServlet
{

// Location of servlet.
static String Domain  = "bathroomreviewresults.herokuapp.com";
static String Path    = "/";
static String Servlet = "";


// Other strings.
static String Style ="https://www.cs.gmu.edu/~offutt/classes/432/432-style.css";
static String formHandler = "https://cs.gmu.edu:8443/offutt/servlet/formHandler";

/** *****************************************************
 *  Overrides HttpServlet's doPost().
 *  Converts the values in the form, performs the operation
 *  indicated by the submit button, and sends the results
 *  back to the client.
********************************************************* */
public void doPost (HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException
{
   response.setContentType("text/html");
   PrintWriter out = response.getWriter();
   PrintBody(out, lhsStr, rhsStr, rslt.toString());
   PrintTail(out);
}  // End doPost

/** *****************************************************
 *  Overrides HttpServlet's doGet().
 *  Prints an HTML page with a blank form.
********************************************************* */
public void doGet (HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException
{
   response.setContentType("text/html");
   PrintWriter out = response.getWriter();
   PrintBody(out);
   PrintTail(out);
} // End doGet

/** *****************************************************
 *  Prints the <head> of the HTML page, no <body>.
********************************************************* */

/** *****************************************************
 *  Prints the <BODY> of the HTML page with the form data
 *  values from the parameters.
********************************************************* */
private void PrintBody (PrintWriter out, String lhs, String rhs, String rslt)
{
    out.println("<html>");
    out.println("<head>");
    out.println("  <title>");
    out.println("    GMU Bathroom Reviewer");
    out.println("  </title>");
    out.println("  <style type="text/css">");
    out.println("  h1{");
    out.println("    text-align: center;");
    out.println("    font-size:3em;");
    out.println("  }");
    out.println("  h3{");
    out.println("  text-align: center;");
    out.println("    font-size:1.25em;");
    out.println("  }");
    out.println("  p{");
    out.println("    text-align: center;");
    out.println("  }");
    out.println("  body{");
    out.println("      background-color: lightyellow;");
    out.println("    padding-left: 10em;");
    out.println("    padding-right: 10em;");
    out.println("  }");
    out.println("  form{");
    out.println("    text-align: center;");
    out.println("  }");
    out.println("  </style>");
    out.println("</head>");
    out.println("");
    out.println("<body>");
    out.println("");
    out.println("<h1>GMU Bathroom Reviewer</h1>");
    out.println("<p>This web app allows you to review the bathrooms of a building at GMU in Fairfax.</p>");
    out.println("<h3>Please select a building.</h3>");
    out.println("<!-- https://cs.gmu.edu:8443/offutt/servlet/formHandler -->");
    out.println("<form method="post" action="https://cs.gmu.edu:8443/offutt/servlet/formHandler" id="myForm">");
    out.println("<select name="building">");
    out.println("    <option value="Volgenau" selected="selected">Volgenau School of Engineering</option>");
    out.println("    <option value="Music">Music Theater Building</option>");
    out.println("    <option value="SUB1">Sub1</option>");
    out.println("    <option value="HUB">The Hub</option>");
    out.println("    <option value="deLaski">deLaski Performing Arts Building</option>");
    out.println("    <option value="Planetary">Planetary Hall</option>");
    out.println("    <option value="Innovation">Innovation Hall</option>");
    out.println("");
    out.println("</select>");
    out.println("");
    out.println("    <h3>");
    out.println("        Cleanliness");
    out.println("    </h3>");
    out.println("    <p style=“text-align:justify”>");
    out.println("    <input type="radio" name="clean" id="veryDirty" value="veryDirty" checked/>");
    out.println("    <label for="veryDirty">Very Dirty</label>");
    out.println("            <input type="radio" name="clean" id="dirty" value="dirty" />");
    out.println("    <label for="dirty">Dirty</label>");
    out.println("            <input type="radio" name="clean" id="slightlyMessy" value="slightlyMessy" />");
    out.println("    <label for="slightlyMessy">Slightly Messy</label>");
    out.println("            <input type="radio" name="clean" id="mostlyClean" value="mostlyClean" />");
    out.println("    <label for="mostlyClean">Mostly Clean</label>");
    out.println("            <input type="radio" name="clean" id="completelyClean" value="completelyClean" />");
    out.println("    <label for="completelyClean">Completely Clean</label>");
    out.println("    </p>");
    out.println("");
    out.println("");
    out.println("    <h3>");
    out.println("        Odor");
    out.println("    </h3>");
    out.println("    <p style=“text-align:justify”>");
    out.println("    <input type="radio" name="odor" id="unbearable" value="unbearable" checked/>");
    out.println("        <label for="unbearable">Unbearable</label>");
    out.println("    <input type="radio" name="odor" id="unpleasant" value="unpleasant" />");
    out.println("        <label for="unpleasant">Unpleasant</label>");
    out.println("    <input type="radio" name="odor" id="moderate" value="moderate" />");
    out.println("        <label for="moderate">Moderate</label>");
    out.println("    <input type="radio" name="odor" id="unnoticeable" value="unnoticeable" />");
    out.println("        <label for="unnoticeable">Unnoticeable</label>");
    out.println("    <input type="radio" name="odor" id="fresh" value="fresh" />");
    out.println("        <label for="fresh">Fresh</label><br/>");
    out.println("    </p>");
    out.println("");
    out.println("    <h3>");
    out.println("    Would you use this restroom again?<br/>");
    out.println("  </h3>");
    out.println("  <input type="radio" name="wouldUseAgain" id="yes" value="yes" />");
    out.println("      <label for="yes">Yes</label><br/>");
    out.println("  <input type="radio" name="wouldUseAgain" id="no" value="no" checked/>");
    out.println("      <label for="no">No</label><br/>");
    out.println("");
    out.println("<h3>");
    out.println("    Any additional comments");
    out.println("</h3>");
    out.println("");
    out.println("");
    out.println("<textarea id="userComments" name="userComments" form="myForm" style="width:700px; height:150px;" rows="50" cols="300" placeholder="Enter your message..."></textarea>");
    out.println("");
    out.println("  <br/><br/>");
    out.println("");
    out.println("");
    out.println("    <button onclick="getScore()">Submit</button>");
    out.println("    <p><a href="https://bathroomreviewresults.herokuapp.com">SWE432 Assignment 6</a></p>");
    out.println("");
    out.println("    <p><a href="https://github.com/mrchrisp96/BathroomReviewResults">GitHub Executable Code</a></p>");
    out.println("</form>");
    out.println("");
    out.println("<script>");
    out.println("function doGet() {");
    out.println("    ");
    out.println("}");
    out.println("function getScore(){");
    out.println("   var i = 0;");
    out.println("   var odor = -1;");
    out.println("   var clean = -1;");
    out.println("   var would = 0;");
    out.println("   let cIDs = ["veryDirty","dirty","slightlyMessy","mostlyClean","completelyClean"];");
    out.println("   let oIDs = ["unbearable","unpleasant","moderate","unnoticeable","fresh"];");
    out.println("   while (i<5){");
    out.println("     if (document.getElementById(cIDs[i]).checked){");
    out.println("       clean = i;");
    out.println("     }");
    out.println("     if (document.getElementById(oIDs[i]).checked){");
    out.println("       odor = i;");
    out.println("     }");
    out.println("     i = i + 1;");
    out.println("   }");
    out.println("   if (document.getElementById("yes").checked){");
    out.println("     would = 1;");
    out.println("   }");
    out.println("");
    out.println("   let score = (12 * clean) + (8 * odor) + (would * 20);");
    out.println("");
    out.println("   window.alert("Restroom review score: " + score + " out of 100");");
    out.println("}");
    out.println("</script>");
    out.println("");
    out.println("</body>");
    out.println("</html>");

    
} // End PrintBody

/** *****************************************************
 *  Overloads PrintBody (out,lhs,rhs,rslt) to print a page
 *  with blanks in the form fields.
********************************************************* */
private void PrintBody (PrintWriter out)
{
   PrintBody(out, "", "", "");
}

/** *****************************************************
 *  Prints the bottom of the HTML page.
********************************************************* */
private void PrintTail (PrintWriter out)
{
   out.println("");
   out.println("</html>");
} // End PrintTail

}  // End twoButtons
