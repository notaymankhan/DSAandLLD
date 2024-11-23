package dsalld.lld.solidprinciples.openclosed;
import java.util.*;


//open for addition but should be closed for modification
public class FosterAnimal {
//    public void fosterDog(Dog dog){
//        System.out.println("Dog fostered");
//    }
//
//    public void fosterCat(Cat cat){
//        System.out.println("Cat fostered");
//    }



//    can simply add a fish function foster fish that makes is open for addition but
//    modification becomes is still open we should make it closed for modification instead we need to have an
//    interface.Create an IAnimal interface and make any new animal class implement it and then pass the interface

    public void fosterAnimals(List<IAnimal> animalsList ){
        for(IAnimal animal: animalsList){
            System.out.println("Fostering" + animal);
        }

    }

    public void fosterAnimal(IAnimal animal){
        for(IAnimal animal1: List.of(animal)){
            System.out.println("Fostering" + animal1);
        }

    }

    public void feedAnimals(List<IAnimal> animalsList){
        for(IAnimal animal: animalsList){
            System.out.println("Feeding" + animal);
        }
    }


}
