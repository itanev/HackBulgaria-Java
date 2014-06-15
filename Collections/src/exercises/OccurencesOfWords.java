package exercises;

import java.util.HashMap;

public class OccurencesOfWords {
	
	public HashMap<String, Integer> getMap(String text) {
		HashMap<String, Integer> map = new HashMap<>();
		String words[] = text.split(" ");
		for(String word : words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			}
			else {
				map.put(word, 1);
			}
		}
		
		return map;
	}
	
	public String getCount(HashMap<String, Integer> map) {
		HashMapToHumanReadableString<String, Integer> convertor = new HashMapToHumanReadableString<>();
		return convertor.makeHumanReadable(map);
	}
}
