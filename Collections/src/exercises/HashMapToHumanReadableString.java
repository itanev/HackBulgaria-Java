package exercises;

import java.util.HashMap;

public class HashMapToHumanReadableString<K, V> {
	
	public String makeHumanReadable(HashMap<K, V> map) {
		StringBuilder result = new StringBuilder();
		
		result.append("{ ");
		
		String prefix = "";
		
		for(K key : map.keySet()) {
			result.append(prefix);
			prefix = ", ";
			result.append(String.format("%s:%s", key.toString(), map.get(key).toString()));
		}
		
		result.append(" }");
		
		return result.toString();
	}
}
