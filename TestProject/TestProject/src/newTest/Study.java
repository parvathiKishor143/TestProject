package newTest;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARVATHI KISHOR\\OneDrive\\Desktop\\eclipse\\eclipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.linkedin.com/");
		
		List<WebElement> li= dr.findElements(By.xpath("//a[contains(@href,'.')]")) ;
		
		for(WebElement link: li) {
			String url= link.getAttribute("href");
			
			if(url==null || url==" ") {
				System.out.println("empty");
				continue;
			}
			
			try {
				HttpURLConnection huc= (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				int code=huc.getResponseCode();
				
				if(code>=400) {
					System.out.println(code);
					}
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}

