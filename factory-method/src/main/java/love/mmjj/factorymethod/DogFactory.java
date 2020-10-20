package love.mmjj.factorymethod;

/**
 * @author YuJian
 * @date 2020/8/27
 * @description
 */
public class DogFactory implements AnimalFactory {
    @Override
    public Animal getAnimal() {
        return new Dog();
    }
}
