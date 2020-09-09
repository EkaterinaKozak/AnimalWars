package animals;
public class Moose extends Animal{
	
	public Moose(String name) {
		setName(name);
		setEnergy(10 + (int) (Math.random() *10));
		setHit(4 + (int) (Math.random() *2));
	}

}
