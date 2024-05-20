package com.example.Tasks;

public class Animal {

	void makeSound() {
		System.out.println("animal sounds");
	}

}

class Dog extends Animal {
	void makeSound() {
		System.out.println("bow bow");
	}

}

class Cat extends Animal {
	void makeSound() {
		System.out.println("meow");

	}
}

class Cow extends Animal {
	void makeSound() {
		System.out.println("ambaaa");
	}

}

class Sound {
	public static void main(String[] args) {
		Animal[] animals = { new Cat(), new Dog(), new Cow() };
		for (Animal animal : animals) {
			animal.makeSound();
		}
//		
//		Dog d=new Dog();
//		Cow c=new Cow();
//		Cat c1=new Cat();
//		d.makeSound();
//		c.makeSound();
//		c1.makeSound();
	}
}