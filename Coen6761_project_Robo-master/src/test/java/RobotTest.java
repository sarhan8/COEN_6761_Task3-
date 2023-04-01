import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import java.io.PrintStream;

import org.junit.Test;

public class RobotTest {
	
	 private Robot robo = new Robot();
	

    @Test
    public void initializationtest1() {
    	
    	    ByteArrayOutputStream output = new ByteArrayOutputStream();
    	    System.setOut(new PrintStream(output));
    	    
    	    robo.Input_command("I 10");
    	    
    	    assertEquals("Room is set to 10 x 10 array.", output.toString().trim());
    	}
    
    @Test
    public void initializationtest2() {
    	
    	    ByteArrayOutputStream output = new ByteArrayOutputStream();
    	    System.setOut(new PrintStream(output));
    	    
    	    robo.Input_command("I -1");
    	    
    	    assertEquals("Error, I can only accept Integer values", output.toString().trim());
    	}
    
    @Test
    public void initializationtest3() {
    	
    	    ByteArrayOutputStream output = new ByteArrayOutputStream();
    	    System.setOut(new PrintStream(output));
    	    
    	    robo.Input_command("I 0");
    	    
    	    assertEquals("Error, Initialize with value more than 1", output.toString().trim());
    	}
    @Test
    public void initializationtest4() {
    	
    	    ByteArrayOutputStream output = new ByteArrayOutputStream();
    	    System.setOut(new PrintStream(output));
    	    
    	    robo.Input_command("I 1");
    	    
    	    assertEquals("Error, Initialize with value more than 1", output.toString().trim());
    	}
    @Test
    public void initializationtest5() {
    	
    	    ByteArrayOutputStream output = new ByteArrayOutputStream();
    	    System.setOut(new PrintStream(output));
    	    
    	    robo.Input_command("I 10");
            robo.Input_command("c");
            
            String[] consoleOutput = output.toString().trim().split("\n");
            String lastOutput = consoleOutput[consoleOutput.length - 1];
    	    
    	    assertEquals("Position: 0, 0 - Pen: up - Facing: north", lastOutput);
    	}
    @Test
    public void initializationtest6() {
    	
    	    ByteArrayOutputStream output = new ByteArrayOutputStream();
    	    System.setOut(new PrintStream(output));
    	    
    	    robo.Input_command("I 10");
            robo.Input_command("c 4");
            
            String[] consoleOutput = output.toString().trim().split("\n");
            String lastOutput = consoleOutput[consoleOutput.length - 1];
    	    
    	    assertEquals("Error, C cant accept any additional values", lastOutput);
    	}
    @Test
    public void initializationtest7() {
    	
    	    ByteArrayOutputStream output = new ByteArrayOutputStream();
    	    System.setOut(new PrintStream(output));
    	    
    	    robo.Input_command("I10");
    	    
    	    assertEquals("Room is set to 10 x 10 array.", output.toString().trim());
    	}
    
