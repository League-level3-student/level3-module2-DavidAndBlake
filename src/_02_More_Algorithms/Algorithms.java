package _02_More_Algorithms;

import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return (i);
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int numberOfPearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				numberOfPearls += 1;
			}
		}
		return numberOfPearls;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {

			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}
	// need to fix next time

	public static Object findLongestWord(List<String> words) {
		String longestWord = new String();
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}

	public static Object containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).contains("... --- ...")) {
				return true;
			}

		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		double lowest = results.get(0);

		for (int j = 0; j < results.size(); j++) {

			for (int i = j+1; i < results.size(); i++) {
				if (results.get(j) > results.get(i)) {
					lowest = results.get(i);
					results.set(i, results.get(j));
					results.set(j, lowest);
				}
			}
			
		}
		return results;
	}
	/*
	 * Need to run through the list each time and compare 
	*/

	public static Object sortDNA(List<String> unsortedSequences) {
		String lowest = unsortedSequences.get(0);
		for (int j = 0; j < unsortedSequences.size(); j++) {
			for (int i = j+1; i < unsortedSequences.size(); i++) {
				if (unsortedSequences.get(j).length() > unsortedSequences.get(i).length()) {
					lowest = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(j));
					unsortedSequences.set(j, lowest);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		String last;
		for (int j = 0; j < words.size(); j++) {
			for (int i = j+1; i; i++) {
				if (words.get(j).compareTo) {
					last = words.get(i);
					words.set(i, words.get(j));
					words.set(j, last);
				}
			}
		}
		return null;
	}		

}
