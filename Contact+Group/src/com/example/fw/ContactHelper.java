package com.example.fw;

import org.openqa.selenium.By;
import com.example.tests.ContactData;


public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	
	}

	public void initContactCreation() {
	click(By.linkText("add new"));
	}
	
		public void fillConctactForm(ContactData contact) {
	    type(By.name("firstname"), contact.firstname);
	    type(By.name("lastname"), contact.lastname);
	    type(By.name("address"), contact.address);
	    type(By.name("home"), contact.home);
	    type(By.name("mobile"), contact.mobile);
	    type(By.name("work"), contact.work);
	    type(By.name("email"), contact.email);
	    type(By.name("email2"), contact.email2);
	    type(By.name("byear"), contact.y1990);
	    type(By.name("address2"), contact.address2);
	    type(By.name("phone2"), contact.home2);
	    
	    selectByText(By.name("bday"), contact.v18);
	    selectByText(By.name("bmonth"), contact.october);
	    selectByText(By.name("new_group"), contact.rob);
	      
	   	}

		
	public void submitContactPage() {
		click(By.name("submit"));
	}
	public void returntoHomePage() {
		click(By.linkText("home"));
		
 	}

	public void gotoContactsPage() {
		click(By.linkText("contacts"));
		
	}
	public void returntoContactsPage() {
		click(By.linkText("contacts page"));
		
	}
}
