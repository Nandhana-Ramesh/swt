package bhavya;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allprogrm {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver;
		WebDriver.get("https://mcampus.rajagiricollege.edu.in/StudentLogin/Create");
		{
			driver.FindElement(By.id("UserName"))sendkeys("abc@gmail.com"));
			driver.FindElement(By.id("Password"))sendkeys("123@ab"));
			driver.FindElement(By.id("Login")).click();
			  
		}
		{
			System.out.println("Title is"+driver).getTitle();
			String expected "welcome to student portal";
			String actual "driver.getTitle;"
			if(expected.contentEquals(actual));
			{
				System.out.println("test case is passed");
			}
			else
			{
				System.out.println("tesy case is failed");
			}
				

				}
			}

		}

}

