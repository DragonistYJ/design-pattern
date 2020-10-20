package love.mmjj.factorymethod;

/**
 * @author YuJian
 * @date 2020/8/27
 * @description
 */
public class Dog implements Animal {
    @Override
    public void run() {
        System.out.println("dog run");
    }

    @Override
    public void eat() {
        System.out.println("dog eat");
    }
}
