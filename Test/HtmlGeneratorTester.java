import com.company.Grammar;
import com.company.ParseException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.*;


public class HtmlGeneratorTester {

    @BeforeAll
    public static void setup(){
        String setup = String.format("setup");
        ByteArrayInputStream input = new ByteArrayInputStream(setup.getBytes());
        Grammar MockUpGrammar = new Grammar(input);
    }

    @Test
    public void imageTest() throws ParseException {
        String userInput = String.format("ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\"\n");
        String expected = "<img src=\"https://www.w3schools.com/html/pic_trulli.jpg\"/>";

        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);

        Grammar.ReInit(input);
        Grammar.Input();



        String[] lines = output.toString().split(System.lineSeparator());
        String actual = lines[0];

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void headingTest() throws ParseException {
        String userInput = String.format("ADD HEADING WITH TEXT \"Hello World\"\n");
        String expected = "<h1>Hello World</h1>";

        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);

        Grammar.ReInit(input);
        Grammar.Input();



        String[] lines = output.toString().split(System.lineSeparator());
        String actual = lines[0];

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void firstParagraphTest() throws ParseException {
        String userInput = String.format("ADD PARAGRAPH WITH TEXT \"Welcome\" AND WITH FONT \"Arial\" AND WITH COLOR \"Red\"\n");
        String expected = "<p style=\"color:Red;font-family:Arial;\">Welcome</p>";

        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);

        Grammar.ReInit(input);
        Grammar.Input();



        String[] lines = output.toString().split(System.lineSeparator());
        String actual = lines[0];

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void secondParagraphTest() throws ParseException {
        String userInput = String.format("ADD PARAGRAPH WITH FONT \"Arial\" AND WITH TEXT \"Good bye\"\n");
        String expected = "<p style=\"font-family:Arial;\">Good bye</p>";

        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);

        Grammar.ReInit(input);
        Grammar.Input();



        String[] lines = output.toString().split(System.lineSeparator());
        String actual = lines[0];

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void urlTest() throws ParseException {
        String userInput = String.format("ADD LINK WITH TEXT \"Search\" AND WITH LINK \"http://google.com\"\n");
        String expected = "<a href=\"http://google.com\">Search</a>";

        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);

        Grammar.ReInit(input);
        Grammar.Input();



        String[] lines = output.toString().split(System.lineSeparator());
        String actual = lines[0];

        Assertions.assertEquals(expected, actual);

    }


}
