package level1ex7;

import java.util.List;
import java.util.stream.Collectors;

public class ListFilterOLength {
	public static List<Object> listFilterOLength(List<Object> mixedList){
		return mixedList.stream()
		.filter(o -> o instanceof String)
		.map(o -> (String) o)
		.sorted((b,a) -> Integer.compare(a.length(),b.length()))
		.collect(Collectors.toList());
	}
}
