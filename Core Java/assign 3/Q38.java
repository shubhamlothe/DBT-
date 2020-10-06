
class Employee 
{
	static int count=0;
	private int empid=0;
	private int salary;
    static int tot=0;
	
	Employee (int salary)
	{
		empid=++count;
		this.salary=salary;
		tot +=salary;
	}
	
	

	void show()
	{
		System.out.println(empid+ " "+salary);
		System.out.println("total sal is "+tot);
	}
}

public class Q38 {

	public static void main(String[] args)
	{
		Employee e=new Employee(10000);
		e.show();
		Employee e1=new Employee(15000);
		e1.show();
		
	}

}