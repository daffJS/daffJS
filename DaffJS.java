import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class DaffJS {
  public static void main(String[] args) {
    if(args.length == 0) {
      System.out.println("daffJS trenger input.");
    } else {
      String input = args[0];
      System.out.println(input);
      if(input.equals("hack")) {
        try {
          FileWriter myWriter = new FileWriter("daff.html");
          myWriter.write("<html> \n");
          myWriter.write(" <title>daffJS hacket reisverk</title>\n");
          myWriter.write(" <body>\n");
          myWriter.write("  <h1>passord: trodde du at du skulle finne passordet her?<h1>\n");
          myWriter.write("  <footer>Powered by daffJS</footer>\n");
          myWriter.write(" </body>\n");
          myWriter.write("</html>\n");
          myWriter.close();
          System.out.println("daffJS hacket ut i index.html.");
        } catch (IOException e) {
          System.out.println("An error occurred fjas.");
          e.printStackTrace();
        }
      } else if (input.equals("..")) {
        try {
          FileWriter myWriter = new FileWriter("daff.html");
          myWriter.write("<html> \n");
          myWriter.write(" <title>daffJS reisverk</title>\n");
          myWriter.write(" <body>\n");
          myWriter.write("  <h1>Dette er sida si det!<h1>\n");
          myWriter.write("  <h2>Hva forventet du her egentlig? Et passord? Du må nok lete litt nøyere.<h2>\n");
          myWriter.write("  <footer>Powered by daffJS</footer>\n");
          myWriter.write(" </body>\n");
          myWriter.write("</html>\n");
          myWriter.close();
          System.out.println("daffJS er bygget sir.");
        } catch (IOException e) {
          System.out.println("An error occurred fis.");
          e.printStackTrace();
        }
      } else {
        System.out.println("daffJS trenger input.");
      }
    }
    
  }
}