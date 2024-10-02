package atividade0210;

public class ConstrutorCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro("ABC0C12");
		Carro carro3 = new Carro(1234567890);
		Carro carro4 = new Carro("ABC0C12", 1234567890);
		
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getNumChassi());
		
		System.out.println(carro2.getPlaca());
		System.out.println(carro2.getNumChassi());
		
		System.out.println(carro3.getPlaca());
		System.out.println(carro3.getNumChassi());
		
		System.out.println(carro4.getPlaca());
		System.out.println(carro4.getNumChassi());
	}

}
