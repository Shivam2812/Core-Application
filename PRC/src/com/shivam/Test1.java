package com.shivam;

public class Test1 {
	
	private int x, y;
	
	public  Test1(int x, int y)
	{
		x = x;
	}
	
	public String toString() {
		 return "[" + x + ", " + y + "]";
		 }
	
	public static void main(String[] args) {
		Test1 t1 = new Test1(2,2);
		System.out.println(t1);
		System.out.println("==================================================");
				Integer i = 10;
		 Integer j = 11;
		 Integer k = ++i; // INCR
		 System.out.println("k == j is " + (k == j));
		 System.out.println("k.equals(j) is " + k.equals(j));
		 
		 System.out.println("======================================================");
		 int []arr1 = {1, 2, 3, 4, 5};
		 int []arr2 = {1, 2, 3, 4, 5};
		 System.out.println("arr1 == arr2 is " + (arr1 == arr2));
		 System.out.println("arr1.equals(arr2) is " + arr1.equals(arr2));
		
		 System.out.println("Arrays.equals(arr1, arr2) is " +
		 java.util.Arrays.equals(arr1, arr2));
		 System.out.println("====================================");
		 
		 String str = null;
		 if(str instanceof Object) // NULLCHK
		 System.out.println("str is Object");
		 else
		 System.out.println("str is not Object");
	}
	 

}
