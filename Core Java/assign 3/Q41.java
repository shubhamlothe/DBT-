public class thisQ41 {

	private  int age;
	private String name;
	thisQ41()
	{
		this(25,"shubham");
		System.out.println("In this construct");
	}
	thisQ41(int age,String name)
	{
		this.age = age;
		this.name = name;
		System.out.println("In param");
	}
	void display()
	{
		System.out.println("Age is "+age);
		System.out.println("Name is "+name);
	}
}


public class mainClassQ41 {

	public static void main(String arr[])
	{
		thisQ41 q1 = new thisQ41();
		q1.display();
	}
}
