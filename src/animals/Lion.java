package animals;
public class Lion extends Animal{
	
	public Lion(String name) {
		setName(name);
		setEnergy(6 + (int) (Math.random() *10));
		setHit(3 + (int) (Math.random() *3));
	}


}
