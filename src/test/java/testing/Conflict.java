package testing;

import org.testng.annotations.Test;

public class Conflict {
	@Test(groups = "smoke")
	public  void conflict() {
		String BROWSER = System.getProperty("browser");
		System.out.println("--conflict to venkatesh code--");
		System.out.println("--conflict2 to venkatesh code--");

	}
}
