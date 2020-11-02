package love.mmjj.command;

import java.util.Random;

/**
 * @author YuJian
 * @description
 * @since 2020/11/2
 */
public class CommandMain {
    public static void main(String[] args) {
        Executor executor = new Executor();
        Random random = new Random();
        Herald herald = new Herald();
        for (int i = 0; i < 10; i++) {
            int anInt = random.nextInt(2);
            if (anInt == 0) {
                herald.addCommand(new CookDinnerCommand(executor));
            } else {
                herald.addCommand(new CookLunchCommand(executor));
            }
        }
        herald.send();
    }
}
