package creational_pattern.singleton_pattern;

/**
 * 静态内部类实现单例-虚拟机加载该类的时候，是不会初始化的 INSTANCE ,
 * 只有调用方法 getInstance() 的时候才会加载静态内部类，然后初始化 INSTANCE
 */
public class InnerStaticClassSingleton {

    private InnerStaticClassSingleton() {

    }

    private static class Holder {
        private static InnerStaticClassSingleton INSTANCE = new InnerStaticClassSingleton();
    }

    public static InnerStaticClassSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
