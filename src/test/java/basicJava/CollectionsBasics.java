package basicJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class CollectionsBasics {

	@Test
	public void listToArray() {
		List<String> names = new ArrayList<>();
		names.add("Harish");
		names.add("Roger");		
	
		System.out.println(Arrays.toString(names.toArray()));
		
	}
	
}
