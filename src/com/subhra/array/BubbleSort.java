package com.subhra.array;

import java.util.*;

class BubbleSort
 {
	public static void main (String[] args)
	 {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 int T = sc.nextInt();
    	 
    	 while(T-- > 0)
    	 {
    	     int N = sc.nextInt();
    	     
    	     int[] arr = new int[N];
    	     for(int i = 0; i < N; i++)
    	     {
    	         arr[i] = sc.nextInt();
    	     }
    	     
    	     sortArray(arr, N);
    	     System.out.println(countSubset(arr, N));
    	 }
	 }
	 
	 public static int countSubset(int arr[], int N)
	 {
	     int count = 1;
	     for(int i = 0; i < N - 1; i++)
	     {
	         if(arr[i] + 1 != arr[i + 1])
	            count++;
	     }
	     return count;
	 }
	 
	 public static void sortArray(int arr[], int N)
	 {
	     for(int i = 0; i < N - 1; i++)
	     {
	         boolean flag = true;
	         
	         for(int j = 0; j < N - 1 - i; j++)
	         {
	             if(arr[j] > arr[j+1])
	             {
	                 int temp = arr[j];
	                 arr[j] = arr[j+1];
	                 arr[j+1] = temp;
	                 
	                 flag = false;
	             }
	         }
	         if(flag == true)
	            break;
	     }
	 }
}
