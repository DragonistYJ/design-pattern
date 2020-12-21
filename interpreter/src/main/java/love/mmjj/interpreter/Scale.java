package love.mmjj.interpreter;

/**
 * @author YuJian
 * @since 2020/12/21
 */
public class Scale extends Expression {
    @Override
    public void execute(String key, Double value) {
        if (value == 1) {
            System.out.println("低音");
        } else if (value == 2) {
            System.out.println("中音");
        } else if (value == 3) {
            System.out.println("高音");
        }
    }
}
