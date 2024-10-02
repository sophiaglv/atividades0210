package atividadeRobo;

public class Principal {

	public static void main(String[] args) {
		Macarena jh = new Macarena("João Hélio","Macarena", 2, 3);
		Macarena ot = new Macarena("Otávio","Macarena", 2, 3);
		Macarena ph = new Macarena("Paulo","Macarena", 2, 3);
		Macarena gn = new Macarena("Naves","Macarena", 2, 3);
		Macarena gv = new Macarena("Vieira","Macarena", 2, 3);
		
		Backyardigans jh2 = new Backyardigans("Austin", "Backyardigans", "1min");
		Backyardigans ot2 = new Backyardigans("Pablo", "Backyardigans", "1min");
		Backyardigans ph2 = new Backyardigans("Tasha", "Backyardigans", "1min");
		Backyardigans gn2 = new Backyardigans("Uniqua", "Backyardigans", "1min");
		Backyardigans gv2 = new Backyardigans("Tayrone", "Backyardigans", "1min");

		System.out.println(jh.getNome());
		System.out.println(jh.getMusica());
		System.out.println(jh.getComplexidade());
		System.out.println(jh.getVelocidade());

		System.out.println();

		System.out.println(ot.getNome());
		System.out.println(ot.getMusica());
		System.out.println(ot.getComplexidade());
		System.out.println(ot.getVelocidade());
		
		System.out.println();
		
		System.out.println(ph.getNome());
		System.out.println(ph.getMusica());
		System.out.println(ph.getComplexidade());
		System.out.println(ph.getVelocidade());
		
		System.out.println();
		
		System.out.println(gn.getNome());
		System.out.println(gn.getMusica());
		System.out.println(gn.getComplexidade());
		System.out.println(gn.getVelocidade());
		
		System.out.println();
		
		System.out.println(gv.getNome());
		System.out.println(gv.getMusica());
		System.out.println(gv.getComplexidade());
		System.out.println(gv.getVelocidade());
		
		System.out.println("-------------------------");
	
		System.out.println(ot2.getNome());
		System.out.println(ot2.getMusica());
		System.out.println(ot2.getDuracao());
		
		System.out.println();
		
		System.out.println(gv2.getNome());
		System.out.println(gv2.getMusica());
		System.out.println(gv2.getDuracao());
		
		System.out.println();
		
		System.out.println(gn2.getNome());
		System.out.println(gn2.getMusica());
		System.out.println(gn2.getDuracao());
		
		System.out.println();
		
		System.out.println(ph2.getNome());
		System.out.println(ph2.getMusica());
		System.out.println(ph2.getDuracao());
		
		System.out.println();
		
		System.out.println(jh2.getNome());
		System.out.println(jh2.getMusica());
		System.out.println(jh2.getDuracao());
	}

}
