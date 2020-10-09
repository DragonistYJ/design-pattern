package love.mmjj.singleton;

/**
 * @author YuJian
 * @description 双重锁定，懒汉式
 * @since 2020/10/9
 */
public class Cat {
    private static Cat cat;

    private Cat() {
    }

    public static Cat getInstance() {
        if (cat == null) {
            synchronized (Cat.class) {
                if (cat == null) {
                    cat = new Cat();
                }
            }
        }
        return cat;
    }

    public void run() {
        System.out.println("cat run");
    }
}
