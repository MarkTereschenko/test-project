package com.example.tests;

import org.testng.annotations.Test;

public class GroupModification extends TestBase {

@Test
public void modifySomeGroup() {
app.getNavigationHelper().openMainPage();
app.getNavigationHelper().gotoGroupPage();
app.getGroupHelper().initGroupModification(1);
GroupData group = new GroupData();
group.name = "new name";
app.getGroupHelper().fillGroupForm(group);
app.getGroupHelper().submitGroupModification();
app.getGroupHelper().returnToGroupPage();

}
}