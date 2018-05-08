package decorator_pattern;

/**
 * @作者: lijingbo
 * @日期: 2018-05-08 16:40
 */

public abstract class Person {

    private String name;

    public Person() {
    }


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void show();
}
