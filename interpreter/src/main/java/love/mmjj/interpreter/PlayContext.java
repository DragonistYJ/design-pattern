package love.mmjj.interpreter;

/**
 * @author YuJian
 * @since 2020/12/21
 */
public class PlayContext {
    private String text;

    public PlayContext() {
    }

    public PlayContext(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
