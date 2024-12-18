package level1ex6;

import java.util.List;
import java.util.stream.Collectors;

	public class ListFilter {
		
		public static List<Object> listFilter(List<Object> mixedList){
			return mixedList.stream()
			.filter(o -> o instanceof String)
			.map(o -> (String) o)
			.sorted((a,b) -> Integer.compare(a.length(),b.length()))
			.collect(Collectors.toList());
		}
}
