

import java.util.Scanner;
class Q19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		int n=2;
		for(int i=1;i<=num;i++)
		{
		n=n+10;
		if(i==(num-1)){
		System.out.print(n);
		break;
		}	
		System.out.print(n+ "+");
		}

}
}