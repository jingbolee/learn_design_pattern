package decorator_pattern;

/**
 * @作者: lijingbo
 * @日期: 2018-05-08 16:47
 */

public class PersonIml extends Person {


    public PersonIml(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("装扮的" + getName());
    }
}
