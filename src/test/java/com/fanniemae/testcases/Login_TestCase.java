package com.fanniemae.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fanniemae.base.TestBase;


public class Login_TestCase extends TestBase {
	
	@Test(enabled=false)
	public void tc_LoginTestCase(){
		click("id_login_button");
		type("xpath_usernam_field", "sdet702@sdettraining.com");
		type("id_password_field", "Password");
		click("id_submit_button");
		Assert.assertEquals("Welcome back!", getText("xpath_welcomeback_message"));
		
	}
	
	@Test(enabled=true)
	public void tc_newAccount(){
		click("id_login_button");
		click("id_createnew_button");
		type("id_firstname_field", "James");
		type("id_lastname_field", "Bond");
		click("id_gender_option");
		type("id_email_field", "ddd@ddd.com");
		type("id_createpassword_field", "weekpassword");
		type("id_verifypassword_field", "weekpassword");
		type("id_homephone_field", "123-453-3333");
		type("id_cellphone_field", "123-343-3333");
		select("id_country_dropdown", "United States");
		type("id_instruction_field", "junk");
		click("id_submit_button");		
	}
	

}
