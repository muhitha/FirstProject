package TestNG;

import org.testng.annotations.Test;

public class DepenciesManagement {
	@Test(enabled=true)
	public void FirstClass() {
	System.out.println("This is FirstClass");
	}
	
	@Test(dependsOnMethods="FirstClass")
	public void SecondClass() {
	System.out.println("This is SecondClass");
	}
	
	@Test(dependsOnMethods="SecondClass")
	public void ThirdClass() {
	System.out.println("This is ThirdClass");
	}
	
	@Test(dependsOnMethods="ThirdClass")
	public void FourthClass() {
	System.out.println("This is FourthClass");
	}
	
	@Test(dependsOnMethods="FourthClass")
	public void FifthClass() {
	System.out.println("This is FifthClass");
	}
	}







