import java.util.*;
class Q14{
public static void main(String z[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the salary");
int a = sc.nextInt();

String gr=(a%4==0 && a%400==0 && a%100==0)?" is Leap":" is not Leap";

System.out.println(a+gr);
}

}