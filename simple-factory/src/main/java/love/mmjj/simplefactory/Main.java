package love.mmjj.simplefactory;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @author YuJian
 * @since 2020/8/24 16:17
 */
public class Main {
    public static void main(String[] args) {
        Optional<AbstractOperation> operation = OperationFactory.getOperation("+");
        operation.ifPresent(op -> {
            op.setNumberA(BigDecimal.valueOf(10));
            op.setNumberB(BigDecimal.valueOf(20.8));
            System.out.println(op.getResult());
        });
    }
}
