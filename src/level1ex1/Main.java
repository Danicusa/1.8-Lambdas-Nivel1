package level1ex1;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list1 = List.of("Polar","Hada","Cosa","Vela","Osos","Piedra","Pato","Ostra");

		System.out.println(StringFilter.filterStringsWithO(list1));
	}

}
