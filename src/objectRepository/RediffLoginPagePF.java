package objectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RediffLoginPagePF {
	WebDriver driver ;
	public RediffLoginPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);}
	@FindBy (xpath = "//*[@id=\'login1\']")
	WebElement username;
	@FindBy (id = "password" )
	WebElement Password;
	@FindBy (name = "proceed")
	WebElement Submit;
	@FindBy (linkText = "Home")
	WebElement Home;
	public WebElement EmailId()
    {return username;}
    public WebElement Password()
    {
    	return Password;}
    public WebElement Submit()
    {
    	return Submit; }
    public WebElement Home()
    {
    	return Home;}}
    


