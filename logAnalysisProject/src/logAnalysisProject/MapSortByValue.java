package logAnalysisProject;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortByValue {

	public Map<String, Integer> ascendingSort(Map<String, Integer> map) {
		
		Comparator<Map.Entry<String, Integer>> ascending = new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		};
		return sort(map, ascending);
	}
	
	public Map<String, Integer> descendingSort(Map<String, Integer> map) {
		
		Comparator<Map.Entry<String, Integer>> decending = new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		};
		return sort(map, decending);
	}

	private Map<String, Integer> sort ( Map<String, Integer> map, Comparator<Map.Entry<String, Integer>> comparator) {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet()); 
		
		Collections.sort(list, comparator);
		
		Map<String, Integer > sortedMap = new LinkedHashMap<String, Integer>();
		for(Iterator<Map.Entry<String, Integer>> iterator = list.iterator(); iterator.hasNext(); ){
			Map.Entry<String, Integer> entry = iterator.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	
	

}
