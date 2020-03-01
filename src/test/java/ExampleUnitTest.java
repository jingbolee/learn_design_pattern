import creational_pattern.singleton_pattern.*;
import org.junit.Test;
import structural_pattern.decorator_pattern.BigTrouser;
import structural_pattern.decorator_pattern.Person;
import structural_pattern.decorator_pattern.PersonIml;
import structural_pattern.decorator_pattern.TShirt;

public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        // 装饰模式
        Person p = new PersonIml("小李");
        TShirt ts = new TShirt(p);
        BigTrouser bt = new BigTrouser(ts);
        bt.show();
        EnumSingleton.INSTANCE.getManager();
    }

    /**
     * 单例模式测试类
     */
    @Test
    public void testSingleton() {
        //初始化多个对象，查看是否相等
        // 1. 双重锁检查
        DoubleCheckLockSingleton dcl1 = DoubleCheckLockSingleton.getInstance();
        DoubleCheckLockSingleton dcl2 = DoubleCheckLockSingleton.getInstance();
        assert dcl1.equals(dcl2);

        //2. JVM 确保单例
        JVMSingleton jvmSingleton = JVMSingleton.getInstance();
        JVMSingleton jvmSingleton1 = JVMSingleton.getInstance();
        assert jvmSingleton.equals(jvmSingleton1);

        //3. 内部静态类确保单例
        InnerStaticClassSingleton innerStaticClassSingleton = InnerStaticClassSingleton.getInstance();
        InnerStaticClassSingleton innerStaticClassSingleton1 = InnerStaticClassSingleton.getInstance();
        assert innerStaticClassSingleton.equals(innerStaticClassSingleton1);

        // 4. 枚举确保单例
        StudentManager manager = EnumSingleton.INSTANCE.getManager();
        StudentManager manager1 = EnumSingleton.INSTANCE.getManager();
        assert manager.equals(manager1);

        //5. 容器确保单例
        StudentManager manager2 = (StudentManager) CollectionSingleton.getManager(CollectionSingleton.STUDENT_MANAMGER);
        StudentManager manager3 = (StudentManager) CollectionSingleton.getManager(CollectionSingleton.STUDENT_MANAMGER);
        assert manager2.equals(manager3);

    }
}
