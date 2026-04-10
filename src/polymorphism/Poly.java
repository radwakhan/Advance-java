package polymorphism;

// when there are instance variable so we need to initialize using constructor
public class Poly {
	public static void main(String[] args) {
//		Animal n1 = new Animal();
//		n1.makeSound();
//		n1.makeSound("dog", "sound");
//		n1.display();

		Animal c1 = new Cat("cat1", "meow", 4);
		c1.makeSound();

	}

}

class Animal {
	String name;
	String sound;

	void makeSound() {
		System.out.println("this is animal class");
	}

//	method overloading cannot be done with return type
//	String makeSound() {
//		String ans = "this is return type";
//		return ans;
//	}

	void makeSound(String name, String sound) {
		System.out.println("this is animal class");
		String result = String.format("name=%s and sound=%s", name, sound);
		System.out.println(result);
	}

	void display() {
		String result = String.format("name=%s and sound=%s", name, sound);
		System.out.println(result);
	}

}

class Cat extends Animal {
	int legs;

	Cat(String name, String sound, int legs) {
		super.name = name;
		super.sound = sound;
		this.legs = legs;
	}

	@Override
	void makeSound() {
		System.out.println("this is cat class");
	}
}
