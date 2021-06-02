
public class Member {
	// Data Members
		String name;
		int age;
		String phone_Number;
		String address;
		int salary;
		
		 void printSalary(){
		  System.out.println(salary);
  }
}
 class Employee extends Member {
	 String specialization;
	 void employee() {
		 System.out.println(name +" "+ age +" "+phone_Number+" "+ address+" $"+salary+" "+specialization);
	 }
	 
 }
	 class Manager extends Member {
	 String department;
	 void manager() {
		 System.out.println(name +" "+ age +" "+phone_Number+" "+ address+" $"+salary+" "+department);
		 }   
	 
	 public static void main (String args []) {
		 Employee x = new Employee();
		 Manager y = new Manager(); 
		 x.name = "Ebenezer Ashong";
		 x.age = 49;
		 x.phone_Number = "0559558426";
		 x.address = "Atta Wusu Avenue,Plot 3 Block K";
		 x.salary =  4000;
		 x.specialization = "Mathematics";
		 
		 y.name = "Mehmood Ahmad";
		 y.age = 40;
		 y.phone_Number= "0559558425";
		 y.address = "Atta OWusu Avenue,Plot 3 Block K";
		 y.salary = 4001;
		 y.department = "Finance Dept";
		
		 x.employee();
		 y.manager();
				 
		 
		 
	 }
	 
	 
	 
 }