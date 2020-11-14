package love.mmjj.strategy;

/**
 * @author YuJian
 * @since 2020/8/24 16:33
 */
public interface Cash {
    /**
     * 收款
     *
     * @param cash 收款值
     * @return 最终应付款
     */
    double acceptCash(double cash);
}
