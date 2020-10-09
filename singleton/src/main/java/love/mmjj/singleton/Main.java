package love.mmjj.singleton;

/**
 * @author YuJian
 * @description
 * @since 2020/10/9
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = Cat.getInstance();
        cat.run();

        Dog dog = Dog.getInstance();
        dog.run();
    }
}
