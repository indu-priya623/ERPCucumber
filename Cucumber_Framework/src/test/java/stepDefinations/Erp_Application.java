package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.When;

public class Erp_Application 
{
WebDriver driver ;
@When("launch browser")
public void launch_browser() 
{
    driver = FunctionLibrary.startBrowser();
}

@When("launch url with {string} in  browser")
public void launch_url_with_in_browser(String url) 
{
   FunctionLibrary.openUrl(url);
}
@When("wait for username with {string} and {string}")
public void wait_for_username_with_and(String Locator_Type, String Locator_value)
{
   FunctionLibrary.waitForElement(Locator_Type, Locator_value,Duration.ofSeconds(10));
}
@When("enter username with {string} and {string} and {string}")
public void enter_username_with_and_and(String Locator_Type, String Locator_value, String Test_Data)
{
   FunctionLibrary.typeAction(Locator_Type,Locator_value,Test_Data);
}
@When("enter password with {string} and {string} and {string}")
public void enter_password_with_and_and(String Locator_Type, String Locator_value, String Test_Data)
{
   FunctionLibrary.typeAction(Locator_Type, Locator_value, Test_Data);
}
@When("click submit with {string} and {string}")
public void click_submit_with_and(String Locator_Type, String Locator_value)
{
   FunctionLibrary.clickAction(Locator_Type, Locator_value);
}
@When("wait for logout link with {string} and {string}")
public void wait_for_logout_link_with_and(String Locator_Type, String Locator_value) 
{
	FunctionLibrary.waitForElement(Locator_Type, Locator_value,Duration.ofSeconds(10));
}
@When("validate page title with {string}")
public void validate_page_title_with(String string)
{
   FunctionLibrary.validateTitle(string);
}
@When("wait for customer link with {string} and {string}")
public void wait_for_customer_link_with_and(String Locator_Type, String Locator_value)
{
	FunctionLibrary.waitForElement(Locator_Type, Locator_value,Duration.ofSeconds(10));
	
}
@When("click customer link with {string} and {string}")
public void click_customer_link_with_and(String Locator_Type, String Locator_value) 
{
 FunctionLibrary.clickAction(Locator_Type, Locator_value);
}
@When("wait for addIcon with {string} and {string}")
public void wait_for_add_icon_with_and(String Locator_Type, String Locator_value) 
{
	FunctionLibrary.waitForElement(Locator_Type, Locator_value,Duration.ofSeconds(10));
}
@When("click addIcon with {string} and {string}")
public void click_add_icon_with_and(String Locator_Type, String Locator_value)
{
   FunctionLibrary.clickAction(Locator_Type,Locator_value);
}
@When("wait for customer with {string} and {string}")
public void wait_for_customer_with_and(String Locator_Type, String Locator_value) 
{
	FunctionLibrary.waitForElement(Locator_Type, Locator_value,Duration.ofSeconds(10));
}
@When("capture customer number with {string} and {string}")
public void capture_customer_number_with_and(String Locator_Type, String Locator_value) throws Throwable 
{
    FunctionLibrary.captureCustomer(Locator_Type, Locator_value);
}
@When("enter customer name in {string} with {string} and {string}")
public void enter_customer_name_in_with_and(String Test_Data, String Locator_Type, String Locator_value)
{
	  FunctionLibrary.typeAction(Locator_Type, Locator_value, Test_Data);
}
@When("enter address in {string} with {string} and {string}")
public void enter_address_in_with_and(String Test_Data, String Locator_Type, String Locator_value)
{
	  FunctionLibrary.typeAction(Locator_Type, Locator_value, Test_Data);
}
@When("enter city in {string} with {string} and {string}")
public void enter_city_in_with_and(String Test_Data, String Locator_Type, String Locator_value) 
{
    FunctionLibrary.typeAction(Locator_Type, Locator_value, Test_Data);
}
@When("enter country in {string} with {string} and {string}")
public void enter_country_in_with_and(String Test_Data, String Locator_Type, String Locator_value)
{
	FunctionLibrary.typeAction(Locator_Type, Locator_value, Test_Data);
}
@When("enter contact person in {string} with {string} and {string}")
public void enter_contact_person_in_with_and(String Test_Data, String Locator_Type, String Locator_value)
{
	FunctionLibrary.typeAction(Locator_Type, Locator_value, Test_Data);
}
@When("enter phone number in {string} with {string} and {string}")
public void enter_phone_number_in_with_and(String Test_Data, String Locator_Type, String Locator_value)
{
	FunctionLibrary.typeAction(Locator_Type, Locator_value, Test_Data);
}
@When("enter email in {string} with {string} and {string}")
public void enter_email_in_with_and(String Test_Data, String Locator_Type, String Locator_value)
{
	FunctionLibrary.typeAction(Locator_Type, Locator_value, Test_Data);
}
@When("enter mobile number in {string} with {string} and {string}")
public void enter_mobile_number_in_with_and(String Test_Data, String Locator_Type, String Locator_value) 
{
	FunctionLibrary.typeAction(Locator_Type, Locator_value, Test_Data);
}
@When("enter notes  in {string} with {string} and {string}")
public void enter_notes_in_with_and(String Test_Data, String Locator_Type, String Locator_value) 
{
   FunctionLibrary.typeAction(Locator_Type, Locator_value, Test_Data);
}
@When("click addbutton with {string} and {string}")
public void click_addbutton_with_and(String Locator_Type, String Locator_value) 
{
   FunctionLibrary.clickAction(Locator_Type, Locator_value);
}
@When("wait for confirm ok with {string} and {string}")
public void wait_for_confirm_ok_with_and(String Locator_Type, String Locator_value)
{
	FunctionLibrary.waitForElement(Locator_Type, Locator_value,Duration.ofSeconds(10));
	}
@When("click confirm ok button with {string} and {string}")
public void click_confirm_ok_button_with_and(String Locator_Type, String Locator_value)
{
    FunctionLibrary.clickAction(Locator_Type, Locator_value);
}
@When("wait for alert ok button with {string} and {string}")
public void wait_for_alert_ok_button_with_and(String Locator_Type, String Locator_value)
{
	FunctionLibrary.waitForElement(Locator_Type, Locator_value,Duration.ofSeconds(10));
	}
@When("click alert ok button with {string} and {string}")
public void click_alert_ok_button_with_and(String Locator_Type, String Locator_value) 
{
	FunctionLibrary.clickAction(Locator_Type, Locator_value);
} 
@When("validate for customer table")
public void validate_for_customer_table() throws Throwable
{
   FunctionLibrary.CustomerTable();
}
@When("click logout with {string} and {string}")
public void click_logout_with_and(String Locator_Type, String Locator_value)
{
   FunctionLibrary.clickAction(Locator_Type,Locator_value);
}
@When("close browser")
public void close_browser()
{
   FunctionLibrary.closeBrowser();
}

@When("wait for Supplier link with {string} and {string}")
public void wait_for_supplier_link_with_and(String Locator_Type, String Locator_value)
{
   FunctionLibrary.waitForElement(Locator_Type, Locator_value,Duration.ofSeconds(10));
}
@When("click Supplier link with {string} and {string}")
public void click_supplier_link_with_and(String Locator_Type, String Locator_value)
{
  FunctionLibrary.clickAction(Locator_Type, Locator_value);
}
@When("wait for supplier number with {string} and {string}")
public void wait_for_supplier_number_with_and(String Locator_Type, String Locator_value)
{
	FunctionLibrary.waitForElement(Locator_Type, Locator_value,Duration.ofSeconds(10));
}
@When("capture supplier number  with {string} and {string}")
public void capture_supplier_number_with_and(String Locator_Type, String Locator_value) throws Throwable
{
  FunctionLibrary.captureSuppliers(Locator_Type, Locator_value);
}
@When("enter supplier name in {string} with {string} and {string}")
public void enter_supplier_name_in_with_and(String Test_Data, String Locator_Type, String Locator_value) 
{
  FunctionLibrary.typeAction(Locator_Type, Locator_value, Test_Data);
}
@When("validate for supplier table")
public void validate_for_supplier_table() throws Throwable 
{
   FunctionLibrary.supplierTable();
}

}
