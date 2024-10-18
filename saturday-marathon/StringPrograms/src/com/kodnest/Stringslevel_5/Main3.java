package com.kodnest.Stringslevel_5;

public class Main3 {
	public static void main(String[] args) {
		String str="OMKAR";
		for(int i=0;i<=str.length()-1;i++)
		{
		   for(int j=i;j<=str.length();j++)
		    {
		         String s=str.substring(i,j);
		         System.out.println(s+" ");
		    }
		}
	}
}
/*public class Main3 {
    public static void main(String[] args) {
      String str="OMKAR";
      for(int i=0;i<=str.length()-1;i++)
       {
           String temp="";
          for(int j=i;j<=str.length()-1;j++)
         {
		   temp=temp+str.charAt(j);
		  System.out.println(temp);
    }
   }
  }
}*/
