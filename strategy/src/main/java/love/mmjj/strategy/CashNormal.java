package love.mmjj.strategy;

/**
 * @Author: YuJian
 * @Datetime: 2020/8/24 16:34
 * @Description
 */
public class CashNormal implements Cash {
    @Override
    public double acceptCash(double cash) {
        return cash;
    }
}
