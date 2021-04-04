import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Firstpackage.TestNGListeners.class)
public class firsttestngprogramme {

	@BeforeTest
	public void Open()
	{
		System.out.println("Open the Browser");
	}
	@Test(priority=1)
	public void Navigate()
	{
		System.out.println("Navigate to any page");	
	}
	@Test(priority=2)
	public void Register()
	{
		System.out.println("Register For New Account");
	}
	@Test(priority=3)
	public void Login()
	{
		System.out.println("Login into the Account");
	}
	@Test(priority=4)
	public void DailyReports()
	{
		System.out.println("Prepare daily reports and send it to lead");
	}
	@Test(priority=5)
	public void Logout()
	{
		System.out.println("Logout from the application");
	}
	@AfterTest
	public void close()
	{
		System.out.println("Close the browser");
	}
	
}
