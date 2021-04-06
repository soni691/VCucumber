package com.BB.StepDefinition.AdminHQ;

import com.BB.PageObject.adminHQ.AdminHQ;
import com.BlueBird.Cucumber.TestContext;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminHQStepDefinition {
	private AdminHQ adminhqpage;
	
	public AdminHQStepDefinition(TestContext testContext) {
		adminhqpage = testContext.getadminHQPage();
	}
	
//	@When("^I click on AdminHQ option$")
//	public void i_click_on_AdminHQ_option() throws Throwable {
//	   adminhqpage.clickonAdminHQ();
//	}

	@And("^I click on AdminHQ button$") 
	public void clickonAdminHQ() throws InterruptedException
	{	
		adminhqpage.clickonAdminHQ();
	}
	
	@Then("^I verify HubManager option$")
	public void i_verify_HubManager_option() throws Throwable {
	    adminhqpage.validateHubManager();
	}

	@And("^I click on Global Settings option$")
	public void i_click_on_Global_Settings_option() throws Throwable {
	    adminhqpage.clickongSetting();
	}

	@Then("^I verify Global Settings option$")
	public void i_verify_Global_Settings_option() throws Throwable {
	    adminhqpage.validateGlobalSetting();
	}

	@And("^I click on Email Template option$")
	public void i_click_on_Email_Template_option() throws Throwable {
	   adminhqpage.clickonETemplate();
	}

	@Then("^I verify Email Template option$")
	public void i_verify_Email_Template_option() throws Throwable {
	    adminhqpage.validateEmailTemplate();
	}

	@And("^I click on Maintenace option$")
	public void i_click_on_Maintenace_option() throws Throwable {
	   adminhqpage.clickonMaintenance();
	}

	@Then("^I verify Maintenace option$")
	public void i_verify_Maintenace_option() throws Throwable {
	   adminhqpage.validateMaintenance();
	}

}
