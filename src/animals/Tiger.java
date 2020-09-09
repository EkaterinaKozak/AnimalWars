package animals;
public class Tiger extends Animal {
	public Tiger(String name) {
		setName(name);
		setEnergy(10 + (int) (Math.random() *10));
		setHit(2 + (int) (Math.random() *2));
	}


}
