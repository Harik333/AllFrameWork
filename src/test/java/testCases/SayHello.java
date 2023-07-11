package testCases;

import org.testng.annotations.Test;



public class SayHello {

	 @Test
	 public void hello() {
		 System.out.println("Say Hello");
	 }
	 
	 @Test
	 public void Bye() {
		 System.out.println("Byeee");
	 }
	 
	 @Test
	 public void userDirectory() {
		 String userDir = System.getProperty("user.dir");
		 System.out.println(userDir);
		 
	 }
}
