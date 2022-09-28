package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {

    // Testlerimizi çalıştırırken istediğimiz sıraya göre çalışmasını istersek
    //priority methodunu kullanırız

    //priority kullanmazsak default olarak 0'dir.

    @Test(priority = 1)
    public void YoutubeTest() {
        driver.get("https://www.youtube.com");
    }

    @Test // burdan priority i silersek burayi 0 kabul ederek ilk burayi acar(1 olmamasina ragmn)
    public void testBuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test(priority = 2)
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }

    @Test(priority = -1)
    public void hepsiburadaTest() {
        driver.get("https://www.hepsiburada.com");
    }
}
