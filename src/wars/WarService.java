package wars;
import animals.Animal;

public class WarService {
	
	public Animal battle (Animal redWrestler, Animal blueWrestler) {
		System.out.println("� ������� ���� ����� " + redWrestler.getName());
		System.out.println("� ����� ���� ����� " + blueWrestler.getName());
		Animal winner = null;
		for (int i = 1; i < 12; i++) {
			
			System.out.println("����� �" + i);
			redWrestler.spar(blueWrestler);
			if(blueWrestler.getEnergy() <= 0) {
				System.out.println("������! " + blueWrestler.getName() + " �������� ��������� � " + i + " ������");
				winner = redWrestler;
				break;
			}
			blueWrestler.spar(redWrestler);
			if(redWrestler.getEnergy() <= 0) {
				System.out.println("������! " + redWrestler.getName() + " �������� ���������� " + i + " ������");
				winner = blueWrestler;
				break;
			}
			
		}
		
		return winner;
	}

}
