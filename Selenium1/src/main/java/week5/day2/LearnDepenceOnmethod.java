package week5.day2;

import org.testng.annotations.Test;

public class LearnDepenceOnmethod {
	@Test
	public void create() {
		System.out.println("Create");
		throw new RuntimeException();
		
	}
	@Test(dependsOnMethods ="create",alwaysRun=true)
	public void edit() {
		System.out.println("Edit");
		
	}
	@Test
	public void duplication() {
		System.out.println("Duplication");
		
	}


}
