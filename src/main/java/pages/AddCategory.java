package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategory {
	WebDriver driver;
	String category = "my TestNg";

	public AddCategory(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[1]")
	WebElement ADD_CATEGORY_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
	WebElement SUBMIT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'The category you want to add already exists')]")
	WebElement REPEATED_CATEGORY;

	public void userShouldBeAbleToAddCategory() {
		ADD_CATEGORY_NAME_ELEMENT.sendKeys(category);
		SUBMIT_ELEMENT.click();
	}

	public void checkingRepeatedCategory() {
		REPEATED_CATEGORY.isDisplayed();

		if (driver.getPageSource().contains(category))

		{
			System.out.println("The category you want to add already exists:" + category);
		} else
			System.out.println("THE CATEGORY does not exists" + category);
	}
}
