import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MyFirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("http://www.edureka.co");
		driver.get("http://192.168.92.101:9943/about-us.php");
		//driver.findElementByLinkText("Blog").click();
		//String Input = "about";
		String text = driver.findElementByTagName("b").getText();
		//System.out.println(text);
		if(text.equalsIgnoreCase("about"))
				System.out.println("Test Passed");
		//assertTrue("Passed",Input.equals(text))
		
        driver.close();
	}

}
