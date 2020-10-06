import java.util.*;
class Q27a{
	public static void main(String p[])
{

	int a[] = {5,2,8,1,6,9};
	int l = a.length;
	System.out.println("given array");
	for(int z:a)
		{
			System.out.print(" "+z);
			
		}
	Arrays.sort(a);
	
		
		System.out.println();
		System.out.println("smallest number is " + a[0]);
		System.out.println("largest number is " + a[l-1]);
	

}
}
	

