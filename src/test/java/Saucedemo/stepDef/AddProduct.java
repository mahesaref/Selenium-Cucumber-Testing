package Saucedemo.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddProduct
{
    WebDriver driver; //
    String baseUrl="https://saucedemo.com/";
    @Given("Dashboard login saucedemo_")
    public void dashboard_login_saucedemo_()
    {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get(baseUrl);
    }

    @When("Input username_")

    public void inputUsername_()
    {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("Input password_")
    public void inputPassword_()
    {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }


    @Then("User in on dashboard page_")
    public void userInOnDashboardPage_()
    {
        driver.findElement(By.id("header_container"));
    }

    @And("Click login button_")
    public void click_login_button_() {
        driver.findElement(By.id("login-button")).click();
    }

    @And("User Click add to cart")
    public void userClickAddToCart()
    {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @And("User Click cart increment")
    public void userClickCartIncrement()
    {
        driver.findElement(By.id("shopping_cart_container")).click();
    }

    @Then("User in payment cart")
    public void userInPaymentCart()
    {
        driver.findElement(By.id("cart_contents_container"));
    }

    @And("User Click remove product")
    public void userClickRemoveProduct()
    {
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    }
}
