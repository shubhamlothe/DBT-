class Employee{
	private int empId;	
	private String empName;
	Employee()
	{
	 // this.empId=101;
	 //this.empName="Rupali";
                      this(103,"Pallavi");	
                       this.empId=104;
	 this.empName="rups";
                      System.out.println("1 para  "+this);
	}
          	Employee(int empId,String empName)
	{
		 this.empId=empId;
	 	 this.empName=empName;	
                           	System.out.println("2 para  "+this);
	}
           	void show(){	
	 	System.out.println("Employee id: "+empId+" 	Employee Name "+empName);
	}
}

class Q33
{
   public static void main(String args[]){
   Employee e=new Employee();
   e.show();
    /*Employee e1=new Employee(102,"Sonali");
   e1.show();*/
}
}