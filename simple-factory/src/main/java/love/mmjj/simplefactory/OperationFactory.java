package love.mmjj.simplefactory;

import java.util.Optional;

/**
 * @author YuJian
 * @since 2020/8/24 16:04
 */
public class OperationFactory {
    public static Optional<AbstractOperation> getOperation(String opCode) {
        Optional<AbstractOperation> operation;
        switch (opCode) {
            case "+":
                operation = Optional.of(new OperationAdd());
                break;
            case "-":
                operation = Optional.of(new OperationSub());
                break;
            default:
                throw new IllegalArgumentException("operation code not illegal");
        }
        return operation;
    }
}
