package week7.day1;

public class LearnConstructor {
	int x;
	String name;
	
	//Default
	public LearnConstructor() {
		System.out.println("Default constuctor");
		
	}
	
	//Parameterized
	public LearnConstructor(int x,String name) {
		System.out.println("Parameterized constuctor");
		System.out.println("Interger value; "+x+ "String Value: " +name);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LearnConstructor obj=new LearnConstructor();
		LearnConstructor obj1=new LearnConstructor(10,"TestLeaf");
		System.out.println(obj.x);
		System.out.println(obj.name);
		System.out.println(obj1.name);
		
	
		
	}

}
