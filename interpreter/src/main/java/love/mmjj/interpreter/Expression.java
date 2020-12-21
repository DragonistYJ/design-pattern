package love.mmjj.interpreter;

/**
 * @author YuJian
 * @since 2020/12/21
 */
public abstract class Expression {
    public void interpret(PlayContext context) {
        if (context.getText().length() != 0) {
            String playKey = context.getText().substring(0, 1);
            context.setText(context.getText().substring(2));
            Double playValue = Double.valueOf(context.getText().substring(0, context.getText().contains(" ") ? context.getText().indexOf(" ") : context.getText().length()));
            context.setText(context.getText().substring(context.getText().contains(" ") ? context.getText().indexOf(" ") + 1 : context.getText().length()));
            execute(playKey, playValue);
        }
    }

    public abstract void execute(String key, Double value);
}
