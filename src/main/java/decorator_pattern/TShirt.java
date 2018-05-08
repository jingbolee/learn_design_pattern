package decorator_pattern;

/**
 * @作者: lijingbo
 * @日期: 2018-05-08 16:45
 */

public class TShirt extends DecoratorClothes {

    public TShirt(Person person) {
        super(person);
    }

    @Override
    public void show() {
        wearShirt();
        super.show();
    }

    public void wearShirt() {
        System.out.print("T恤");
    }
}
