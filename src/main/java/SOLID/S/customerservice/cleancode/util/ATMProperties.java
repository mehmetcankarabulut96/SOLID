package SOLID.S.customerservice.cleancode.util;

import java.util.Properties;

public class ATMProperties {
    private static Properties properties;

    public static String getProperty(String name) {
        return properties.getProperty(name);
    }

    public static Properties getProperties() {
        return properties;
    }
}