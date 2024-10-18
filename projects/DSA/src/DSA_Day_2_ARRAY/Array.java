package DSA_Day_2_ARRAY;

import java.util.Scanner;

public class Array 
{
  private int arr[];
  private int pos;
  private int elem;
  Scanner scan = new Scanner(System.in);
  public Array(int n) {
	  arr = new int[n];
  }
  public void insert()
  {
	  System.out.println("Enter the position from 0 to " +(arr.length-1));
	 pos = scan.nextInt();
	System.out.println("Enter the element");
	 elem=scan.nextInt();
	arr[pos]=elem;
  }
  
  public void delete()
  {
	  System.out.println("Enter the position from o to "+(arr.length-1));
	  pos=scan.nextInt();
	  System.out.println("Element deleted is "+arr[pos]);
	  arr[pos]=0;
  }
  public void display()
  {
	  for (int i=0;i<=arr.length-1;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }
  }
}
