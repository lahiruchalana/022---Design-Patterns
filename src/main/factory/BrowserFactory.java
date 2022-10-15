package main.factory;

public class BrowserFactory {

    private Browser browser;

    public Browser getBrowser(String browserType) {
        if (browserType.equals("Chrome")) {
            browser = new Chrome();
        } else if (browserType.equals("Edge")) {
            browser = new Edge();
        } else if (browserType.equals("Safari")) {
            browser = new Safari();
        }

        return browser;
    }
}
