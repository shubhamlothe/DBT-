package com.assignments_2;

class Voter{
	int voterId;
	String name;
	int age;
	
	Voter(){
		
	}

	public Voter(int voterId, String name, int age) throws Exception{
		this.voterId = voterId;
		this.name = name;
		if(age>=18)
			this.age = age;
		else
			throw new Exception("Age should be more than 18");
	}
	
	
}


public class Question59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Voter v = new Voter(101, "Pratik", 15);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
