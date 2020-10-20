package love.mmjj.factorymethod;

/**
 * @author YuJian
 * @date 2020/8/27
 * @description
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new DogFactory();
        Animal animal = animalFactory.getAnimal();
        animal.eat();
        animal.run();
    }
}
