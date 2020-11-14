package love.mmjj.bridge;

/**
 * @author YuJian
 * @since 2020/10/9
 */
public class Lenovo extends AbstractPhone {
    @Override
    public void run() {
        System.out.println("lenovo phone");
        software.run();
    }
}
