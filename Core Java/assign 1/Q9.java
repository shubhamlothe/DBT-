import java.util.*;
class Q9{
public static void main(String a[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the days");
int d = sc.nextInt();
int year=d/365;
int d1=d%365;
int mon = d1/30;
int d2=d1%30;

System.out.println("year:"+year+" moths:"+mon+" days: "+d2);
}
}