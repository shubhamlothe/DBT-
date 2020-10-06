import java.util.*;
public class Q31 {
	private int rno;
	private String name;
	
	void setData(String n,int no)
	{
		rno = no;
		name = n;
	}
	void showData()
	{
		System.out.println("Name of student is "+name);
		System.out.println("Roll number of student is "+rno);
	}
}
public class Q31mainClass {

	public static void main(String a[])
	{
		Q31 q = new Q31();
		q.setData("Vipul",134);
		q.showData();
	}
}