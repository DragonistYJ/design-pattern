package love.mmjj.interpreter;

/**
 * @author YuJian
 * @since 2020/12/21
 */
public class Note extends Expression {
    @Override
    public void execute(String key, Double value) {
        switch (key) {
            case "C":
                System.out.println("1 ");
                return;
            case "D":
                System.out.println("2 ");
                return;
            case "E":
                System.out.println("3 ");
                return;
            case "F":
                System.out.println("4 ");
                return;
            case "G":
                System.out.println("5 ");
                return;
            case "A":
                System.out.println("6 ");
                return;
            case "B":
                System.out.println("7 ");
                return;
            default:
        }
    }
}
