package javaHacks;

import java.util.Arrays;

public class PartialQuickSort {

	static int ctr = 0;
	public static void main(String[] args) {

		PartialQuickSort qs = new PartialQuickSort();

		int arr[] = { 5, 6, 1, 3, 2, 4, 6,7 ,11,12, 67, 99 };

		System.out.println(Arrays.toString(arr));

		qs.sort(arr, 0, arr.length - 1, 5);
		System.out.println(Arrays.toString(arr));

	}

	void sort(int arr[], int l, int r, int k) {

		ctr= ctr+1;
		System.out.println(ctr);

		
		if (l < r) {

			int pivot = arr[(l + r) / 2];
			int partitionIndex = partition(arr, l, r, pivot);
			sort(arr, l, partitionIndex - 1, k);
			sort(arr, partitionIndex, r,k);

//			if (partitionIndex < k) {
//				sort(arr, partitionIndex, r, k);
//			}

		}
		



	}

	int partition(int arr[], int l, int r, int pivot) {

		//System.out.println("pivot element    " + pivot);

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
