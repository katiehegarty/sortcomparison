import java.util.Arrays;
import java.util.Objects; 

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
	static double [] quickSort (double [] a){
		return sortQuick(a, 0, a.length-1);
		
	}                                                                                      
	static double[] sortQuick(double[] a, int lo, int hi) {
		
		if(lo<hi) {
			int pivot = partition(a, lo, hi);
			sortQuick(a, lo, pivot-1);
			sortQuick(a, pivot+1, hi);
		}
		return a;
	}
	
	static int partition(double[] numbers, int lo, int hi) {
		int i=lo;
		int j = hi+1;
		double pivot = numbers[lo];
		while(true) {
			while((numbers[++i]<pivot)) {
				if(i==hi) {
					break;
				}
			}
			while((pivot< (numbers[--j]))) {
				if(j==lo) {
					break;
				}
			}
			if(i>=j) {
				break;
			}
			double temp=numbers[i];
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
		int n=a.length;
		double [] left;
		double [] right;
		
		if (n % 2 == 0) {
	        left = new double[n/2];
	        right = new double[n/2];
	    } 
	    else {
	        left = new double[n/2];
	        right = new double[n/2+1];
	    }
		
		for (int i = 0; i < n; i++) {
	        if (i < n/2) {
	            left[i] = a[i];
	        }
	        else {
	            right[i-n/2] = a[i];
	        }
	    }
		sort(left);
		sort(right);
		double[] result = Arrays.;
		return //?? 
		
	}
	
	public static void sort(double[] a) {
		double[] aux = new double[a.length];
		sort(a, aux, 0, a.length-1);
	}
	
	private static void sort(double[] a, double[] aux, int lo, int hi) {
		if(hi<=lo) {
			return;
		}
		int midpoint = lo +(hi-lo)/2;
		sort(a, aux, lo, midpoint);
		sort(a, aux, midpoint+1, hi);
		merge(a, aux, lo, midpoint, hi);
	}
	
	private static void merge(double[] a, double[] aux, int lo, int mid, int hi) {
		for(int k=lo; k <=hi; k++) {
			aux[k] = a[k];
		}
		int i=lo;
		int j=mid+1;
		for(int k =lo; k<=hi; k++) {
			if(i>mid) {
				a[k]=aux[j++];
			}
			else if(j>hi) {
				a[k] = aux[i++];
			}
			else if(aux[j]<aux[i]) {
				a[k] = aux[j++];
			}
			else {
				a[k] = aux[i++];
			}
		}
		
	}
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

		double [] a = {4, 6, 97, 1, 23, 53, 75, 45};
		System.out.println(Arrays.toString(mergeSortIterative(a)));
		
		
	}

}//end class
