import java.util.*;
class Q17
{
public static void main(String z[])
{
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();			

int res=0;

while(n!=0)
{
int r = n%10;
 res = res*10 + r;
 n = n/10;
}
System.out.println(res);
}
}