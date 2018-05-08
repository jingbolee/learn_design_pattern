import decorator_pattern.BigTrouser;
import decorator_pattern.Person;
import decorator_pattern.PersonIml;
import decorator_pattern.TShirt;
import org.junit.Test;

public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        // 装饰模式
        Person p = new PersonIml("小李");
        TShirt ts = new TShirt(p);
        BigTrouser bt = new BigTrouser(ts);
        bt.show();
    }
}
