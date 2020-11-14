package love.mmjj.simplefactory;

import java.math.BigDecimal;

/**
 * @author YuJian
 * @since 2020/8/24 16:00
 */
public abstract class AbstractOperation {
    private BigDecimal numberA;
    private BigDecimal numberB;

    /**
     * 计算结果
     *
     * @return 结果的值
     */
    public abstract double getResult();

    public BigDecimal getNumberA() {
        return numberA;
    }

    public void setNumberA(BigDecimal numberA) {
        this.numberA = numberA;
    }

    public BigDecimal getNumberB() {
        return numberB;
    }

    public void setNumberB(BigDecimal numberB) {
        this.numberB = numberB;
    }
}
