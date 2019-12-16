package TestCases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objectRepository.RediffHomePagePF;
import objectRepository.RediffLoginPagePF;
import org.testng.annotations.Test;
public class LoginApplicationPF {
	@Test
	public void Login()
	{
	 System.setProperty("webdriver.chrome.driver","D://Testing Softwares//ChromeDriver//chromedriver_win32//chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 RediffLoginPagePF rd = new RediffLoginPagePF(driver);
	 rd.EmailId().sendKeys("hello");
	 rd.Password().sendKeys("psd-hello");
	 //rd.Submit().click();
	 rd.Home().click();
	 RediffHomePagePF rh = new RediffHomePagePF(driver);
	 rh.Search().sendKeys("Nokia 1600");
	 rh.Submit().click();
	 rh.Phone().click();
	}
	}


