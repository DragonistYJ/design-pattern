package love.mmjj.factorymethod;

/**
 * @author YuJian
 * @date 2020/8/27
 * @description
 */
public class CatFactory implements AnimalFactory {
    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
