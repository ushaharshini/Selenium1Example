package week7.day1;

public class SubClass extends LearnSuper{
public SubClass() {
	super();
	System.out.println("Child class");
}
public void empDetail() {
	System.out.println(super.id);
	super.empDetail();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClass obj=new SubClass();
		obj.empDetail();

	}

}
