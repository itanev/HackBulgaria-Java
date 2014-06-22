package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExtensions {
	
	public static Collection<Integer> sort(Collection<Integer> collection) {
		ArrayList<Integer> newCollection = new ArrayList<Integer>();
		
		for(Integer num : collection) {
			newCollection.add(num);
		}
		
		bubbleSort(newCollection);
		return newCollection;
	}
	
	public static Collection<Integer> reverse(Collection<Integer> collection) {
		Integer newCollection[] = new Integer[collection.size()];
		
		Iterator<Integer> iterator = collection.iterator();
		
		for(int i = 0; i < collection.size(); i++) {
			newCollection[collection.size() - i - 1] = iterator.next();
		}
		
		return Arrays.asList(newCollection);
	}
	
	public static boolean isMonotonic(Collection<Integer> collection) {
		boolean result = true;
		
		if(collection.isEmpty()) return result;
		
		Integer[] tempCollection = (Integer[]) collection.toArray();
		
		for(int i = 0; i < tempCollection.length - 1; i++) {
			if(Math.abs(tempCollection[i] - tempCollection[i + 1]) > 1) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	private static void bubbleSort(ArrayList<Integer> numbers) {
		
		for (int i = 0; i < numbers.size(); i++) {
			
			for(int j = 0; j < numbers.size(); j++) {
				
				if(numbers.get(i) > numbers.get(j)) {
					
                    Integer tempVar = numbers.get(j);
                    numbers.add(j, numbers.get(i));
                    numbers.add(i, tempVar);
	            }
			}
		}
	}
}
