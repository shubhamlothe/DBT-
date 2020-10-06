class Person{
	private int age;
	private String name;
	public void  set(String name)
	{
		this.age=18;
		this.name=name;
	}
	void show()
	{
		System.out.println(age+" "+name);
	}
	
}
public class Q37 {

	public static void main(String[] args) {
	Person p = new Person();
	p.set("shubham");
	p.show();
	

	}

}
