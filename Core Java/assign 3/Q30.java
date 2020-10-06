import java.util.*;
class Q30{
	public static void main(String z[])
	{
		int a[] = {5,2,8};
		int b[] = {5,2,8};
		int c[] = {5,2,4};
		int d[][] = new int [3][3];
		 d[0]=a;
		 d[1]=b;
		 d[2]=c;
	System.out.println("given array");
	int sum = 0;
	for(int[] arr2: d)
	{
    for(int val: arr2){
	System.out.print(" "+ val);
       
	}
	System.out.println();
	}
	for(int i =0 ;i<d.length.i++)
	{
		for(int j =0 ;j<d.length.j++)
		{
			if(i==j)
			{
				sum+=d[i][j];
			}
		}
	}
		
	
	System.out.println("number of 1D arrays in 2D arrays are "+sum);
	System.out.println("number of elements in 2D arrays are "+count);
	}
}