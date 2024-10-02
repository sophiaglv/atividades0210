package atividade0210;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		Consulta consulta1 = new Consulta();
		Consulta consulta2 = new Consulta("02/10/2024", "Sophia", "André");
		
		System.out.println(consulta1.getData());
		System.out.println(consulta1.getNomePcnte());
		System.out.println(consulta1.getNomeDents());
		
		System.out.println(consulta2.getData());
		System.out.println(consulta2.getNomePcnte());
		System.out.println(consulta2.getNomeDents());
		
	}

}
