package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DhtmlgoodiesPage {
    public DhtmlgoodiesPage (){
        PageFactory.initElements(Driver.getDriver(),this);  // pagefactory iliskilendiriyor bizi..PageFactory
                                         // fabrikasindan init...methodunu cagiriyorum.this de Driver.getDriver()la diyo
           //oluşturduğumuz constructor ile driver komutlarını tanıtmış olduk
           //neden pagefactory objectini tercih ederiz
           //Özetle;
        //1- Tekrarlardan kurtuluruz
        //2- Daha az kod daha çok iş
        //3- Kolayca update yapabilme

    }

    // capitals--baskentler

    @FindBy(xpath = "//div[@id='box1']")
    public WebElement oslo; // burda driver yok bu isi Driver.getDriver() yapiyor,bunu da yukarda this sagliyor

    @FindBy(xpath = "//div[@id='box2']")
    public WebElement stockholm;

    @FindBy(xpath = "//div[@id='box3']")
    public WebElement washington;

    @FindBy(xpath = "//div[@id='box4']")
    public WebElement copenhagen;

    @FindBy(xpath = "//div[@id='box5']")
    public WebElement seoul;

    @FindBy(xpath = "//div[@id='box6']")
    public WebElement rome;

    @FindBy(xpath = "//div[@id='box7']")
    public WebElement madrid;

    // countries -- ulkeler

    @FindBy(xpath = "//div[@id='box106']")
    public WebElement italy;

    @FindBy(xpath = "//div[@id='box107']")
    public WebElement spain;

    @FindBy(xpath = "//div[@id='box101']")
    public WebElement norway;

    @FindBy(xpath = "//div[@id='box104']")
    public WebElement denmark;

    @FindBy(xpath = "//div[@id='box105']")
    public WebElement southKorea;

    @FindBy(xpath = "//div[@id='box102']")
    public WebElement sweden;

    @FindBy(xpath = "//div[@id='box103']")
    public WebElement unitedStates;

   // Public olarak tanımlanan öğeye kod bloğunun içinden ve dışından erişebilir, yani her yerden
    // ulaşılabilir denilebilir. Statik tanımlaması yapıldığında ise bu sınıfa herhangi bir nesne
    // oluşturmadan, sadece adıyla çağırıp erişim sağlanabilir.

    /*
         PageFactory bizlere nesne deposu oluşturmaya imkan veren, sürdürülebilir,
     yeniden kullanılabilir ve elementleri tek bir yerden yönetmeyi sağlayan bir Page object model konseptidir.
     Page Factory’i kullanımına bakacak olursak PageFactory model, Web elementlerini
     @FindBy annotionu ile algılar. How kalıbı ile birlikte elementlerin ayırt edici
     locator’ından hangisini kullanacaksak belirtilir. Sonrasında ise o ayırt edici
     locator’ın adı tanımlanır. Public WebElement ile birlikte test senaryolarında
     kullanmak üzere isimlendirmesi yaparız. Burada isimlendirme daha sonra baktığında
     anlayabilmek için önemlidir, okunaklı olmalıdır.
     */


}
