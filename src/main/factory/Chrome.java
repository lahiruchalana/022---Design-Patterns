package main.factory;

public class Chrome implements Browser{

    @Override
    public void getConnection() {
        System.out.println("Starts connection using Chrome browser");
    }

}
