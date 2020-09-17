class Expression{
public static void main(String a[])
{
int x=5;
int y =x*x + 3*x -7;
int z =x++ + ++x; 
int b = x++ - --y - --x + x++;
System.out.println(" Result of expression is: "+y);
System.out.println(" Result of expression is: "+z);
System.out.println(" Result of expression is: "+b);
System.out.println(" Result of expression is: "+y);
}}