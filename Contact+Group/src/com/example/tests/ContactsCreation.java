package com.example.tests;

import org.testng.annotations.Test;

public class ContactsCreation extends TestBase {
  @Test
  public void testNonEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getNavigationHelper().gotoContactsPage();
	ContactData contact = new ContactData();
    contact.firstname = "firstname";
    contact.lastname = "lastname";
    contact.address = "address";
    contact.home = "home";
    contact.mobile = "mobile";
    contact.work = "work";
    contact.email = "email";
    contact.email2 = "email2";
    contact.v18 = "18";
    contact.october = "October";
    contact.y1990 = "1990";
    contact.rob = "Rob";
    contact.address2 = "address2";
    contact.home2 = "home2";
    //app.getContactHelper().initContactCreation();
    app.getContactHelper().fillConctactForm(contact);
    app.getContactHelper().submitContactPage();
    app.getContactHelper().returntoHomePage();
  }

  @Test
  public void testEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().gotoContactsPage();
    //app.getContactHelper().initContactCreation();
    app.getContactHelper().fillConctactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", "", ""));
    app.getContactHelper().submitContactPage();
    app.getContactHelper().returntoHomePage();
  }
}