    @Test
    public void penuptest1() {
    	
    	    ByteArrayOutputStream output = new ByteArrayOutputStream();
    	    System.setOut(new PrintStream(output));
    	    
    	    robo.Input_command("I 10");
            robo.Input_command("u");
            
            String[] consoleOutput = output.toString().trim().split("\n");
            String lastOutput = consoleOutput[consoleOutput.length - 1];
    	    
    	    assertEquals("Pen is up.", lastOutput);
    	}
    @Test
    public void penuptest2() {
    	
    	    ByteArrayOutputStream output = new ByteArrayOutputStream();
    	    System.setOut(new PrintStream(output));
    	    
    	    robo.Input_command("I 10");
            robo.Input_command("u 4");
            
            String[] consoleOutput = output.toString().trim().split("\n");
            String lastOutput = consoleOutput[consoleOutput.length - 1];
    	    
    	    assertEquals("Error, U cant accept any additional values", lastOutput);
    	}
    @Test
    public void pendowntest1() {
    	
    	    ByteArrayOutputStream output = new ByteArrayOutputStream();
    	    System.setOut(new PrintStream(output));
    	    
    	    robo.Input_command("I 10");
            robo.Input_command("d");
            
            String[] consoleOutput = output.toString().trim().split("\n");
            String lastOutput = consoleOutput[consoleOutput.length - 1];
    	    
    	    assertEquals("Pen is down.", lastOutput);
    	}
    @Test
    public void pendowntest2() {
    	
    	    ByteArrayOutputStream output = new ByteArrayOutputStream();
    	    System.setOut(new PrintStream(output));
    	    
    	    robo.Input_command("I 10");
            robo.Input_command("d 4");
            
            String[] consoleOutput = output.toString().trim().split("\n");
            String lastOutput = consoleOutput[consoleOutput.length - 1];
    	    
    	    assertEquals("Error, D cant accept any additional values", lastOutput);
    	}
    @Test
    public void turnrighttest1() {
    	
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
	    robo.Input_command("I 10");
        robo.Input_command("r");
        robo.Input_command("r");
        robo.Input_command("r");
        robo.Input_command("r");
        
        String[] consoleOutput = output.toString().trim().split("\n");
        String lastOutput = consoleOutput[consoleOutput.length - 1];
	    
	    assertEquals("Rotated right.Robo is currently Facing: north", lastOutput);
	}
    @Test
    public void turnrighttest2() {
    	
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
	    robo.Input_command("I 10");
        robo.Input_command("r 4");
        
        
        String[] consoleOutput = output.toString().trim().split("\n");
        String lastOutput = consoleOutput[consoleOutput.length - 1];
	    
	    assertEquals("Error, R cant accept any additional values", lastOutput);
	}
    @Test
    public void turnlefttest1() {
    	
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
	    robo.Input_command("I 10");
        robo.Input_command("l");
        robo.Input_command("l");
        robo.Input_command("l");
        robo.Input_command("l");
        
        String[] consoleOutput = output.toString().trim().split("\n");
        String lastOutput = consoleOutput[consoleOutput.length - 1];
	    
	    assertEquals("Rotated Left.Robo is currently Facing: north", lastOutput);
	}
    @Test
    public void turnlefttest2() {
    	
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
	    robo.Input_command("I 10");
        robo.Input_command("l 3");
        
        
        String[] consoleOutput = output.toString().trim().split("\n");
        String lastOutput = consoleOutput[consoleOutput.length - 1];
	    
	    assertEquals("Error, L cant accept any additional values", lastOutput);
	}
    @Test
    public void movementtest1() {
    	
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
	    robo.Input_command("I 10");
        robo.Input_command("m 4");
        
        
        String[] consoleOutput = output.toString().trim().split("\n");
        String lastOutput = consoleOutput[consoleOutput.length - 1];
	    
	    assertEquals("Robot is moving freely as pen is up, the new coordinates are: 0, 4 (not updated to print in Room map)", lastOutput);
	}
    @Test
    public void movementtest2() {
    	
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
	    robo.Input_command("I 10");
        robo.Input_command("m 12");
        
        
        String[] consoleOutput = output.toString().trim().split("\n");
        String lastOutput = consoleOutput[consoleOutput.length - 1];
	    
	    assertEquals("Movement out of Room not allowed", lastOutput);
	}
    @Test
    public void movementtest3() {
    	
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
	    robo.Input_command("I 10");
        robo.Input_command("m -3");
        
        
        String[] consoleOutput = output.toString().trim().split("\n");
        String lastOutput = consoleOutput[consoleOutput.length - 1];
	    
	    assertEquals("Error, M can only accept Integer values", lastOutput);
	}
    @Test
    public void movementtest4() {
    	
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
	    robo.Input_command("I 10");
        robo.Input_command("m 0");
        
        
        String[] consoleOutput = output.toString().trim().split("\n");
        String lastOutput = consoleOutput[consoleOutput.length - 1];
	    
	    assertEquals("Error, M can only accept Integer values greater than zero", lastOutput);
	}
    @Test
    public void movementtest5() {
    	
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
	    robo.Input_command("I 10");
        robo.Input_command("m");
        
        
        String[] consoleOutput = output.toString().trim().split("\n");
        String lastOutput = consoleOutput[consoleOutput.length - 1];
	    
	    assertEquals("Error, M need two values to process", lastOutput);
	}
    
