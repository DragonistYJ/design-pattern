package love.mmjj.simplefactory;

import java.util.Optional;

/**
 * @Author: YuJian
 * @Datetime: 2020/8/24 16:04
 * @Description
 */
public class OperationFactory {
    public static Optional<Operation> getOperation(String opCode) {
        Optional<Operation> operation = Optional.empty();
        switch (opCode) {
            case "+":
                operation = Optional.of(new OperationAdd());
                break;
            case "-":
                operation = Optional.of(new OperationSub());
                break;
        }
        return operation;
    }
}
