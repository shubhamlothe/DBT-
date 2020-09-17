import java.util.*;
class Q8{
public static void main(String a[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the principle");
double p = sc.nextDouble();
System.out.println("Enter the ROI");
double r = sc.nextDouble();
System.out.println("Enter the time");
double t = sc.nextDouble();

double SI = (p*t*r)/100;
System.out.println("Simple Interest is:"+SI);
}
}