public class Q32a {
	private int rno;
	private String name;
	static int count = 0;
	void setData(String n,int no)
	{
		rno = no;
		name = n;
		count = count+1;
	}
	void showData()
	{
		System.out.println("Name of student is "+name);
		System.out.println("Roll number of student is "+rno);
		System.out.println("Total number of student are "+count);
		System.out.println("---------------------");
	}
}
public class Q32 {

	public static void main(String a[])
	{
		Q32a q = new Q32a();
		q.setData("shubham",115);
		q.showData();
		q.setData("shruti",110);
		q.showData();
	}
}