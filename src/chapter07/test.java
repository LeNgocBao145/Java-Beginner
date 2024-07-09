package chapter07;

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}
}

class test extends Dog {
	public static void main(String args[]) {
		Animal a = new test();
		a.eat();
	}
}
