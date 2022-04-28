package proctoring.pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import proctoring.base.TestBase;

public class LoginPage extends TestBase {
	//	WebDriverWait wait = new WebDriverWait(driver,3);
	//Login
	@FindBy(className="login-btn")
	WebElement logIn;

	@FindBy(id="username")
	WebElement uname;

	@FindBy(id="password")
	WebElement password;

	@FindBy(id="loginbtn")
	WebElement loginBtn;


	@FindBy(xpath="(//span[contains(text(),\"Test_Proctoring_plugin\")])[1]")
	WebElement proctoringCourse;



	@FindBy(xpath="//span[contains(text(),'Proctored_Quiz')]")
	WebElement proctoredQuiz;


	@FindBy(xpath="//button[contains(text(),'Attempt quiz now')]")
	WebElement attemptQuiz;

	@FindBy(xpath="//span[contains(text(),'I agree with the validation process.')]")
	WebElement valButton;

	@FindBy(xpath="//button[@id='id_start_quiz']")
	WebElement startButton;

	@FindBy(xpath="//span[contains(text(),'O(b1/2')]")
	WebElement quiz1;

	@FindBy(xpath="//p[contains(text(),'Yes')]")
	WebElement quiz2;

	@FindBy(xpath="//input[@id='mod_quiz-next-nav']")
	WebElement finish;
	
	@FindBy(xpath="//button[contains(text(),'Submit all and finish')]")
	WebElement submit1;
	
	@FindBy(xpath="//input[@value='Submit all and finish']")
	WebElement submit2;
	
	@FindBy(xpath="(//a[contains(text(),'Finish review')])[1]")
	WebElement finishReview;
	//Initializing the Page Objects:
	public LoginPage(){

		PageFactory.initElements(driver, this);
	}


	public void login(String em, String pwd) throws InterruptedException{
		logIn.click();

		Thread.sleep(3000);
		uname.sendKeys(em);

		Thread.sleep(3000);
		password.sendKeys(pwd);

		loginBtn.click();
	}
	public void clickOnCourse() {
		proctoringCourse.click();
	}

	public void clickOnQuiz() throws AWTException, InterruptedException{
		proctoredQuiz.click();

		//	wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		//robot.keyPress(KeyEvent.VK_SPACE);

	}
	public void clickOnAttempt() {

		attemptQuiz.click();
	}

	public void clickOnValidation() throws InterruptedException {

		valButton.click();
	}


	public void clickOnStart() throws InterruptedException {

		startButton.click();
		
        Thread.sleep(1000);
        
        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));
           
	}

	public void clickOnQuiz1(){
		quiz1.click();
	}

	public void clickOnQuiz2() {
		quiz2.click();
	}
	
	public void clickOnFinish() {
		finish.click();
	}
	
	public void clickOnSubmit1() {
		submit1.click();
	}
	public void clickOnSubmit2() {
		submit2.click();
	}
	public void clickOnFReview() {
		finishReview.click();
	}
}
