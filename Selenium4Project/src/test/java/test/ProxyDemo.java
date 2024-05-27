package test;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class ProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Proxy proxy = new Proxy();
		proxy.setAutodetect(false);
		//proxy.setHttpProxy("localhost:8080"); 
		proxy.setSslProxy("localhost:8080");

		ChromeOptions options = new ChromeOptions();
		options.setCapability("proxy", proxy);
	
		ChromeDriver driver = new ChromeDriver(options);

	    driver.get("https://google.com/");
	    driver.quit();	   
	}

}
