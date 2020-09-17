import java.util.*;
class Q12{
public static void main(String a[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the salary");
double s = sc.nextDouble();
if(s<10000)
{
double hra=s*0.10;
double da=s*0.90;
double g_s=s+hra+da;
System.out.println("Gross Salary: "+g_s);
}
else
{
double hra=2000;
double  da=s*0.98;
double  g_s=s+hra+da;
System.out.println("Gross Salary: "+g_s);
}}}