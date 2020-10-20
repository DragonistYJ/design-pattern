package love.mmjj.factorymethod;

/**
 * @author YuJian
 * @date 2020/8/27
 * @description
 */
public class Cat implements Animal {
    @Override
    public void run() {
        System.out.println("cat run");
    }

    @Override
    public void eat() {
        System.out.println("cat eat");
    }
}
