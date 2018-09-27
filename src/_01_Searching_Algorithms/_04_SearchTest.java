package _01_Searching_Algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	void testLinearSearch() {
		String[] test = {"Count Bleck", "Count Olaf", "Count Dracula"};
		_00_LinearSearch.linearSearch(test, "1");
		assertEquals(-1, _00_LinearSearch.linearSearch(test, "1"));
		assertEquals(0, _00_LinearSearch.linearSearch(test, "Count Bleck"));
		assertEquals(2, _00_LinearSearch.linearSearch(test, "Count Dracula"));
		//1. use the assertEquals method to test your linear search method.
	}

	@Test
	void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
	int[] array = {2, 3, 4, 5};
	assertEquals(1, _01_BinarySearch.binarySearch(array,0,array.length-1,3));
	}
	
	@Test
	void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] test = {4,13,22,31};
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(test,13));
		
	}
	
	@Test
	void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] test = {3, 6, 9, 113, 344};
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(test, 113));
	}
}
