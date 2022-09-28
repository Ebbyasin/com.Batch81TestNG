package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseBeforeMethodAfterMethod;

public class DepensOnMethod extends TestBaseBeforeClassAfterClass {
    @Test
    public void test1() {
        //amazon ana sayfasin gidelim
        driver.get("https://www.Wamazon1.com");
    }

    @Test(dependsOnMethods = "test1")
    public void test2() {
        //nutella aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER);
    }

    @Test(dependsOnMethods = "test2")
    public void test3() {
        //sonuc yazisinin amazon icerdigini test edelim
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertFalse(sonuc.getText().contains("amazon"));
    }
}
