package javaDemo;

public class Animal {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		ani.cow();
		ani.horse();
		ani.goat();
		ani.cat();
		ani.elephant();
		
		System.out.println();
	}
	void cow() {
		System.out.println("The cow is a domestic animal");
	}
	void horse() {
		System.out.println("The horse runs fast");
	}
	void goat() {
		System.out.println("There is a goat farm nearby my home");
	}
	void cat() {
		System.out.println("My grandfather had a beautiful cat");
	}
	void elephant(){
		System.out.println("Elephant lives more than 100 years");
	}

}
