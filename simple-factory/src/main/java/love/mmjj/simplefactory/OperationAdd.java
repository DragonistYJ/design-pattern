package love.mmjj.simplefactory;

/**
 * @Author: YuJian
 * @Datetime: 2020/8/24 16:02
 * @Description
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA().add(getNumberB()).doubleValue();
    }
}
