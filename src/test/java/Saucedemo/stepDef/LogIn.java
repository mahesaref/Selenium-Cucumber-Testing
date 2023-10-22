package Saucedemo.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LogIn
{
        WebDriver driver; //
        String baseUrl="https://saucedemo.com/";
        @Given("Dashboard login saucedemo")
        public void dashboard_login_saucedemo()
        {
            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            driver.manage().window().maximize();
            driver.get(baseUrl);
        }

        @When("Input username")

        public void inputUsername()
        {
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
        }

        @And("Input password")
        public void inputPassword()
        {
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
        }


        @Then("User in on dashboard page")
        public void userInOnDashboardPage()
        {
            driver.findElement(By.id("header_container"));
        }

        @And("Click login button")
        public void click_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

        @And("Input Invalid password")
        public void inputInvalidPassword()
        {
            driver.findElement(By.id("password")).sendKeys("tdd-seleniumokk");
        }

        @Then("User get error message")
        public void userGetErrorMessage()
        {
            driver.findElement(By.className("error-button")).sendKeys("Epic sadface: Username and password do not match any user in this service");
        }

        @When("Input Invalid username")
        public void inputInvalidUsername()
        {
            driver.findElement(By.id("user-name")).sendKeys("cobadulu");
        }
}
