package structural_pattern.decorator_pattern;

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
        wearTrouser();
        super.show();
    }

    public void wearTrouser() {
        System.out.print("大裤衩");
    }
}
