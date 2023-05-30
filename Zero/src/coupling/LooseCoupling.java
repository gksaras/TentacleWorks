package coupling;

interface Comics{
	
	void read_comic();
}

class Sony implements Comics {

	@Override
	public void read_comic() {
		System.out.println("Spider-Man");
	}
}

class DCStudios implements Comics {

	@Override
	public void read_comic() {
		System.out.println("Bat-Man");
	}
}

final class MCU {
	
	private String produced_By;
	private String distributed_By;
	
	public MCU(String produce,String distribute ) {
		
		this.produced_By = produce;
		this.distributed_By = distribute;
	}
	
	public String getDetails() {
		
		return produced_By+ "\n"+ distributed_By ;
	}
}

public class LooseCoupling {

	public static void main(String[] args) {
		
		Sony s = new Sony();
		s.read_comic();
		
		DCStudios d = new DCStudios();
		d.read_comic();
		
		MCU m = new MCU("Marvel STUDIOS","Disney");
		System.out.println(m.getDetails());
		
	}
}
