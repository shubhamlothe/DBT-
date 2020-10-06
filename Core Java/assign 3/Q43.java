import java.util.Scanner;
class OneBHK{
	double roomArea;
	double hallArea;
	double price;

	OneBHK(double roomArea,double hallArea,double price){
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}

	void show(){
		System.out.println("Room Area 1: "+roomArea+" Hall 	Area:"+hallArea+" Price:"+price);
	}
}

class TwoBHK extends OneBHK{
	double roomArea2;
	TwoBHK(double roomArea,double hallArea,double price,double roomArea2){
                                          super(roomArea, hallArea, price);
		this.roomArea2=roomArea2;
		
	}

	void show(){
		super.show();
		System.out.println("Room Area 2: "+roomArea2);
	}
}

class Q43{
public static void main(String args[]){
 	Scanner sc=new Scanner(System.in);
	double total = 0.00;
	TwoBHK []tb=new TwoBHK[3];
	for(int i=0;i<tb.length;i++){
		System.out.println("Enter Room1 area:  ");
		double ra1=sc.nextDouble();
		System.out.println("Enter Hall area:  ");
		double ha=sc.nextDouble();
		System.out.println("Enter Price:  ");
		double price=sc.nextDouble();
		 total += price;
		System.out.println("Enter Room2 area:  ");	
		double ra2=sc.nextDouble();
		
                                          TwoBHK tb1=new TwoBHK(ra1,ha,price,ra2);
		tb[i]=tb1;
                                           
	}
	for(TwoBHK a: tb){
		a.show();
	}
	System.out.println("Total Prize of the flats: "+total);
}}