package coupling;

class Marvel {
	
	void phase_5() {
		
		Disney d = new Disney();
		d.stream();
		
		System.out.println("Loki-Season-2");
	}
}

class Disney{
	
	void stream() {
		
		System.out.println("Streaming on October-6");
	}
}

class MarvelStudios{ // Tight Coupling
	
	double cost;
	
	void produce_$(double pay_1,double pay_2) {
		
		this.cost = pay_1+pay_2;
		
		System.out.println(cost+" Dollar");
	}
}

public class TightCoupling {

	public static void main(String[] args) {
		
		Marvel m = new Marvel();
		m.phase_5();
		
		MarvelStudios s = new MarvelStudios();
		s.produce_$(10_00_000.1025, 50_000.2515); // Tightly coupled
		
	}
	
}
