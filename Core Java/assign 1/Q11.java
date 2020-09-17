import java.util.*;
class Q11{
public static void main(String a[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the numbers");
int a1 = sc.nextInt();
int b = sc.nextInt();
a1=a1+b;
b=a1-b;
a1= a1-b;

System.out.println(a1+" "+b);
}
}