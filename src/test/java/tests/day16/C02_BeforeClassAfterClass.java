package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {
    // @BeforeClass ve @AfterClass notasyonlarını TestNG de kullanırken JUnit'teki gibi static
    // yapmaya gerek yoktur
    @Test
    public void testAmazon() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void testTestBuy() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void testTechproeducation() {
        driver.get("https://www.techproeducation.com");
    }
}
