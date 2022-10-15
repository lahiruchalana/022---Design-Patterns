package main.factory;

public class Edge implements Browser{

    @Override
    public void getConnection() {
        System.out.println("Starts connection using Edge browser");
    }

}
