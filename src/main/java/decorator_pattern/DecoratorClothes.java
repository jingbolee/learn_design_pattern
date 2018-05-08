package decorator_pattern;

/**
 * @作者: lijingbo
 * @日期: 2018-05-08 16:42
 */

public abstract class DecoratorClothes extends Person {

    private Person mPerson;

    public DecoratorClothes() {
    }

    public DecoratorClothes(Person person) {
        super(person.getName());
        mPerson = person;
    }



    @Override
    public void show() {
        mPerson.show();
    }
}
