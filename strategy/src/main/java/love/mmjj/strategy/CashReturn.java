package love.mmjj.strategy;

/**
 * @Author: YuJian
 * @Datetime: 2020/8/24 16:35
 * @Description
 */
public class CashReturn implements Cash {
    private double condition;
    private double returned;

    public CashReturn(double condition, double returned) {
        this.condition = condition;
        this.returned = returned;
    }

    @Override
    public double acceptCash(double cash) {
        return cash - Math.floor(cash / condition) * returned;
    }
}
