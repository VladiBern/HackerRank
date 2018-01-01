The absolute difference between two integers, a and b, is written as |a-b|. 
The maximum absolute difference between two integers in a set of positive integers, elements,
is the largest absolute difference between any two integers in elements.

The Difference class is started for you in the editor. 
It has a private integer array (elements) for storing N non-negative integers, 
and a public integer (maximumDifference) for storing the maximum absolute difference.

Task 
Complete the Difference class by writing the following:

A class constructor that takes an array of integers as a parameter and saves it to the elements instance variable.
A computeDifference method that finds the maximum absolute difference between any 2 numbers in N 
and stores it in the maximumDifference instance variable.

----------------------------------------

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    
    public Difference(int []arr)
 {
     
     this.elements = arr;
 }
public void computeDifference()
{
    bubbleSort(elements);
    
    maximumDifference=Math.abs(elements[0]- elements[(elements.length-1)]);
    
}
 
public static void bubbleSort(int arr[])
 
	{
        int temp;
 
		for(int x=0; x<arr.length-1;x++)
		{
			
			for(int y=0;y<arr.length-x-1;y++)
			{
				
				if(arr[y]>arr[y+1])
				{
					temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
			}
				
		}
	}
	} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
