package level1ex2;

import java.util.ArrayList;
import java.util.List;

import level1ex1.StringFilter;

public class Main {

	public static void main(String[] args) {
		List<String> list1 = List.of("Polaroid","Hada","Cosa","Vela","Osos","Piedra","Pato","Ostras");

		System.out.println(StringFilter2.filterStringsWithO5(list1));
	}
}
