package exercises;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class FirstUniqueElement {
	
	public Integer getUniqueElement(Collection<Integer> collection) {
		HashMap<Integer, Integer> elementOccuranses = new HashMap<>();
		
		for(Integer val : collection) {
			if(elementOccuranses.containsKey(val)) {
				elementOccuranses.put(val, elementOccuranses.get(val) + 1);
			}
			else {
				elementOccuranses.put(val, 1);
			}
		}
		
		Integer unique = -1;
		
		for(Integer key : elementOccuranses.keySet()) {
			if(elementOccuranses.get(key).equals(1)) {
				unique = key;
				break;
			}
		}
		
		return unique;
	}
}
