import java.util.*;
abstract class Processor
{
	double data;
	void show (){
		System.out.println("the data is "+data);
	}
	
	abstract void process();
}
class Factorial extends Processor
{
	void process(){
		int j = 5;
		int sum =1;
		for(int i = 1;i<= j; i++)
		{
			sum=sum*i;
		}
		data = sum;
	}
}

class Circle extends Processor
{
	void process(){
		int r = 5;
		double area;
		
		
			area=3.14f*r*r;
		
		data = area;
	}
}
class Q48
{
	public static void main(String[] z)
	{
		Processor p = new Factorial();
		Processor p1 = new Circle();
		p.process();
		p1.process();
		p.show();
		p1.show();
	}
}
		
			