    @Test
    public void movementtest6() {
    	
    	ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
	    robo.Input_command("m");
	    
	    assertEquals("initialise Room to move", output.toString().trim());
	}
    @Test
    public void movementtest7() {
    	
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
	    robo.Input_command("I 10");
        robo.Input_command("m4");
        
        
        String[] consoleOutput = output.toString().trim().split("\n");
        String lastOutput = consoleOutput[consoleOutput.length - 1];
	    
	    assertEquals("Robot is moving freely as pen is up, the new coordinates are: 0, 4 (not updated to print in Room map", lastOutput);
	}
    @Test
    public void multiplemovementtest1() {
    	
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
	    robo.Input_command("I 7");
        robo.Input_command("r");
        robo.Input_command("m 7");
        robo.Input_command("m 3");
        robo.Input_command("l");
        robo.Input_command("m 7");
        robo.Input_command("m 2");
        robo.Input_command("l");
        robo.Input_command("m 7");
        robo.Input_command("m 1");
        robo.Input_command("l");
        robo.Input_command("m 7");
        robo.Input_command("m 2");
        robo.Input_command("c");
        
        String[] consoleOutput = output.toString().trim().split("\n");
        String lastOutput = consoleOutput[consoleOutput.length - 1];
	    
	    assertEquals("Position: 2, 0 - Pen: up - Facing: south", lastOutput);
	}
    
    @Test
    public void printfloortest1() {
    	robo.Input_command("I 3");
    	robo.Input_command("D");
    	robo.Input_command("M 2");
    	
    	ByteArrayOutputStream output = new ByteArrayOutputStream();
    	System.setOut(new PrintStream(output));
    	robo.Input_command("P");

    	String expectedOutput = " 02  *  -  - \n" +" 01  *  -  - \n" +" 00  *  -  - \n" +"     00 01 02\n";
    	String actualOutput = output.toString().replace("\r\n", "\n");

    	assertEquals(expectedOutput.trim(), actualOutput.trim());
    }
    @Test
        public void printfloortest2() {
        	
    	    ByteArrayOutputStream output = new ByteArrayOutputStream();
    	    System.setOut(new PrintStream(output));
    	    
    	    robo.Input_command("I 10");
            robo.Input_command("m 4");
            robo.Input_command("p 4");
            
            
            String[] consoleOutput = output.toString().trim().split("\n");
            String lastOutput = consoleOutput[consoleOutput.length - 1];
    	    
    	    assertEquals("Error, P cant accept any additional values", lastOutput);
    	
    	
    }
    //@Test
    //public void quittest1() {
    	
	    //ByteArrayOutputStream output = new ByteArrayOutputStream();
	    //System.setOut(new PrintStream(output));
	    
	    //robo.Input_command("I 10");
        //robo.Input_command("q");
        
        
        //String[] consoleOutput = output.toString().trim().split("\n");
        //String lastOutput = consoleOutput[consoleOutput.length - 1];
	    
	    //assertEquals("Terminating Robot", lastOutput);
	//}
    
    @Test
    public void quittest2() {
    	
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
	    robo.Input_command("I 10");
        robo.Input_command("q 5");
        
        
        String[] consoleOutput = output.toString().trim().split("\n");
        String lastOutput = consoleOutput[consoleOutput.length - 1];
	    
	    assertEquals("Error, Q cant accept any additional values", lastOutput);
	}
    @Test
    public void invalidinputtest() {
    	
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
	    robo.Input_command("I 10");
        robo.Input_command("x");
        
        
        String[] consoleOutput = output.toString().trim().split("\n");
        String lastOutput = consoleOutput[consoleOutput.length - 1];
	    
	    assertEquals("Error,Command not supported", lastOutput);
	}
    @Test
    public void checkmenutest() {
    	
    	ByteArrayOutputStream output = new ByteArrayOutputStream();
    	System.setOut(new PrintStream(output));
    	robo.Input_command("menu");
    	    
    	String expectedOutput = "Enter 'Q' to close program\n"
                    +"All Possible commands:\n" +
                   "I n: Initialize the system\n" +
                   "U: Pen Up\n" +
                   "D: Pen Down\n" +
                   "R: Turn Right\n" +
                   "L: Turn Left\n" +
                   "M s: Move forward s spaces\n" +
                   "P: Print the table\n" +
                   "C: Print current position of the pen\n" +
                   "Q: Stop the program";
    	String actualOutput = output.toString().replace("\r\n", "\n");

    	assertEquals(expectedOutput.trim(), actualOutput.trim());
    	    
    	   

    	}
    
    }
