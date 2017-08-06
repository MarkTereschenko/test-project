package com.example.tests;

public class ContactData {
	public String firstname;
	public String lastname;
	public String address;
	public String home;
	public String mobile;
	public String work;
	public String email;
	public String email2;
	public String v18;
	public String october;
	public String y1990;
	public String rob;
	public String address2;
	public String home2;

	public ContactData() {
	}
	public ContactData(String firstname, String lastname, String address, String home, String mobile, String work,
			String email, String email2, String v18, String october, String y1990, String rob, String address2,
			String home2) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.home = home;
		this.mobile = mobile;
		this.work = work;
		this.email = email;
		this.email2 = email2;
		this.v18 = v18;
		this.october = october;
		this.y1990 = y1990;
		this.rob = rob;
		this.address2 = address2;
		this.home2 = home2;
	}

	public class GroupData {
		public String name;
		public String header;
		public String footer;
		public GroupData() {
		}
		public GroupData(String groupname, String header, String footer) {
			this.name = groupname;
			this.header = header;
			this.footer = footer;
		}
}
}