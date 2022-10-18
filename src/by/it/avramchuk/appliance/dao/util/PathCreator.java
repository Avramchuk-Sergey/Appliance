package by.it.avramchuk.appliance.dao.util;

import java.io.File;

public class PathCreator {

    public static final String USER_DIR = "user.dir";

    public static String getPathTo(String fileName) {
        return System.getProperty(USER_DIR) + File.separator + fileName;
    }
}
