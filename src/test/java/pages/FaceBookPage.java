package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceBookPage {

    public FaceBookPage(){

        PageFactory.initElements(Driver.getDriver(),this); //oncelikle pageFactory i kullanarak driver imizin bu
                                // classta gecerli oldugunu soyluyoruz,her pageClassinda bir kere yapariz.
        //pageFactory clasindan initElements() methodunu kullanmak olmalidir.bununla driver clasimizdaki driveri tanityz
    }

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='pass']")
    public WebElement sifre;

    @FindBy(xpath = "//*[@class='_9ay7']")
    public WebElement girisYapilmadi;

    @FindBy(xpath = "//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement login;

}
