package love.mmjj.singleton;

/**
 * @author YuJian
 * @description 恶汉式，静态初始化
 * @since 2020/10/9
 */
public class Dog {
    private static final Dog dog = new Dog();

    private Dog() {
    }

    public static Dog getInstance() {
        return dog;
    }

    public void run() {
        System.out.println("dog run");
    }
}
