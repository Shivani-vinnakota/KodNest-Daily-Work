package com.kodnest.arrayslevel5;

public class Search {
	int binarySearch(int arr[],int key) {
		
		//Binary Search Logic;
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(key == arr[mid]) {
				return mid;
			}
			else if(key>arr[mid]) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}

}
