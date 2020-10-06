import java.util.Scanner;
class cal{
	private int r;
	private float pi=3.14f;
	private float a=0;
	void init(int r) {
		this.r =r;
	}
	void calculate() {
		a= r*r*pi;
	}
	void display()
	{
		System.out.println("the area of circle is "+a);
	}
}
public class Q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius of circle ");
		int r = sc.nextInt();
		cal c = new cal();
		c.init(r);
		c.calculate();
		c.display();

	}

}
