package atividade0210;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Animal(100);
		Animal animal3 = new Animal("Laranja");
		Animal animal4 = new Animal(100, "Laranja");
		
		System.out.println(animal1.getTamanho());
		System.out.println(animal1.getCor());
		
		System.out.println(animal2.getTamanho());
		System.out.println(animal2.getCor());
		
		System.out.println(animal3.getTamanho());
		System.out.println(animal3.getCor());
		
		System.out.println(animal4.getTamanho());
		System.out.println(animal4.getCor());
	}

}
