package javaHacks;

import java.util.Arrays;

public class PartialQuickSort {

	public static void main(String[] args) {

		PartialQuickSort qs = new PartialQuickSort();

		int arr[] = { 5, 6, 1, 3, 8, 9, 6, 2, 7, 8 };

		System.out.println(Arrays.toString(arr));

		qs.sort(arr, 0, arr.length - 1,5);
		//System.out.println(Arrays.toString(arr));

	}

	void sort(int arr[], int l, int r,int k) {

		if (l < r) {

			int pivot = arr[(l + r) / 2];
			int partitionIndex = partition(arr, l, r, pivot);
			sort(arr, l, partitionIndex - 1,k);
			//sort(arr, partitionIndex, r);
			if(partitionIndex<k-1) {
				sort(arr, partitionIndex+1, r,k);
			}
			
		}
		
		System.out.println(Arrays.toString(arr));

	}

	 int partition(int arr[], int l, int r, int pivot) {

		while (l <= r) {
			while (arr[l] < pivot) {
				l++;
			}

			while (arr[r] > pivot) {
				r--;
			}

			if (l <= r) {
				int temp = arr[r];
				arr[r] = arr[l];
				arr[l] = temp;
				l++;
				r--;
			}

		}

		return l;

	}
}
