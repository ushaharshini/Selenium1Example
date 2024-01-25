package week7.day1;

public class LearnStatic {

	static int x;
	String name;
	
	public static void print() {
		System.out.println("I am Printed");
	}
	
	public void write() {
		System.out.println("I am written");
	}
	
	public static void main(String[] args) {
		
		LearnStatic obj=new LearnStatic();
		
		System.out.println(x);
		System.out.println(obj.name);
		
		print();
		obj.write();
	}

}
