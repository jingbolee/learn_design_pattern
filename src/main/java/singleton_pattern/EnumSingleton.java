package singleton_pattern;

/**
 * 通过枚举实现单例
 */
public enum EnumSingleton {
    INSTANCE;

    private StudentManager manager;

    private EnumSingleton() {
        manager = new StudentManager();
    }

    public StudentManager getManager() {
        return manager;
    }
}
