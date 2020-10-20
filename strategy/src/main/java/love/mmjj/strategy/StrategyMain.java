package love.mmjj.strategy;

/**
 * @Author: YuJian
 * @Datetime: 2020/8/24 16:38
 * @Description
 */
public class StrategyMain {
    public static void main(String[] args) {
        CashContext context = new CashContext(new CashRebate(0.8));
        System.out.println(context.getResult(123));
    }
}
