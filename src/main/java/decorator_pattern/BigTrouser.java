package decorator_pattern;

/**
 * @作者: lijingbo
 * @日期: 2018-05-08 16:49
 */

public class BigTrouser extends DecoratorClothes {

    public BigTrouser(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.print("大裤衩");
        super.show();
    }
}
