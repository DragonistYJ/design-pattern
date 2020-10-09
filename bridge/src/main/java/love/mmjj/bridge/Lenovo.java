package love.mmjj.bridge;

/**
 * @author YuJian
 * @description
 * @since 2020/10/9
 */
public class Lenovo extends Phone {
    @Override
    public void run() {
        System.out.println("lenovo phone");
        software.run();
    }
}
