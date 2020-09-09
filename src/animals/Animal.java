package animals;

public abstract class Animal {
	
	private String name;
	private int energy;
	private int hit;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	public void spar(Animal animal) {
		animal.setEnergy(animal.getEnergy() - this.getHit());
		this.energy--;
		System.out.println("Бьёт " + this.getName());
		System.out.println("У " + animal.getName() + " осталось " + animal.getEnergy() + " единиц энергии");
	}
}
