import com.company.Grammar;
import com.company.ParseException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.*;
public class ValidatorTester {
    @BeforeAll
    public static void setup(){
        String setup = String.format("setup");
        ByteArrayInputStream input = new ByteArrayInputStream(setup.getBytes());
        Grammar MockUpGrammar = new Grammar(input);
    }

    @Test
    public void test1() throws ParseException {
        String userInput = String.format("Hi \n");
        String expected = "Lexical error at line 1, column 1.  Encountered: \"H\" (72), after : \"\"";
        String actual = "Passed";
        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());

        Grammar.ReInit(input);
        try {
            Grammar.Input();
        }catch (Error e){
            actual = e.getMessage();
        }
        System.setOut(new PrintStream(new ByteArrayOutputStream(10)));
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test2() throws ParseException {
        String userInput = String.format("ADD IMAGE WITH SOURCE \"https://www.w3schools.com/html/pic_trulli.jpg\"\n");
        String expected = "Passed";
        String actual = "Passed";
        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());

        Grammar.ReInit(input);
        try {

            Grammar.Input();
        }catch (Error e){
            actual = e.getMessage();
        }
        System.setOut(new PrintStream(new ByteArrayOutputStream(10)));
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test3() throws ParseException {
        String userInput = String.format("ADD Ahmed \n");
        String expected = "Lexical error at line 1, column 5.  Encountered: \"A\" (65), after : \"ADD \"";
        String actual = "Passed";
        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());

        Grammar.ReInit(input);
        try {

            Grammar.Input();
        }catch (Error e){
            actual = e.getMessage();
        }
        System.setOut(new PrintStream(new ByteArrayOutputStream(10)));
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test4() throws ParseException {
        String userInput = String.format("ADD HEADING WITH TEXT HELLO \n");
        String expected = "Lexical error at line 1, column 23.  Encountered: \"H\" (72), after : \"ADD HEADING WITH TEXT \"";
        String actual = "Passed";
        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());

        Grammar.ReInit(input);
        try {

            Grammar.Input();
        }catch (Error e){
            actual = e.getMessage();
        }
        System.setOut(new PrintStream(new ByteArrayOutputStream(10)));
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test5() throws ParseException {
        String userInput = String.format("ADD HEADING WITH TEXT \"HELLO\"\n");
        String expected = "Passed";
        String actual = "Passed";
        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());

        Grammar.ReInit(input);
        try {

            Grammar.Input();
        }catch (Error e){
            actual = e.getMessage();
        }
        System.setOut(new PrintStream(new ByteArrayOutputStream(10)));
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test6() throws ParseException {
        String userInput = String.format("ADD HEADING WITH text \"HELLO\"\n");
        String expected = "Lexical error at line 1, column 18.  Encountered: \"t\" (116), after : \"ADD HEADING WITH \"";
        String actual = "Passed";
        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());

        Grammar.ReInit(input);
        try {

            Grammar.Input();
        }catch (Error e){
            actual = e.getMessage();
        }
        System.setOut(new PrintStream(new ByteArrayOutputStream(10)));
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test7() throws ParseException {
        String userInput = String.format("ADD HEADING WITH text \"HELLO\"\n");
        String expected = "Lexical error at line 1, column 18.  Encountered: \"t\" (116), after : \"ADD HEADING WITH \"";
        String actual = "Passed";
        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());

        Grammar.ReInit(input);
        try {

            Grammar.Input();
        }catch (Error e){
            actual = e.getMessage();
        }
        System.setOut(new PrintStream(new ByteArrayOutputStream(10)));
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test8() throws ParseException {
        String userInput = String.format("ADD PARAGRAPH WITH TEXT \"Email\" WITH COLOR \"Red\"\n");
        String expected = "Lexical error at line 1, column 33.  Encountered: \"W\" (87), after : \"\"";
        String actual = "Passed";
        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());

        Grammar.ReInit(input);
        try {

            Grammar.Input();
        }catch (Error e){
            actual = e.getMessage();
        }
        System.setOut(new PrintStream(new ByteArrayOutputStream(10)));
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test9() throws ParseException {
        String userInput = String.format("ADD PARAGRAPH WITH TEXT \"Email\" AND WITH COLOR \"Red\"\n");
        String expected = "Passed";
        String actual = "Passed";
        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());

        Grammar.ReInit(input);
        try {

            Grammar.Input();
        }catch (Error e){
            actual = e.getMessage();
        }
        System.setOut(new PrintStream(new ByteArrayOutputStream(10)));
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test10() throws ParseException {
        String userInput = String.format("x = 5");
        String expected = "Lexical error at line 1, column 1.  Encountered: \"x\" (120), after : \"\"";
        String actual = "Passed";
        ByteArrayInputStream input = new ByteArrayInputStream(userInput.getBytes());

        Grammar.ReInit(input);
        try {

            Grammar.Input();
        }catch (Error e){
            actual = e.getMessage();
        }
        System.setOut(new PrintStream(new ByteArrayOutputStream(10)));
        Assertions.assertEquals(expected, actual);

    }
}
