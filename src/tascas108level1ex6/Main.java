package tascas108level1ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Object> mixedList =  new ArrayList<>();
		
		mixedList.add("Padre");
		mixedList.add("Arándano");
		mixedList.add(2);
		mixedList.add("Helicóptero");
		mixedList.add(56);
		mixedList.add(33);
		mixedList.add("Zoo");
		
		System.out.println(listFilter(mixedList));
	}
	
	public static List<Object> listFilter(List<Object> mixedList){
		return mixedList.stream()
		.filter(o -> o instanceof String)
		.map(o -> (String) o)
		.sorted((a,b) -> Integer.compare(a.length(),b.length()))
		.collect(Collectors.toList());
	}
}
