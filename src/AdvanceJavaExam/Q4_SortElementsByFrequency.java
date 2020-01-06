package AdvanceJavaExam;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;


class SortComparator implements Comparator<Integer> { 
	 private final Map<Integer, Integer> freqMap; 

	 // Assign the specified map 
	 SortComparator(Map<Integer, Integer> tFreqMap) 
	 { 
	     this.freqMap = tFreqMap; 
	 } 

	 // Compare the values 

	 public int compare(Integer k1, Integer k2) 
	 { 

	     // Compare value by frequency 
	     int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1)); 

	     // Compare value if frequency is equal 
	     int valueCompare = k1.compareTo(k2); 

	     // If frequency is equal, then just compare by value, otherwise - 
	     // compare by the frequency. 
	     if (freqCompare == 0) 
	         return valueCompare; 
	     else
	         return freqCompare; 
			
		}
	}


public class Q4_SortElementsByFrequency {

	public static void main(String[] args) {
		
		// Declare and Initialize an array 
		int a[] = {2,5,3,7,8,2,5,2,3};
		
        Map<Integer, Integer> map = new HashMap<>(); 
        ArrayList<Integer> outputArray = new ArrayList<Integer>(); 
  
        // Assign elements and their count in the list and map 
        for (int current : a) { 
            int count = map.getOrDefault(current, 0); 
            map.put(current, count + 1); 
            outputArray.add(current); 
        } 
  
             
        // Compare the map by value 
        SortComparator comp = new SortComparator(map); 
  
        // Sort the map using Collections CLass 
        Collections.sort(outputArray, comp); 
  
        // Final Output 
        for (Integer i : outputArray) { 
            System.out.print(i + " "); 
        } 
    } 
} 
  



