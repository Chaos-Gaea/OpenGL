package lyp.com.text.Incetence;

/**
 * Created by lyp on 2019/3/3.
 */

public class FactoryDemo {

    public static void main(String[] args) {


        Fruit  fruit = Factory.getInstance("apple");
        fruit.eat();

//        Factory factory = new Factory();
//        Fruit fruit = factory.getInstance("apple");
//        fruit.eat();
    }

}
