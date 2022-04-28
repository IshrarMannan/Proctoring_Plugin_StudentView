package proctoring.testcases;

import java.awt.AWTException;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import proctoring.base.TestBase;
import proctoring.pages.LoginPage;


public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;

	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
		public void setUp(){

		loginPage = new LoginPage();	
	}

	
	@Test(priority=1)
	public void loginTest() throws InterruptedException{
		loginPage.login(prop.getProperty("uname"), prop.getProperty("password"));
	}
	
	@Test(priority=2)
	public void course() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnCourse();
	}
	
	@Test(priority=3)
	public void quiz() throws InterruptedException, AWTException{
		Thread.sleep(2000);
		loginPage.clickOnQuiz();
	}
	
	@Test(priority=4)
	public void attempt() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnAttempt();
	}
	
	@Test(priority=5)
	public void validation() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnValidation();
	}
	
	@Test(priority=6)
	public void start() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnStart();
	}
	
	@Test(priority=7)
	public void quiz1() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnQuiz1();
	}
	
	@Test(priority=8)
	public void quiz2() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnQuiz2();
	}
	
	@Test(priority=9)
	public void finish() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnFinish();
	}
	
	@Test(priority=10)
	public void submit1() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnSubmit1();
	}
	
	@Test(priority=11)
	public void submit2() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnSubmit2();
	}
	@Test(priority=12)
	public void review() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.clickOnFReview();
	}
}
