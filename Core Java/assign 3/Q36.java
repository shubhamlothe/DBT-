import java.util.Scanner;
class MathOperations{
                    void multiply(int a,int b)
                     {
 	  int result=a+b;
	  System.out.println("Addition of two interer value: "+result);
	}
	void multiply(float a,float b,float c)
                     {
 	  float result=a+b+c;
	  System.out.println("Addition of three float value: "+result);
	}
                     void multiply(double a,int b)
                     {
 	  double result=a+b;
	  System.out.println("Addition of three float value: "+result);
	}

}

class Q36
{
   public static void main(String args[]){
  // Scanner sc=new Scanner(System.in);
   MathOperations mo=new MathOperations();
   mo.multiply(2,2);
   mo.multiply(2.1f,2.5f,7.9f);
   mo.multiply(2.888,2);
   
}
}