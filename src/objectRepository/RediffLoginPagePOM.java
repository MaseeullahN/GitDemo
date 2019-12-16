package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPagePOM {
	

	WebDriver driver ;
	
	public RediffLoginPagePOM(WebDriver driver) {
		this.driver = driver;
	}
	By username = By.xpath("//*[@id=\'login1\']");
	By Password = By.id("password");
    By go = By.name("proceed");
    
    public WebElement EmailId()
    {
    	return driver.findElement(username);
    }
    public WebElement Password()
    {
    	return driver.findElement(Password);
    }

}
