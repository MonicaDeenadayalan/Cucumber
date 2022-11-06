package org.flip.base;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base2 {
	public static WebDriver driver;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void geturl(String Url) {
		driver.get(Url);
	}

	public static void clickData(WebElement element) {
		element.click();
	}
	public static void clickData1(List<WebElement> elements) {
		for (WebElement web : elements) {
			web.click();
		}
	}

	public static WebElement findElement(By by) {
		return driver.findElement(by);
	}

	public static void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void selectbyvalue(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public static void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	public static void implicitWait(long l) {
		driver.manage().timeouts().implicitlyWait(l, TimeUnit.SECONDS);
	}
	public static void findElementsli(List<WebElement> elements)
	{
		for (WebElement data : elements) {
			System.out.println(data.getText());
			
		}
		
	}
	public static List<WebElement> findElementBy1(By by)
	{
		return driver.findElements(by);
		
	}
	public static void findElementsli2(List<WebElement> elements,List<WebElement> elements1)
	{
		String laptopname;
		String laptoprice1;
		int laptoprice;
		HashMap<Integer, String> maps = new HashMap<Integer,String>();
		for(int i=0;i<elements.size();i++) 
		{
			 laptopname = elements.get(i).getText();
				 laptoprice1 = elements1.get(i).getText();
			laptoprice1 = laptoprice1.replaceAll("[^0-9]", "");
			laptoprice = Integer.parseInt(laptoprice1);
			maps.put(laptoprice, laptopname);	
		}
		
		Set<Integer> allkeys = maps.keySet();
		ArrayList<Integer> lappri = new ArrayList<Integer>(allkeys);
		Collections.sort(lappri);
		Integer lowprice = lappri.get(0);
		System.out.println("LowPrice laptop is " +lowprice+ "Product name is " +  maps.get(lowprice));
		
	}
	public static void findElementsli3(List<WebElement> el ,List<WebElement> el1)
	{
		String tvname;
		String tvprice;
		int price;
		HashMap<Integer,String> li=new HashMap<Integer,String>();
		for(int i=0;i<el.size();i++)
		{
			tvname=el.get(i).getText();
			tvprice=el1.get(i).getText();
			tvprice=tvprice.replaceAll("^[0-9]", "");
			price=Integer.parseInt(tvprice);
			li.put(price, tvname);
		}
		Set<Integer> allprice=li.keySet();
		ArrayList<Integer> lowpr=new ArrayList<Integer>(allprice);
		Collections.sort(lowpr);
		Integer integer = lowpr.get(0);
		System.out.println("LowPrice tv is " +integer+ "Product name is " +  li.get(integer));
	}
	

	
}	
	