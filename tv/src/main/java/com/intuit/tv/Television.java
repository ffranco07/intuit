package com.intuit.tv;

import java.util.Map;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Goal: Implement the constructor and methods below.
 *
 * Guidelines:
 * 1. Use any programming language you like. If you switch away from Java, 
 *    please rewrite the code below in your desired language. Please use 
 *    actual code (no pseudocode).
 * 2. Feel free to add any additional private member methods/variables/classes.
 * 3. Please capture any assumptions that you make about the program.
 * 4. We want to see your best work - style, problem solving, etc. Your solution 
 *    should handle every edge case you can think of.
 *
 * Question:
 * Is your solution optimal? If so, why?
 *
 * No, a quick sort might be a more efficient algorithm (O(nlog(n)) average runtime) 
 * to use but it is a more complicated algorithm to implement. In theory, quick sort 
 * worst case time complexity is O(n^2) while merge sort worst case time complexity 
 * is more efficient at O(nlog(n)). In terms of simplicity and maintainability, 
 * merge sort is the better option to use especially sorting a smaller data set like 
 * television channel numbers (about 200+).
 * 
 * 
 */

/**
 * 
 * @author Francisco Franco
 *
 * Class to Model a Television
 */

public class Television {
	private Map<String, String> channelNumberToNameMap;
	private String[] channelKeys;
	private int randomKeyIndex;	
	
	/**
	 * Constructor
	 *
	 * @param channelNumberToNameMap A map of every channel number 
	 * and its corresponding channel name
	 *
	 * NOTE: It is safe to assume that the channelNumberToNameMap's keys 
	 * will all be numeric and positive and the values will be 
	 * non-null/whitespace. In addition, channelNumberToNameMap will not be empty.
	 *       
	 * Do not make any other assumptions about channelNumberToNameMap or the 
	 * data it contains.
	 */
	
	public Television(Map<String, String> channelNumberToNameMap) {
		this.channelNumberToNameMap = channelNumberToNameMap;
		this.channelKeys = channelNumberToNameMap.keySet().toArray(new String[channelNumberToNameMap.keySet().size()]);
		sortArray();
		this.randomKeyIndex = getRandomKeyIndex();
		channelDown();
		goToChannel(channelKeys[randomKeyIndex]);
		channelUp();
	}

	// ================================
	// Private methods
	// ================================

	/**
	 * Sort the channel number keys array
	 *
	 * Arrays.sort() method internally uses:
	 * Strategy pattern (different algorithm for different situations)
	 * Merge sort (divide and conquer technique) with O(nlog(n)) 
	 * worst-case time complexity
	 * 
	 * NOTE:
	 * O(1), O(log(n)), O(nlog(n)), O(n^2), O(k^n), O(n!)
	 * Best                                         Worst
	 * ------------------------------------------------->
	 * Algorithm Efficiency
	 * 
	 */
	private void sortArray() {
		Arrays.sort(channelKeys, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
			}
    });
		StringBuffer channels = new StringBuffer();
		for (int i = 0; i < channelKeys.length; i++) {
			channels.append(channelKeys[i]);
			if (i != channelKeys.length - 1) 
				channels.append(",");
		}
		System.out.println("channels are: " + channels.toString());
	}
	
	/**
	 * Get a random key index into channel number keys array
	 *
	 * @return random key index
	 */
	private int getRandomKeyIndex() {
		Random random = new Random(System.currentTimeMillis());
		int randomKeyIndex = random.nextInt(channelKeys.length);
		System.out.println("randomKeyIndex is: " + randomKeyIndex);
		return randomKeyIndex;
	}
	
	// ================================
	// Public methods
	// ================================

	/**
	 * Changes the Television to the desired channel.
	 *
	 * @param channelNumber The desired channel number
	 * @return The name of the desired channel
	 */
	public String goToChannel(String channelNumber) {
		System.out.println("randomChannelNumber is: " + channelNumber);
		String randomChannelName = channelNumberToNameMap.get(channelNumber);
		System.out.println("randomChannelName is: " + randomChannelName);	
		return randomChannelName;
	}

	/**
	 * Changes the Television channel once in an ascending direction.
	 *
	 * @return The name of the next channel
	 */
	public String channelUp() {
		String upChannelNumber;
		if (randomKeyIndex == (channelKeys.length - 1)) {
			upChannelNumber = channelKeys[0];
		}
		else {
			upChannelNumber = channelKeys[randomKeyIndex + 1];
		}
		System.out.println("upChannelNumber is: " + upChannelNumber);
		String upChannelName = channelNumberToNameMap.get(upChannelNumber);
		System.out.println("upChannelName is: " + upChannelName);
		return upChannelName;
	}
	
	/**
	 * Changes the Television channel once in a descending direction.
	 *
	 * @return The name of the previous channel
	 */
	public String channelDown() {
		String downChannelNumber;
		if (randomKeyIndex == 0) {
			downChannelNumber = channelKeys[channelKeys.length - 1];
		}
		else {
			downChannelNumber = channelKeys[randomKeyIndex - 1];
		}
		System.out.println("downChannelNumber is: " + downChannelNumber);
		String downChannelName = channelNumberToNameMap.get(downChannelNumber);
		System.out.println("downChannelName is: " + downChannelName);
		return downChannelName;
	}
	
	/**
	 * Main method to execute Television module
	 *
	 */
	public static void main(String[]args) {
		System.out.println( "Executing Television module ...");
		new Television(DomainConstants.channelMap);
	}
}
