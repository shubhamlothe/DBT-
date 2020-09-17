import java.util.*;
class Q15{
public static void main(String z[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the gender and age");
char g = sc.next().charAt(0);
int a = sc.nextInt();
if((g=='F' && a>=18)||(g=='M' && a>=21))
{
System.out.println("You are eligble for Mirrage");
}
else
System.out.println("You are not eligble for Mirrage");
}

}