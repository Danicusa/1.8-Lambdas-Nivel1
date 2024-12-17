package tascas108level1ex8;

public class Main {

	public static void main(String[] args) {
		String example2 = "Hola";
		String example2Reversed = "";
		
		ReverseString reverse = (String example1) -> new StringBuilder(example1).reverse().toString();
		
		example2Reversed = reverse.reverse(example2);
		
		System.out.println(example2Reversed);
	}

}
