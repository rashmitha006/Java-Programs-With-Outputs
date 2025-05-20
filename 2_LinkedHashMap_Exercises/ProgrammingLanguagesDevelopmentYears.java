//11. Include the following elements into the LinkedHashMap called programminglanguages and print asfollows.
//Java was developed in 1995
//Python was developed in 1991.
//JavaScript was developed in 1995
//C++ was developed in 1985

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ProgrammingLanguagesDevelopmentYears {

	public static void main(String[] args) {
		Map<String, Integer> programminglanguages = new LinkedHashMap<>();
		programminglanguages.put("Java", 1995);
		programminglanguages.put("Python", 1991);
		programminglanguages.put("JavaScript", 1995);
		programminglanguages.put("C++", 1985);

		for (Entry<String, Integer> entry : programminglanguages.entrySet()) {
			System.out.println(entry.getKey() + " was developed in " + entry.getValue());
		}
	}
}
