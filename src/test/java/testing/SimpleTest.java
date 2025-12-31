package testing;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class SimpleTest extends BaseClass{
@Test (groups = "smoke")
	public void simpleTest() {

		System.out.print("Venkatesh-- Good morning");
	}

}
