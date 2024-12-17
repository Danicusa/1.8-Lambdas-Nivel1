package tascas108level1ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		
		list1.add("Polar");
		list1.add("Hada");
		list1.add("Cosa");
		list1.add("Vela");
		list1.add("Osos");
		list1.add("Piedra");
		list1.add("Pato");
		list1.add("Ostra");
		
		System.out.println(StringFilter.filterStringsWithO(list1));
	}

}
