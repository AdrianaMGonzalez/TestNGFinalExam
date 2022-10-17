package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCategory;
import util.BrowserFactory;

public class DropdownTest {
	WebDriver driver;

	@Test
	public void testingAddCategory() {

		driver = BrowserFactory.browserInit();
		AddCategory addCategory = PageFactory.initElements(driver, AddCategory.class);
		addCategory.userShouldBeAbleToAddCategory();
		addCategory.checkingRepeatedCategory();

	}
}
