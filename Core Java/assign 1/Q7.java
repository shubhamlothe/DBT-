import java.util.*;
class Q7{
public static void main(String a[]){
Scanner sc= new Scanner(System.in);
int sum=0;
int n = sc.nextInt();
for(int i=1;i<=n;i++)
{
int marks= sc.nextInt();
sum+=marks;
}
int per = sum/n;
System.out.println("Percentage is:"+per+"%");
}
}