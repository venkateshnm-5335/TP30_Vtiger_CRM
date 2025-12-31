package testing;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class Conflict extends BaseClass{
@Test(groups = "smoke")
	public  void conflict() {
		System.out.println("--conflict to venkatesh code--");
		System.out.println("--conflict2 to venkatesh code--");
		System.out.println("conflict3 ");

	}
}
