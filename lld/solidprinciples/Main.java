package dsalld.lld.solidprinciples;
import dsalld.lld.solidprinciples.isp.notused.*;
import dsalld.lld.solidprinciples.listkov.*;
import dsalld.lld.solidprinciples.openclosed.*;
import java.util.*;

import dsalld.lld.solidprinciples.isp.used.*;




public class Main {
    public static void main(String[] args) {
//        testing trainer class without single responsibility principle tightly coupled
//        Trainer trainer = new Trainer("John", 1, 25);
//        trainer.createDietPlan();
//        trainer.createRegiment();
//        trainer.calculateReward();

//        ------------------------------------------------------------------------------------------------

//        testing trainer class with single responsibility principle loosely coupled since we are using a similar class called Trainer in both withs and without s packacges we
//        can add info as to from where we actually need to use interface but thats the next princi;le lets learn one by one


//        dsalld.lld.solidprinciples.withs.Trainer trainer = new dsalld.lld.solidprinciples.withs.Trainer("John", 1, 25);
//
//        CalculateRewards rewardsCalculator = new CalculateRewards();
//        rewardsCalculator.manageRewards(trainer);
//
//        CreateRegiment regimentCreator = new CreateRegiment();
//        regimentCreator.createRegiment(trainer);
//
//        SendDiet dietPlanCreator = new SendDiet();
//        dietPlanCreator.createDietPlan(trainer);

//   //     createRegiment.createRegiment(trainer);
//     //   SendDiet.createDietPlan(trainer);
//     //   calculateRewards.manageRewards(trainer);


//        ------------------------------------------------------------------------------------------------
//        testing foster animal class without open closed principle

//        List<IAnimal> animals = new ArrayList<IAnimal>();
//        IAnimal a = new Cat();
//        IAnimal b = new Dog();
//
//        animals.add(a);
//        animals.add(b);
//
//        FosterAnimal f = new FosterAnimal();
////        f.fosterAnimal(a);
////        f.fosterAnimal(b);
////
////        f.fosterAnimals(animals);
////        f.feedAnimals(animals);
////  now if you want to add another pet called parrot just create another class that implements IAnimal and add it to the list
//
//        IAnimal c = new Parrot();
//        animals.add(c);
//        f.fosterAnimals(animals);
//
//        f.feedAnimals(animals);

        //        ------------------------------------------------------------------------------------------------
        //testing listkov substitution principle
//
//        IDog real = new RealDog();
//        real.bark();
//        real.eat();
//
//        IDog toy = new DummyDog();
//        toy.bark();
////        toy.eat();

//        IRealDog real = new RealDog();
//        real.bark();
//        real.eat();
//
//        IToyDog toy = new DummyDog();
//        toy.bark();
////        toy.eat();

        //        ------------------------------------------------------------------------------------------------
        //testing interface segregation principle without interface segregation principle

//        Animal2 a = new Duck2();
//        Animal2 b = new Fish2();
//        a.eat();
//        a.swim();
//        b.eat();
//        b.swim();
//        a.fly();
//        a.run();
//        b.fly();
//        b.run();

//        testing interface segregation with interface seggregation principle

        Duck d = new Duck();
        Fish f = new Fish();
        d.eat();
        d.swim();
        d.walk();
        d.run();
        d.fly();
        f.eat();
        f.swim();











    }
}
