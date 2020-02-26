import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author
 *  @version HT 2020
 */
@RunWith(JUnit4.class)
public class SortComparisonTest1
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty()
    {	
    	double [] a =null;
    	assertEquals(null, SortComparison.insertionSort(a));
    	assertEquals(null, SortComparison.selectionSort(a));
    	assertEquals(null, SortComparison.quickSort(a));
    	assertEquals(null, SortComparison.mergeSortIterative(a));
    	assertEquals(null, SortComparison.mergeSortRecursive(a));
    }
    
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
	
	@Test
	public void testMergeSortIterative() {
		double []a = {2, 78, 9, 13, 50};
		double [] sortedArray = {2, 9, 13, 50, 78};
		assertArrayEquals(sortedArray, SortComparison.mergeSortIterative(a));
	}

    // TODO: add more tests here. Each line of code and ech decision in Collinear.java should
    // be executed at least once from at least one test.

    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
	public static void main(String[] args) {
		String path = "C:\\Users\\katie\\workspace2\\ADS\\src\\";
		String[] files = new String[]{path + "numbers10.txt",
				path + "numbers100.txt",
				path + "numbers1000.txt",
				path + "numbers1000Duplicates.txt",
				path + "numbersNearlyOrdered1000.txt",
				path + "numbersReverse1000.txt",
				path + "numbersSorted1000.txt"};

        for (String file : files) {
        	String toPrint = "";
        	for(int i = file.length() - 1; i > 0; i--) {
        		if(file.charAt(i) == '\\') break;
        		toPrint = file.charAt(i) + toPrint;
        	}
        	
            ArrayList<Double> doubles = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line = br.readLine();
                while (line != null) {
                    line = br.readLine();
                    if (line != null) doubles.add(Double.parseDouble(line));
                }

                double[] a = resetArray(doubles);
                double startTime = System.nanoTime();
                SortComparison.selectionSort(a);
                double endTime = System.nanoTime();
                double duration = (endTime - startTime) / 1000000;
                System.out.println("Selection Sort time for " + toPrint + ": " + duration + "ms");

                a = resetArray(doubles);
                startTime = System.nanoTime();
                SortComparison.insertionSort(a);
                endTime = System.nanoTime();
                duration = (endTime - startTime) / 1000000;
                System.out.println("Insertion Sort time for " + toPrint + ": " + duration + "ms");

                a = resetArray(doubles);
                startTime = System.nanoTime();
                SortComparison.mergeSortIterative(a);
                endTime = System.nanoTime();
                duration = (endTime - startTime) / 1000000;
                System.out.println("MergeSort Iterative time for " + toPrint + " was " + duration + "ms");


                a = resetArray(doubles);
                startTime = System.nanoTime();
                SortComparison.mergeSortRecursive(a);
                endTime = System.nanoTime();
                duration = (endTime - startTime) / 1000000;
                System.out.println("MergeSort Recursive time for " + toPrint + ": " + duration + "ms");

                a = resetArray(doubles);
                startTime = System.nanoTime();
                SortComparison.quickSort(a);
                endTime = System.nanoTime();
                duration = (endTime - startTime) / 1000000;
                System.out.println("QuickSort time for " + toPrint + ": " + duration + "ms\n ");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
	
	private static double[] resetArray(ArrayList<Double> doubles) {
		double[] a;
		a = new double[doubles.size()];
		for (int j = 0; j < a.length; j++) {
			a[j] = doubles.get(j);
		}
		return a;
	}
	/*
	 * 	Selection Sort time for numbers10.txt: 0.636ms
		Insertion Sort time for numbers10.txt: 0.0139ms
		MergeSort Iterative time for numbers10.txt was 0.078ms
		MergeSort Recursive time for numbers10.txt: 0.0211ms
		QuickSort time for numbers10.txt: 0.0159ms

		Selection Sort time for numbers100.txt: 0.4708ms
		Insertion Sort time for numbers100.txt: 0.1859ms
		MergeSort Iterative time for numbers100.txt was 0.0529ms
		MergeSort Recursive time for numbers100.txt: 0.0594ms
		QuickSort time for numbers100.txt: 0.0569ms

		Selection Sort time for numbers1000.txt: 9.1046ms
		Insertion Sort time for numbers1000.txt: 7.6764ms
		MergeSort Iterative time for numbers1000.txt was 0.6852ms
		MergeSort Recursive time for numbers1000.txt: 0.2856ms
		QuickSort time for numbers1000.txt: 0.4294ms

		Selection Sort time for numbers1000Duplicates.txt: 0.5565ms
		Insertion Sort time for numbers1000Duplicates.txt: 0.8667ms
		MergeSort Iterative time for numbers1000Duplicates.txt was 0.2411ms
		MergeSort Recursive time for numbers1000Duplicates.txt: 0.227ms
		QuickSort time for numbers1000Duplicates.txt: 0.1598ms

		Selection Sort time for numbersNearlyOrdered1000.txt: 3.316ms
		Insertion Sort time for numbersNearlyOrdered1000.txt: 0.4257ms
		MergeSort Iterative time for numbersNearlyOrdered1000.txt was 0.1069ms
		MergeSort Recursive time for numbersNearlyOrdered1000.txt: 0.0907ms
		QuickSort time for numbersNearlyOrdered1000.txt: 0.0895ms

		Selection Sort time for numbersReverse1000.txt: 0.5746ms
		Insertion Sort time for numbersReverse1000.txt: 0.4907ms
		MergeSort Iterative time for numbersReverse1000.txt was 0.093ms
		MergeSort Recursive time for numbersReverse1000.txt: 0.0585ms
		QuickSort time for numbersReverse1000.txt: 0.7913ms
	
		Selection Sort time for numbersSorted1000.txt: 0.4294ms
		Insertion Sort time for numbersSorted1000.txt: 0.3994ms
		MergeSort Iterative time for numbersSorted1000.txt was 0.0955ms
		MergeSort Recursive time for numbersSorted1000.txt: 0.0627ms
		QuickSort time for numbersSorted1000.txt: 0.4719ms


	 */
	
}
