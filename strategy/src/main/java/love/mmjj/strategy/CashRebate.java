package love.mmjj.strategy;

/**
 * @Author: YuJian
 * @Datetime: 2020/8/24 16:35
 * @Description
 */
public class CashRebate implements Cash {
    private double rebate;

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double cash) {
        return cash * rebate;
    }
}
