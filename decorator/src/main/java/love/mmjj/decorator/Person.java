package love.mmjj.decorator;

/**
 * @author YuJian
 * @date 2020/8/26
 * @description
 */
public class Person {
    private String name;
    private Finery finery;

    public Person() {
    }

    public void setFinery(Finery finery) {
        this.finery = finery;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("decorated " + name);
        this.finery.show();
    }
}
