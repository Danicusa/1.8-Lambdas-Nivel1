package tascas108level1ex1;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
	
    public static List<String> filterStringsWithO(List<String> strings) {
        return strings.stream()
                      .filter(s -> s.toLowerCase().contains("o"))
                      .collect(Collectors.toList());
    }
}

