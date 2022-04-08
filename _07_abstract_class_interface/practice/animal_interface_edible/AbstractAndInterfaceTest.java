package _07_abstract_class_interface.practice.animal_interface_edible;


import _07_abstract_class_interface.practice.animal_interface_edible.animal.Animal;
import _07_abstract_class_interface.practice.animal_interface_edible.animal.Chicken;
import _07_abstract_class_interface.practice.animal_interface_edible.animal.Tiger;
import _07_abstract_class_interface.practice.animal_interface_edible.edible.Edible;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals= new Animal[2];
        animals[0] = new Tiger();
        animals[1]= new Chicken();
        for (Animal animal:animals){
            System.out.println(animal.makeSound());
            if (animal instanceof  Chicken){
                Edible edible =( Chicken ) animal;
                System.out.println(edible.howToEat());
            }

        }
    }

}
