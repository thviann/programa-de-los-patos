package patos;

public class Decoy extends Duck{

	public Decoy() {
		MuteQuack qb = new MuteQuack();
		FlyNoWay fb = new FlyNoWay();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Decoy Duck");
	}

	
}

