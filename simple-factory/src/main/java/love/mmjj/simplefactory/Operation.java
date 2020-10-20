package love.mmjj.simplefactory;

import java.math.BigDecimal;

/**
 * @Author: YuJian
 * @Datetime: 2020/8/24 16:00
 * @Description
 */
public abstract class Operation {
    private BigDecimal numberA;
    private BigDecimal numberB;

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
