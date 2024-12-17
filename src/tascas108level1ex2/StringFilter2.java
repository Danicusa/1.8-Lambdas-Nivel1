package tascas108level1ex2;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter2 {
	public static List<String> filterStringsWithO5(List<String> strings) {
        return strings.stream()
                      .filter(s -> s.toLowerCase().contains("o") && s.length() > 5)
                      .collect(Collectors.toList());
    }

}
