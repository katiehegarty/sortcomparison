import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class SortComparisonTest {

	@Test
	public void testInsertionSort() {
		double []a = {2, 78, 9, 13, 50};
		double [] sortedArray = {2, 9, 13, 50, 78};
		assertArrayEquals(sortedArray, SortComparison.insertionSort(a));
		}
	
	@Test
	public void testSelectionSort() {
		double []a = {2, 78, 9, 13, 50};
		double [] sortedArray = {2, 9, 13, 50, 78};
		assertArrayEquals(sortedArray, SortComparison.selectionSort(a));
	}
	@Test
	public void testQuickSort() {
		double []a = {2, 78, 9, 13, 50};
		double [] sortedArray = {2, 9, 13, 50, 78};
		assertArrayEquals(sortedArray, SortComparison.quickSort(a));
	}
	
	@Test 
	public void testMergeSortRecursive() {
		double []a = {2, 78, 9, 13, 50};
		double [] sortedArray = {2, 9, 13, 50, 78};
		assertArrayEquals(sortedArray, SortComparison.mergeSortRecursive(a));
		
	}
	
	//need to sort iterative !!
}
