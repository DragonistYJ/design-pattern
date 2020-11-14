package love.mmjj.mediator;

import java.util.Arrays;

/**
 * @author YuJian
 * @since 2020/11/14
 * 用一个中介对象来封装一系列的对象交互
 * 中介者使各对象不需要显示地相互引用，从而使其耦合松散，而且可以独立地改变他们之间的交互
 */
public class MediatorMain {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ChineseColleague chineseColleague = new ChineseColleague(mediator);
        EnglishColleague englishColleague = new EnglishColleague(mediator);
        AmericanColleague americanColleague = new AmericanColleague(mediator);
        chineseColleague.send("I am from Chinese", Arrays.asList(englishColleague, americanColleague));
    }
}
