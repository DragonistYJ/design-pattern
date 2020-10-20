package love.mmjj.decorator;

/**
 * @author YuJian
 * @date 2020/8/26
 * @description
 */
public class Finery {
    private Finery finery;

    public Finery decorate(Finery finery) {
        this.finery = finery;
        return this;
    }

    public void show() {
        if (this.finery != null) {
            this.finery.show();
        }
    }
}
