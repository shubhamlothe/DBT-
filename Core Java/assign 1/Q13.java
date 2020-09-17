import java.util.*;
class Q13{
public static void main(String z[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the salary");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int gr=(a>b && a>c)?a:((b>c && b>a)?b:c);

System.out.println("Greatest number: "+gr);
}

}