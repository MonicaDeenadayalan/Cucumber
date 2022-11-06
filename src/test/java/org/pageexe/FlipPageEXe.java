package org.pageexe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.LocatorPage.FlipLoca;
import org.flip.base.Base2;
import org.openqa.selenium.WebElement;

public class FlipPageEXe extends FlipLoca{
	public static void username()
	{
		Base2.sendKeys(Base2.findElement(FlipLoca.username), "9840619635");
	}
	public static void password()
	{
		Base2.sendKeys(Base2.findElement(FlipLoca.password), "Moni@123");
	}
	public static void click()
	{
		Base2.clickData(Base2.findElement(FlipLoca.click));
	}
	public static void electronics()
	{
		Base2.moveToElement(Base2.findElement(FlipLoca.electronics));
	}

	public static void laptops()
	{
		Base2.moveToElement(Base2.findElement(FlipLoca.laptop));
	}
	public static void gaming()
	{
		Base2.moveToElement(Base2.findElement(FlipLoca.gaming));
		Base2.clickData(Base2.findElement(FlipLoca.gaming));
		
	}
	public static void title()
	{
		Base2.findElementsli(Base2.findElementBy1(FlipLoca.title));
		
	}
	public static void price()
	{
		Base2.findElementsli(Base2.findElementBy1(FlipLoca.price));
		
	}

	public static void lowprice()
	{
		Base2.findElementsli2(Base2.findElementBy1(FlipLoca.title), Base2.findElementBy1(FlipLoca.price));
		
	}
	public static void addToCart()
	{
//		Base2.clickData1(Base2.findElementBy1(Base2.));
		
	}
	public static void appliance()
	{
		Base2.clickData(Base2.findElement(FlipLoca.appliance));
	}
	public static void tv()
	{
		Base2.moveToElement(Base2.findElement(FlipLoca.tv));
	}
	public static void samsung()
	{
		Base2.moveToElement(Base2.findElement(FlipLoca.samusung));
		Base2.clickData(Base2.findElement(FlipLoca.samusung));	
	}
	public static void tvname()
	{
		Base2.findElementsli(Base2.findElementBy1(FlipLoca.tvname));
	}
	public static void tvprice()
	{
		Base2.findElementsli(Base2.findElementBy1(FlipLoca.tvprice));
	}
	public static void lowpricetv()
	{
		Base2.findElementsli3(Base2.findElementBy1(FlipLoca.tvname), Base2.findElementBy1(FlipLoca.tvprice));
	}
}
