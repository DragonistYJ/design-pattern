package love.mmjj.factorymethod;

/**
 * @author YuJian
 * @date 2020/8/27
 */
public interface AnimalFactory {
    /**
     * 生产一个动物
     *
     * @return Animal
     */
    Animal getAnimal();
}
