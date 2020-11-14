package love.mmjj.bridge;

/**
 * @author YuJian
 * @since 2020/10/9
 * 桥接模式，将抽象部分与它的实现部分分离，使它们都可以独立地变化
 */
public class Main {
    public static void main(String[] args) {
        AbstractPhone huawei = new Huawei();
        huawei.setSoftware(new Game());
        huawei.run();

        AbstractPhone lenovo = new Lenovo();
        lenovo.setSoftware(new Address());
        lenovo.run();
    }
}
