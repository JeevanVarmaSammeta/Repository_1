import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnew {

	@BeforeTest
	public void LaunchBrowser() {
		System.out.println(" Before test ");
	}

	@Test(priority = 1)
	public void Login() {

		Assert.assertTrue(true);
	}

	@Test(priority = 3)
	public void Registration() {
		Assert.assertEquals("Jeevan", "Jeev", "Both are not Equal");

		Assert.assertEquals(true, true);
		System.out.println("1");
		Assert.assertEquals(true, true);
		System.out.println("2");
	}

	@Test
	public void Logout() {
		Assert.assertEquals(true, true);
		System.out.println("Logout2 S");
		Assert.assertEquals(true, true);
		System.out.println("Logout S");
	}

	@Test(priority = 0)
	public void Test() {
		System.out.println("Zero Prior");

	}

	@AfterTest
	public void CloseBrowser() {
		System.out.println(" closing browser ");
	}
}
