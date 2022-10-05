package tests.practice08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuTestPage;
import utilities.Driver;

import java.util.List;

public class P01 {
    //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
    //Click all the buttons and verify they are all clicked

    HerokuTestPage herokuTestPage;
    Actions actions=new Actions(Driver.getDriver());


    @Test
    public void test01() throws InterruptedException {
        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        //Click all the buttons and verify they are all clicked
        herokuTestPage=new HerokuTestPage();
        // kodlarimizi yazarken clean code kapsaminda daha sade kod yazabilmek amaci ile her test methodu
        // icerisinde ayri bir object create etmektense bu objecti class seviyesinde instance olarak create edip
        //test methodlarinda buna deger atamak ve kullanmak daha uygun bir yontemdir.

        herokuTestPage.onblur.click();
        herokuTestPage.onclick.click();
        herokuTestPage.onclick.click();
        actions.contextClick(herokuTestPage.contextmenu).
                doubleClick(herokuTestPage.doubleClick).
                click(herokuTestPage.onfocus).
                click(herokuTestPage.keydown)
                .sendKeys(Keys.ENTER).
                click(herokuTestPage.keyup).
                sendKeys(Keys.ENTER).
                click(herokuTestPage.keypress).
                sendKeys(Keys.ENTER).
                moveToElement(herokuTestPage.mouseOver).
                moveToElement(herokuTestPage.mouseLeave).
                moveToElement(herokuTestPage.mouseOver).
                click(herokuTestPage.mouseDown).perform();

        Thread.sleep(2000);
    }

    @Test(dependsOnMethods="test01")
    public void test02() {
        //dependsOnMethods ile yaptığımız şey burayı çalıştırmadan önce tet01 çalışsın demekti
        // diğer türlü hata alırdık
        List<WebElement> clicked=herokuTestPage.eventTriggered;
        Assert.assertEquals(clicked.size(),11);

    }
}
