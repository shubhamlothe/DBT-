import java.util.*;
interface taxable{
	double salesTax = 0.7;
	double incomeTax = 0.105;
	public abstract clacTax(){}
	
}
class Employee impliments taxable
{
	int empid;
	int salary;
	String name;
	Employee(){}
	Employee(int empid,int salary,String name)
	{
		this.empid=empid;
		this.salary=salary;
		this.name=name;
	}
	public void clacTax(){
		double incomeTax = salary*incomeTax;
		System.out.println("total income tax is : " + incomeTax);
	}
}

class Product impliments taxable
{
	int pid;
	int price;
	int quantity;
	Product(){}
	Product(int pid,int price,int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	public void clacTax(){
		double salesTax = (price*quantity)*salesTax;
		System.out.println("total income tax is : " + salesTax);
	}
}
class Q49
{
	public static void main(String[] z)
	{
		taxable t = new Employee(1,15001,"shubham");
		taxable p = new Product(1,20,400);
		
	