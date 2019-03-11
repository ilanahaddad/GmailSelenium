package com.ilana.arielle;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GmailSteps {
    // Variables
    private WebDriver driver;
    private final String PATH_TO_CHROME_DRIVER = "/Users/ilanahaddad/Downloads/chromedriver";
    private final String GMAIL_URL = "https://mail.google.com/mail/u/0/#inbox";


    private String login_email = "ilana.haddad97@gmail.com";
    private String passwordFile = "/Users/ilanahaddad/Desktop/password.txt";

    public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }



    @Given("^User is on the gmail main page$")
    public void user_is_on_the_gmail_main_page() throws InterruptedException {
        //setupSeleniumWebDrivers();

        System.out.println("Opening gmail.com...");
        goTo(GMAIL_URL);
        waitForPageLoaded();
       // Thread.sleep(1000);
       // driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);

        System.out.println("Done!");
    }
    @Given("^User logs into a valid gmail account$")
    public void user_logs_into_a_valid_gmail_account() throws InterruptedException, IOException {
        // Entering Email:
        System.out.println("Entering Email into input...");
        driver.findElement(By.cssSelector("#identifierId")).sendKeys(login_email);
        System.out.println("Done!");

        System.out.println("Clicking Next button...");
        driver.findElement(By.cssSelector("#identifierNext > content > span")).click();
        System.out.println("Done!");
        waitForPageLoaded();

      //  System.out.println("Wait 5 seconds ...");

     //   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    //    Thread.sleep(5000);

        BufferedReader br = new BufferedReader(new FileReader(passwordFile));
        String password = br.readLine();

        System.out.println("Entering password...");
        driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).
                sendKeys(password);
        System.out.println("Done!");

       // System.out.println("Wait 1 second ...");
      //  driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        //Thread.sleep(1000);

        System.out.println("Clicking Next button...");
        driver.findElement(By.cssSelector("#passwordNext > content > span")).click();
        System.out.println("Done!");
        waitForPageLoaded();

       // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        Thread.sleep(5000);
    }

    @Given("^User is ready to send a new email$")
    public void user_is_ready_to_send_a_new_email() throws InterruptedException {
       // Thread.sleep(3000);
        System.out.println("Clicking Compose button...");
        goTo("https://mail.google.com/mail/u/0/#inbox?compose=new");
        System.out.println("Done!");
        waitForPageLoaded();
    }

    @Given("^User enters \"(.*?)\" in the recipient field$")
    public void user_enters_in_the_recipient_field(String recipient) throws InterruptedException {
       // Thread.sleep(3000);
        System.out.println("Entering a recipient...");
        driver.findElement(By.cssSelector("#\\3a q3")).sendKeys(recipient);
        System.out.println("Done!");
        waitForPageLoaded();
    }

    @Given("^User enters \"(.*?)\" in the subject field$")
    public void user_enters_in_the_subject_field(String subjectLine) {
        System.out.println("Entering a subject line...");
        driver.findElement(By.cssSelector("#\\3a pl")).sendKeys(subjectLine);
        System.out.println("Done!");
        waitForPageLoaded();
    }

    @Given("^User selects \"(.*?)\" from their files$")
    public void user_selects_from_their_files(String image) throws InterruptedException, AWTException {
        System.out.println("Clicking the paperclip icon...");
        driver.findElement(By.cssSelector("#\\3a r3")).click();//paperclip
        System.out.println("Done!");

        waitForPageLoaded();
      //  Thread.sleep(1000);

        System.out.println("Selecting the image using Robot class...");

        File file = new File(image);
        StringSelection stringSelection = new StringSelection(file.getAbsolutePath());

        //Copy to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();
        Thread.sleep(2000);
        // Cmd + Tab is needed since it launches a Java app and the browser looses focus
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(500);
        //Open Goto window
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);
        //Paste the clipboard value
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);
        //Press Enter key to close the Goto window and Upload window
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        System.out.println("Done!");
        System.out.println("Wait 3 seconds for image to upload...");
        waitForPageLoaded();
       // Thread.sleep(5000);
    }

    @Given("^User sends the email$")
    public void user_sends_the_email() throws InterruptedException {
     //   Thread.sleep(2000);
        System.out.println("Clicking the Send button...");
        driver.findElement(By.cssSelector("#\\3a pb")).click();
        System.out.println("Done!");
     //   waitForPageLoaded();
    }


    @Then("^a pop up message should appear saying Message Sent$")
    public void a_pop_up_message_should_appear_saying_Message_Sent() throws InterruptedException {
     //   Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > div:nth-child(20) > div.nH > div > div.nH.w-asV.aiw > div:nth-child(6) > " +
                "div.no > div > div:nth-child(3) > div > div > div.vh > span > span.bAq"));
        waitForPageLoaded();
    }

    @Before
    public void beforeScenario(){
        System.setProperty("webdriver.chrome.driver", "/Users/noamsuissa/Downloads/chromedriver");
        driver = new ChromeDriver();
        System.out.println("Driver set up");
    }

    @After
    public void afterScenario(){
        driver.quit();
    }

    private void setupSeleniumWebDrivers() {
        try {
            if (driver == null) {
                System.out.println("Setting up ChromeDriver... ");
                System.setProperty("webdriver.chrome.driver", PATH_TO_CHROME_DRIVER);
                driver = new ChromeDriver();
                System.out.print("Done!\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void goTo(String url) {
        if (driver != null) {
            System.out.println("Going to " + url);
            driver.get(url);
        }
    }

}
