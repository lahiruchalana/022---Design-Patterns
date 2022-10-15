package main.factory;

public class Safari implements Browser{

    @Override
    public void getConnection() {
        System.out.println("Starts connection using Safari browser");
    }

}
