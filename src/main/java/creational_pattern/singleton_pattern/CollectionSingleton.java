package creational_pattern.singleton_pattern;

import java.util.HashMap;

/**
 * 容器实现单例。CollectionSingleton 类似 Utils 功能，全部都是静态访问的
 */
public class CollectionSingleton {

    public static final String STUDENT_MANAMGER = "student";

    private static HashMap<String, IManager> INSTANCES = new HashMap<>();

    static {
        registerManager(STUDENT_MANAMGER, new StudentManager());
    }

    private static void registerManager(String name, IManager manager) {
        INSTANCES.put(name, manager);
    }

    public static IManager getManager(String name) {
        return INSTANCES.get(name);
    }
}
