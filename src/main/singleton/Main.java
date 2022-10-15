package main.singleton;

import com.sun.security.auth.login.ConfigFile;
import main.singleton.Configuration;
import main.singleton.EagerSingleton;
import main.singleton.LazySingleton;

public class Main {

    public static void main(String[] args) {
        EagerSingleton eagerSingletonInstance = EagerSingleton.getSingleton();
        System.out.println("Eager Singleton : " + eagerSingletonInstance);

        LazySingleton lazySingletonInstance = LazySingleton.getInstance();
        System.out.println("Lazy Singleton : " + lazySingletonInstance);

        Configuration configuration = Configuration.getInstance();
        System.out.println("Configuration : " + configuration);

        Configuration.setConfigId(2314);
        Configuration.setEnvironmentId(2435);
        Configuration.setUserName("environment_234kGfd");
        Configuration.setPassword("scsafvecc");

        System.out.println(Configuration.getConfigId());
        System.out.println(Configuration.getEnvironmentId());
        System.out.println(Configuration.getUserName());
        System.out.println(Configuration.getPassword());
    }
}
