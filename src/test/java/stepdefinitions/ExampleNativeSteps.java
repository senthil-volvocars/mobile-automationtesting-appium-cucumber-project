package stepdefinitions;



import com.driverfactory.DriverFactory;
import com.pages.AddReservationFormPage;
import com.pages.HomePage;
import com.pages.ReservationsListPage;
import com.pages.TabsListPage;
import com.pages.ViewReservationsPage;
import java.time.Duration;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ExampleNativeSteps {


	private HomePage homePageActions = new HomePage();
	private TabsListPage tabsListPageActions = new TabsListPage();
	private ReservationsListPage reservationsListPageActions = new ReservationsListPage();
	private AddReservationFormPage addReservationFormPage=new AddReservationFormPage();
	private ViewReservationsPage viewReservationsPage=new ViewReservationsPage();
	
	@Given("home page is lanuched")
	public void home_page_is_lanuched() throws Throwable {
		homePageActions.checkIfGetStartedButtonIsVisible();
		DriverFactory.waitForPageToLoad();

	}


	@When("^user clicks on get started button$")
	public void user_clicks_on_get_started_button() throws Throwable {
		homePageActions.clickGetStartedButton();
		DriverFactory.waitForPageToLoad();  
	}

	@Then("^user navigates to tabs list page$")
	public void user_navigates_to_tabs_list_page() throws Throwable {
		tabsListPageActions.clickReservationsTab();
		DriverFactory.waitForPageToLoad();  
	}

	@Then("^user clicks on reservation plus icon$")
	public void user_clicks_on_reservation_plus_icon() throws Throwable {
		reservationsListPageActions.clickPlusIcon();
		DriverFactory.waitForPageToLoad();  
	}

	@And("^enter the name and current time$")
	public void enter_the_name_and_current_time() throws Throwable {

		addReservationFormPage.enterNameField();
		DriverFactory.waitForPageToLoad(); 
	}

	@Then("^enter the randon phone number$")
	public void enter_the_randon_phone_number() throws Throwable {
		addReservationFormPage.enterRandomPhoneNumber();
	}

	 @Then("^user click on the current date$")
	    public void user_click_on_the_current_date() throws Throwable {
		 addReservationFormPage.pickDate();
	  }

	    @And("^user click on the time$")
	    public void user_click_on_the_time() throws Throwable {
	    	addReservationFormPage.pickTime();
	    }

	    @Then("^user adds guest$")
	    public void user_adds_guest() throws Throwable {
	    	addReservationFormPage.addGuest();
	        
	    }
	    
	    @Then("^user clicks on section dropdown and select the third option$")
	    public void user_clicks_on_section_dropdown_and_select_the_third_option() throws Throwable {
	        addReservationFormPage.selectSectionDropdown();
	    }
	    
	    @And("^user clicks on table dropdown and selects last option$")
	    public void user_clicks_on_table_dropdown_and_selects_last_option() throws Throwable {
	       addReservationFormPage.selectTableDropdown();
	    }

	 
	    @Then("^user selects the origin dropdown and selects online option$")
	    public void user_selects_the_origin_dropdown_and_selects_online_option() throws Throwable {
	       addReservationFormPage.selectOriginDropdown();
	    }

	  

	    @And("^user clicks on done button$")
	    public void user_clicks_on_done_button() throws Throwable {
	    	addReservationFormPage.clickDoneBtn();
	       
	    }
	    
	    @Then("^click on the old request and click back button$")
	    public void click_on_the_old_request_and_click_back_button() throws Throwable {
	       viewReservationsPage.clickReservationItem();
	    }
	    
	    @And("^click on Image back button$")
	    public void click_on_image_back_button() throws Throwable {
	        viewReservationsPage.dataFormBackBtn();
	    }

	    @Then("^click on the menu button$")
	    public void click_on_the_menu_button() throws Throwable {
	        viewReservationsPage.menuIcon();
	    }

	    @And("^click on code samples$")
	    public void click_on_code_samples() throws Throwable {
	       viewReservationsPage.sampleCode();
	    }
	    
	   @Then("^launch app again$")
	    public void launch_app_again() throws Throwable {
	    	DriverFactory.relaunchActivity();
	    }
	    
	   
}
