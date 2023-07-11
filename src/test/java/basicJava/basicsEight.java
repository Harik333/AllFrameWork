package basicJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

import org.testng.annotations.Test;

public class basicsEight {

	@Test
	public void dateTime() {
		LocalTime time = LocalTime.now();
		DateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println(format.format(time));
	}
}
