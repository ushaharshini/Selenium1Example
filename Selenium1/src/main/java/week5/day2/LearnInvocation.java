package week5.day2;

import org.testng.annotations.Test;

public class LearnInvocation {
@Test(invocationCount =3,invocationTimeOut = 3000,threadPoolSize = 2)
	public void create() {
		System.out.println("Create Lead");
	}
@Test
	public void edit() {
		System.out.println("Edit Lead");
	}
@Test
	public void delete() {
		System.out.println("Delete Lead");
	}
}
