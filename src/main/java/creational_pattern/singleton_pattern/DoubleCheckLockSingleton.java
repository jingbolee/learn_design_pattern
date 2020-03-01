package creational_pattern.singleton_pattern;

/**
 * 双重检查锁实现单例
 */
public class DoubleCheckLockSingleton {
    // 对象锁
    private static Object lock = new Object();

    private DoubleCheckLockSingleton() {
    }

    private static volatile DoubleCheckLockSingleton INSTANCE;

    // 加锁，做两次判断，确保线程安全
    public static DoubleCheckLockSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (lock) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
