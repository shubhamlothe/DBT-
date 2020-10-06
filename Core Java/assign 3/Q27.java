import java.util.*;
class Q27{
	public static void main(String p[])
{
	int sum = 0;
	int a[] = {1,2,3};
	int b[] = {4,5,6};
	int c[] = {7,8,9};
	int d[] = {5,4,6,2,0};
	int e[] = {9,1,4};
	int arr[][] = new int [5][];
	arr[0]=a;
	arr[1]=b;
	arr[2]=c;
	arr[3]=d;
	arr[4]=e;

	for(int ar[]:arr)
	{
		for(int z:ar)
		{
			System.out.print(" "+z);
			sum+=z;
		}
		System.out.println();
	}
	System.out.println("sum is "+sum);

}
}
	

