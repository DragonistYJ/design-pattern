package love.mmjj.interpreter;

/**
 * @author YuJian
 * @since 2020/12/21
 * 给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
 */
public class InterpreterMain {
    public static void main(String[] args) {
        PlayContext playContext = new PlayContext();
        playContext.setText("O 2 E 0.5 G 0.5 A 3");
        Expression expression = null;
        while (playContext.getText().length() > 0) {
            String str = playContext.getText().substring(0, 1);
            switch (str) {
                case "O":
                    expression = new Scale();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                case "P":
                    expression = new Note();
                    break;
                default:
            }
            if (expression != null) {
                expression.interpret(playContext);
            }
        }
    }
}
