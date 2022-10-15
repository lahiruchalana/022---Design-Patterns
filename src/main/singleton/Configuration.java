package main.singleton;

// sample singleton design pattern
public class Configuration {
    private static Integer configId;
    private static Integer environmentId;
    private static String userName;
    private static String password;

    private static Configuration instance = null;

    private Configuration() {
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }

        return instance;
    }


    public static Integer getConfigId() {
        return configId;
    }

    public static void setConfigId(Integer configId) {
        Configuration.configId = configId;
    }

    public static Integer getEnvironmentId() {
        return environmentId;
    }

    public static void setEnvironmentId(Integer environmentId) {
        Configuration.environmentId = environmentId;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        Configuration.userName = userName;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Configuration.password = password;
    }

}
