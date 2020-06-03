package helpers;

public class Environment {
    // COMMON CONFIG
    public final static String
            urlYandexMarket = System.getProperty("urlYandexMarket", "https://market.yandex.ru"),
            itemYandexMarket =  System.getProperty("itemYandexMarket", "Iphone"),
            urlTinkoffBank = System.getProperty("urlTinkoffBank","https://www.tinkoff.ru");

}
