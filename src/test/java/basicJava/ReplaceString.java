package basicJava;

public class ReplaceString {

	public static void main(String[] args) {
		
		String  s = "Hello55how67899are56you";
		String delimiter = "\\d+";
		String newS = s.replaceAll(delimiter, " ");
		System.out.println(newS);
	}
}
