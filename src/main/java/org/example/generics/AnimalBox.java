package org.example.generics;

public class AnimalBox <T extends Animal>{
    private T animal;

    public AnimalBox(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void eatAnimal(T animal) {
        animal.eat();
    }
}
