public class Q53 {

	public static void main(String[] args) {
		String s[]= {"1","2","3","4","5","6","7"};
		double sum=0;
		for(String ss:s) {
			int a=Integer.parseInt(ss);
			sum+=a;
		}
		System.out.println("Sum of Integers are:"+sum);
	}

}