import java.util.*;
class Q29{
	public static void main(String z[])
	{
		int a[] = {5,2,8,1,6,9};
		int b[] = {5,2,8,1,};
		int c[] = {5,2};
		int d[][] = new int [3][];
		 d[0]=a;
		 d[1]=b;
		 d[2]=c;
	System.out.println("given array");
	int count=0;
	int count1=0;
	for(int[] arr2: d)
	{count1++;
    for(int val: arr2){
	System.out.print(" "+ val);
       
	count++;
	}
	System.out.println();
	}
	System.out.println("number of 1D arrays in 2D arrays are "+count1);
	System.out.println("number of elements in 2D arrays are "+count);
	}
}