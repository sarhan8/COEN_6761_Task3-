import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import java.io.PrintStream;

import org.junit.Test;

public class RobotDataFlowTest {
	
	 private Robot robo = new Robot();
	
	 @Test
	    public void robodataflowtest1() {
	    	robo.Input_command("I 3");
	    	ByteArrayOutputStream output = new ByteArrayOutputStream();
	    	System.setOut(new PrintStream(output));
	    	robo.Input_command("P");

	    	String expectedOutput = " 02  -  -  - \n" +" 01  -  -  - \n" +" 00  -  -  - \n" +"     00 01 02\n";
	    	String actualOutput = output.toString().replace("\r\n", "\n");

	    	assertEquals(expectedOutput.trim(), actualOutput.trim());
	 }
	 @Test
	    public void robodataflowtest2() {
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
}
