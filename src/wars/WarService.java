package wars;
import animals.Animal;

public class WarService {
	
	public Animal battle (Animal redWrestler, Animal blueWrestler) {
		System.out.println("В красном углу ринга " + redWrestler.getName());
		System.out.println("В синем углу ринга " + blueWrestler.getName());
		Animal winner = null;
		for (int i = 1; i < 12; i++) {
			
			System.out.println("Раунд №" + i);
			redWrestler.spar(blueWrestler);
			if(blueWrestler.getEnergy() <= 0) {
				System.out.println("Нокаут! " + blueWrestler.getName() + " потерпел поражение в " + i + " раунде");
				winner = redWrestler;
				break;
			}
			blueWrestler.spar(redWrestler);
			if(redWrestler.getEnergy() <= 0) {
				System.out.println("Нокаут! " + redWrestler.getName() + " потерпел поражениев " + i + " раунде");
				winner = blueWrestler;
				break;
			}
			
		}
		
		return winner;
	}

}
