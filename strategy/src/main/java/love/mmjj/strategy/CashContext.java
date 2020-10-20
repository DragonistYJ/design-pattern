package love.mmjj.strategy;

/**
 * @Author: YuJian
 * @Datetime: 2020/8/24 16:37
 * @Description
 */
public class CashContext {
    private Cash cash;

    public CashContext(Cash cash) {
        this.cash = cash;
    }

    public double getResult(double cash) {
        return this.cash.acceptCash(cash);
    }
}
