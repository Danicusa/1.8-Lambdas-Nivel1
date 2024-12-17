package tascas108level1ex2;

import java.util.ArrayList;
import java.util.List;

import tascas108level1ex1.StringFilter;

public class Main {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		
		list1.add("Polaroid");
		list1.add("Hada");
		list1.add("Cosa");
		list1.add("Vela");
		list1.add("Osos");
		list1.add("Piedra");
		list1.add("Pato");
		list1.add("Ostras");
		
		System.out.println(StringFilter2.filterStringsWithO5(list1));
	}
}
