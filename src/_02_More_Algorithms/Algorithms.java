package _02_More_Algorithms;

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
	//need to fix next time 

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
			if(message1.get(i).contains("... --- ...")) {
				return true;
		}
			
		}
		return false;
	}

	public static List<String> sortScores(List<Double> results) {
		double lowest = 0;
		for (int i = 0; i < results.size(); i++) {
			if (results.get(i) < lowest) {
				lowest = results.get(i);
			}
		}
		return null;
	}

}
