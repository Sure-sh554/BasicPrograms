package org.example.generics;

public class AnimalDriver {
    public static void main(String[] args) {
        AnimalBox<Cat> catAnimalBox=new AnimalBox<>(new Cat());
        Cat cat=catAnimalBox.getAnimal();
        System.out.println(cat);
    }
}
