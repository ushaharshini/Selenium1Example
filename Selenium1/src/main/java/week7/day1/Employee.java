package week7.day1;

public class Employee {
	String name;
	int id;
	
	//default
	public Employee() {
		this(10,"Usha");
		System.out.println("Default constructor");
		
	}
	
	//single constructor
	public Employee(int x) {
		this();
		this.id=x;
        System.out.println("Single constructor " +this.id);
		
	}
	
	//two parameter constructor
	public Employee(int x,String name) {
		
		System.out.println("Two Parameter Constructor " +id + "and" +name);
		
	}
	
	

	public static void main(String[] args) {
		
		
		Employee obj=new Employee(15);
		System.out.println(obj.id);
		System.out.println(obj.name);

	}

}
