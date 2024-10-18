package com.kodnest.arrayslevel3;

public class Search {
	int linearSearch(int arr[],int key) {
         for(int i = 0; i<= arr.length-1;i++) {
	      if(arr[i]==key) {
	              return i;
	          }
           }
         return -1;
	}
}
