package love.mmjj.decorator;

/**
 * @author YuJian
 * @date 2020/8/26
 * @description
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Yu Jian");
        person.setFinery(new TShirts().decorate(new Nike()));
        person.show();
    }
}
