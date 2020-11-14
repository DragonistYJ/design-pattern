package love.mmjj.singleton;

/**
 * @author YuJian
 * @since 2020/10/9
 * 恶汉式，静态初始化
 */
public class Dog {
    private static final Dog DOG = new Dog();

    private Dog() {
    }

    public static Dog getInstance() {
        return DOG;
    }

    public void run() {
        System.out.println("dog run");
    }
}
