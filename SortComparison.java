import java.util.Arrays;

/ -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author Katie Hegarty
 *  @version HT 2020
 */

class SortComparison {

	/**
	 * Sorts an array of doubles using InsertionSort.
	 * This method is static, thus it can be called as SortComparison.sort(a)
	 * @param a: An unsorted array of doubles.
	 * @return array sorted in ascending order.
	 *
	 */
	static double [] insertionSort (double a[]){

		double temp;
		for(int i=1; i<a.length; i++) {
			for(int j=i; j>0; j--) {
				if(a[j] <a[j-1]) {
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		return a;
	}

	/**
	 * Sorts an array of doubles using Selection Sort.
	 * This method is static, thus it can be called as SortComparison.sort(a)
	 * @param a: An unsorted array of doubles.
	 * @return array sorted in ascending order
	 *
	 */
	static double [] selectionSort (double a[]){

		// get the length
	    int n = a.length;
	    for (int i = 0; i < n; i++) {
	        int index = 0;
	        double smallest = a[i];
	        for (int j = i; j < n; j++) {
	            if (a[j] < smallest) {
	                smallest = a[j];
	                index = j;
	            }
	        double temp = a[i];
	        a[i] = smallest;
	        a[index] = temp;
	    }
	   } 
	    return a;

	}

	/**
	 * Sorts an array of doubles using Quick Sort.
	 * This method is static, thus it can be called as SortComparison.sort(a)
	 * @param a: An unsorted array of doubles.
	 * @return array sorted in ascending order
	 *
	 */
	static double [] quickSort (double a[]){

		//todo: implement the sort

	}//end quicksort

	static double partition(Comparable[] numbers, int lo, int hi) {
		int i=lo;
		int j = hi+1;
		Comparable pivot = numbers[lo];
		while(true) {
			while((numbers[++i].compareTo(pivot)<0)) {
				if(i==hi) {
					break;
				}
			}
			while((pivot.compareTo(numbers[--j]) < 0)) {
				if(j==lo) {
					break;
				}
			}
			if(i>=j) {
				break;
			}
			Comparable temp=numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
		numbers[lo] = numbers[j];
		numbers[j] = pivot;
		return j;
	}
	/**
	 * Sorts an array of doubles using Merge Sort.
	 * This method is static, thus it can be called as SortComparison.sort(a)
	 * @param a: An unsorted array of doubles.
	 * @return array sorted in ascending order
	 *
	 */
	/**
	 * Sorts an array of doubles using iterative implementation of Merge Sort.
	 * This method is static, thus it can be called as SortComparison.sort(a)
	 *
	 * @param a: An unsorted array of doubles.
	 * @return after the method returns, the array must be in ascending sorted order.
	 */

	static double[] mergeSortIterative (double a[]) {

		//todo: implement the sort

	}//end mergesortIterative



	/**
	 * Sorts an array of doubles using recursive implementation of Merge Sort.
	 * This method is static, thus it can be called as SortComparison.sort(a)
	 *
	 * @param a: An unsorted array of doubles.
	 * @return after the method returns, the array must be in ascending sorted order.
	 */
	static double[] mergeSortRecursive (double a[]) {


		//todo: implement the sort

	}//end mergeSortRecursive







	public static void main(String[] args) {

		//todo: do experiments as per assignment instructions
	}

}//end class
