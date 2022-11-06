package stepDefinition;

import org.flip.base.Base2;
import org.pageexe.FlipPageEXe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipExe extends FlipPageEXe{
	@Given("Enter the Url")
	public void enter_the_url() {
	    browserLaunch();
	    Base2.geturl("https://www.flipkart.com/");
	}
	@Given("Skip the Login page")
	public void skip_the_login_page() throws InterruptedException  {
	username();
	password();
	click();
	Thread.sleep(2000);

	}
	   
	@When("Move Cursor to the Electronics")
	public void move_cursor_to_the_electronics() throws InterruptedException {
		electronics();
		Thread.sleep(2000);
	}
	
	@When("Move to Laptop and desktop")
	public void move_to_laptop_and_desktop()  {
		laptops();
	
	}
	@When("click Gaming Laptop")
	public void click_gaming_laptop() throws InterruptedException  {
		gaming();
		Thread.sleep(2000);
		
	}
	
	@When("Select lowest Price laptop")
	public void select_lowest_price_laptop() {
		driver.navigate().refresh();
	    title();
	    price();
	    lowprice();
	}

	@When("Click add to Cart")
	public void click_add_to_cart() {
		addToCart();
	}
	@When("Select Applianances")
	public void select_applianances() throws InterruptedException
	{
		appliance();
		Thread.sleep(2000);
	}
	@When("Navigated to Tv & Appliances")
	public void navigated_to_tv_appliances() {
	    tv();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("Navigate to Samsung TV")
	public void navigate_to_samsung_tv() {
	   samsung();
	}
	@When("Select lowest price TV")
	public void select_lowest_price_tv() {
		tvname();
		tvprice();
		lowpricetv();
	}
	/*@When("Select add to Cart")
	public void select_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Validate the Add to cart page")
	public void validate_the_add_to_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
*/




}
