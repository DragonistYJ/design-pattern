package love.mmjj.simplefactory;

/**
 * @author YuJian
 * @since 2020/8/24 16:02
 */
public class OperationAdd extends AbstractOperation {
    @Override
    public double getResult() {
        return getNumberA().add(getNumberB()).doubleValue();
    }
}
