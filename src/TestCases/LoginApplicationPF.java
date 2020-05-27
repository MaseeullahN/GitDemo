package TestCases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objectRepository.RediffHomePagePF;
import objectRepository.RediffLoginPagePF;

public class LoginApplicationPF {
	public static void main(String[] args) {
	
     System.setProperty("webdriver.chrome.driver","D://Softwares_Installed//chromedriver//chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 RediffLoginPagePF rd = new RediffLoginPagePF(driver);
	 rd.EmailId().sendKeys("hello");
	 rd.Password().sendKeys("psd-hello");
	 rd.Submit().click();
	 RediffHomePagePF rh = new RediffHomePagePF(driver);
	 rh.Search().sendKeys("Nokia 1600");
	 rh.Submit().click();
	 rh.Phone().click();
	 //no comments please//
	}
	}


