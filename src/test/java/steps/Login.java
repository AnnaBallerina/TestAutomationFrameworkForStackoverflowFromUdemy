package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {

    private WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        this.driver.manage().deleteAllCookies();
        this.driver.quit();
        this.driver = null;
    }

    @Given("User navigates to stackoverflow website")
    public void user_navigates_to_stackoverflow_website() {
        driver.get("https://stackoverflow.com/");
    }

    @And("User clicks on the login button on homepage")
    public void user_clicks_on_the_login_button_on_homepage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
    }

    @And("User enters a valid username")
    public void user_enters_a_valid_username() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("autotestudemy@mail.com");
    }

    @And("User enters a valid password")
    public void user_enters_a_valid_password() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Password321!");
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        driver.findElement(By.id("submit-button")).click();
    }

    @Then("User should be taken to the successful login page")
    public void user_should_be_taken_to_the_successful_login_page() throws InterruptedException {
        Thread.sleep(2000);
        WebElement askQuestionButton =  driver.findElement(By.linkText("Ask Question"));
        Assert.assertTrue(askQuestionButton.isDisplayed());
    }
}
