package day_6;

public class BubbleApp {
  public int sort(int key,int arr[]) 
  { 
	 
		  int low=0;
		  int high=arr.length-1;
		  while(low <= high) {
		  int mid=(low+high)/2;
			  if(key==arr[mid]) {
				 return mid;
			  }
			  else if(key < arr[mid])
			  {
				high=mid-1;
				
			  }
			  else if(key > arr[mid]) {
				  low=mid+1;
			  }		  
	  }	 
		  return -1;
  }
}
