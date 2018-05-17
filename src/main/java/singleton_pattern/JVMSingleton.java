package singleton_pattern;

/**
 * 类初始化实现单例-饿汉式加载，类被加载的时候就初始化了
 */
public class JVMSingleton {
    // 该类被 JVM 加载的时候，静态变量 instance 就初始化了，因为 jvm 是单线程加载的，所以保证了线程安全。
    private static JVMSingleton instance = new JVMSingleton();

    // 私有化构造方法
    private JVMSingleton() {
    }

    public static JVMSingleton getInstance() {
        return instance;
    }
}
