package testing;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class OrgTest1 extends BaseClass{
	@Test(groups = "smoke")
	public void orgTest1() {
		System.out.println("--OrgTest1--Anitha");
	}

}
