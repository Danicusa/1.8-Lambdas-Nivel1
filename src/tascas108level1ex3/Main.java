package tascas108level1ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("January","February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December");
		
		list1.forEach(s -> System.out.println(s));
	}

}