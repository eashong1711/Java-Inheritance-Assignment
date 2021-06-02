
public class Parent {
	void pMethod() {
   System.out.println("This is parent class");
	}
}

class Child extends Parent{
	void cMethod(){
    System.out.println("This is child class");
	}
	
   
	public static void main(String[] args) {
		Parent d = new Parent();
		 Child y = new Child();
		
		 d.pMethod();
		 y.cMethod();
		 y.pMethod(); 

	}

}




