package pages;

import utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class Parent {


    static WebDriverWait wait;

    public Parent() {
        wait = new WebDriverWait(BaseDriver.getDriver(), 15);
    }

    public void findAndSend(WebElement element, String value) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void findAndClick(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public  void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waiting(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyContainsText(WebElement element, String msg) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(msg.toLowerCase()));
    }

    public void waitNumberOfElementsToBeLessThan(By selector, int number) {
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(selector, number));
    }

    public void listSelectOption(List<WebElement> list, String option) {
        for (WebElement x : list) {
            if (x.getText().contains(option)) {
                x.click();
                break;
            }
        }
    }

    public void findAndDelete(WebElement... elements) {
        wait.until(ExpectedConditions.stalenessOf(BaseDriver.getDriver().findElement(By.xpath("//ms-delete-button//button"))));
        waitUntilVisible(BaseDriver.getDriver().findElement(By.xpath("//ms-delete-button//button")));
        waitNumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 5);
        findAndClick(elements[0]);
        findAndClick(elements[1]);

    }
    public void randomClick(List<WebElement> element) {
        Random rnd = new Random();
        int index = rnd.nextInt(element.size());
        element.get(index).click();
    }

    public  void waitUntilStalenessOf() {
        WebDriverWait wait= new WebDriverWait(BaseDriver.getDriver(),10);
       wait.until(ExpectedConditions.stalenessOf(BaseDriver.getDriver().findElement(By.xpath("//ms-edit-button//button"))));


    }

}
