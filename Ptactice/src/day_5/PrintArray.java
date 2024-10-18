package day_5;

public class PrintArray {

	public static void printArray(int[] arr1) {
	  
		System.out.println("Array in forward direction :");
		for(int x:arr1) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Array in reverse direction :");
		for(int i =arr1.length-1;i>=0;i--) {
			System.out.print(arr1[i]+" ");
		}
		
	}

}
