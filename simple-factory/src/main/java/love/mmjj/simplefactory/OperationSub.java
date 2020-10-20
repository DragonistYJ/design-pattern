package love.mmjj.simplefactory;

/**
 * @Author: YuJian
 * @Datetime: 2020/8/24 16:03
 * @Description
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA().subtract(getNumberB()).doubleValue();
    }
}
