package main.factory;

public class BrowserClient {

    public static void main(String[] args) {
        BrowserFactory browserFactory = new BrowserFactory();

        browserFactory.getBrowser("Chrome").getConnection();
    }
}
