package com.cdac;

public class ReverseString {

	public static void main(String[] args) {
		String str = "SANDESH";
		
		//Method 1
		char[] chArr = str.toCharArray();
		for(int i = chArr.length-1;i>=0;i--)
		{
			System.out.print(chArr[i]);
		}
      System.out.println("");
      
      //Method2
      for(int i = str.length()-1;i>=0;i--)
      {
    	  System.out.print(str.charAt(i));
      }
      System.out.println("");
      //method 3
      StringBuffer sb = new StringBuffer(str);
      System.out.println(sb.reverse());
      
      //method 4 
      StringBuilder sb1 = new StringBuilder(str);
      System.out.println(sb1.reverse());
	}

}