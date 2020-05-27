package objectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RediffHomePagePF {
	WebDriver driver ;
	public RediffHomePagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (id = "srchword" )
	WebElement search;
	@FindBy (xpath = "//input[@type ='submit']")
	WebElement submit;
	@FindBy (xpath = "//*[@id='grid_display_23820550']/div[1]/h4/a/img")
	WebElement item1;
	public WebElement Search()
    {
    	return search;
    }
    public WebElement Submit()
    {
    	return submit; }
    public WebElement Phone()
    {return item1;}
    }
//test11
//test22
