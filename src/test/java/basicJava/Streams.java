package basicJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Streams {
 
	@Test
	public void printEachElement() {
		List<String> sList = new ArrayList<String>();
		sList.add("Harish");
		sList.add("Roger");
		sList.add("Nadal");
		sList.add("Djokovic");
		//print names
        sList.stream().filter(i -> i.startsWith("R")).forEach(System.out::println);
        
        //
        List<String> upperCaseNames = sList.stream().map(i -> i.toUpperCase()).collect(Collectors.toList()); 
        System.out.println(upperCaseNames);
	}
}
