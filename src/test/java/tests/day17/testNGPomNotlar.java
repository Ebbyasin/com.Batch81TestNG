package tests.day17;

public class testNGPomNotlar {
    /*
    variable yi static yapmak bazen riskli olabiliyor.kod calistigi donem icerisinde variable kim deger atadiysa
     o deger kalir.finally yapabiliriz diye dusunsek olur ama bu sefer misal ogrenci sayisini hic mi degistirmeyecez
      kardesim.gokteki ay gibi.methodlar icin static kullanmak cok mantikli ,heryerden rahatlikla ulasabiliyorsun.

      POM  cok populer bir framework design pattern dir.
      test suitlerimizde cok fazla testimiz oldugunda test caseleri ve kodlari korumak daha karmasik hale gelir.
      Bu nedenle
      surdurulebilirlik(maintainable),yeniden kullanilabilir(reusable),daha hizli(faster),
     anlasilabilir(understandable) daha iyi bir framework dizaynina ihtiyacimiz vardir.
     page object model ile, sayfaya ozgu elementleri veya methodlari page class icinde tutar,ve bunlari gercek test
     classlarindan uzak tutariz.

     POM framework design nda temelde 3 package icerir.utilities,tests,pages...

     utilities :

     Tests :sadece testleri execute etmek icin gerekli adimlari yazacagimiz class'lari icerir. Hicbir data girisi yap
     mayacagiz

     pages: Test yapacagimiz sayfalardaki Web Elementlerini locate etmek ve temel methodlari olusturmak icin kullanilir.

     obje olusturmak,inheritance(extends),static keyword 3 yol var
     POM de driver i kullanmak icin static methodlar kullanacagiz.su anki haliyle TestBase Class imizla ayni olacak ama
     inheritance kullanmak yerine static methodlar kullanacagiz.Driver class ini daha sonra tum browserlar ile calisacak
     hale getirecegiz
     */

    /*
    driver bizim elimiz ayagimiz.
    java her new gordugu yerde yeni bir obje olusturur..

    // pagefactory'nin mantığı: pages sayfasında yer alan pagefactory ile
// buradaki webelementleri driver ile ilişkilendirmiş oluyoruz.
     */

    /*
    Testlerimizi calistirdigimizda her seferinde yeni driver olusturdugu icin her test methddu
    icin yeni bir pencere(driver) aciyor.Eger driver'a bir deger atanmamissa yani driver==null ise
    bir kere driver'i calistirir diyerek bir kere if icini calistiracak. ve driver artik bir kere calistigi icin ve
    deger atandigi icin null olmayacak ve direk return edecek ve diger testlerimiz ayni pencere(driver) uzerinde
    calisacak
     */
    /*
    Testlerimizi çalıştırdığımızda her seferinde yeni driver oluşturduğu için her test methodu için yeni bir pencere(driver)
    açıyor. Eğer driver'e bir değer atanmamışsa yani driver==null; ise bir kere driver'i çalıştırır diyerek bir kere if()
    içini çalıştıracak.
     */
    //POM'DE Driver icin TestBase class'ina extends etmek yerine Driver class'indan static methodlar kullanarak
    //driver olusturup,ilgili ayarlarin yapilmasi ve en sonda driver'in kapatilmasi tercih edilmistir.
    //testBase bizi bir kaliba sokar,derki her classtan once acarim sonra kapatirim..ben boyle istemiyorum,istedigim
    // zaman acayim istersem kapatayim.bunu driver bize saglar.test base bizi her seferinde setup ve tearDown
    // olusturmak tan kurtardi ama bizi kaliba soktu.

}
