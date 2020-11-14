package love.mmjj.simplefactory;

/**
 * @author YuJian
 * @since 2020/8/24 16:03
 */
public class OperationSub extends AbstractOperation {
    @Override
    public double getResult() {
        return getNumberA().subtract(getNumberB()).doubleValue();
    }
}
