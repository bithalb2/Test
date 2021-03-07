package com.subhra.array;

import java.util.Scanner;


public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements for Array : ");
		for(int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		
		quickSort(arr, 0, size);
		
		for(int i : arr)
			System.out.print(i+" ");	
	}
	
	public static void quickSort(int arr[], int low, int high)
	{
		if(low < high)
		{
			int x = partition(arr, low, high);
			System.out.println(x);
			for(int i : arr)
				System.out.print(i+" ");
			quickSort(arr, 0, x - 1);
			quickSort(arr, x + 1, high);
		}
	}
	
	public static int partition(int arr[], int low, int high)
	{
		int pivote = arr[low], count = low;
		for(int i = low + 1; i < high; i++)
		{
			if(arr[i] < pivote)
			{
				count++;
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
			}
		}
		int temp = arr[low];
		arr[low] = arr[count];
		arr[count] = temp;
		return count;
	}

}
