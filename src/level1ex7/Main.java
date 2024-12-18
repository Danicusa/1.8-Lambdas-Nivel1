package level1ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Object> mixedList = List.of("Padre","Arándano",2,"Helicóptero",56,33,"Zoo");

		System.out.println(ListFilterOLength.listFilterOLength(mixedList));
	}
	
	

}
