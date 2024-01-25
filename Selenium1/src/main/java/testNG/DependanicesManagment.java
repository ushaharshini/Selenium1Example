package testNG;

import org.testng.annotations.Test;

public class DependanicesManagment {
	@Test(enabled = true)
	public void HighSchool() {
		System.out.println("High school");
	}
	@Test(dependsOnMethods = "HighSchool")
	public void HighSecSchool() {
		System.out.println("Higher Secondery School");
	}
	@Test(dependsOnMethods = "HighSecSchool")
	public void College() {
		System.out.println("College");
	}
}
