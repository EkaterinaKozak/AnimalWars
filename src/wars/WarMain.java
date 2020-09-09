package wars;
import animals.Animal;
import animals.Lion;
import animals.Lynx;
import animals.Moose;
import animals.Tiger;

public class WarMain {

	public static void main(String[] args) {
		
		Tiger tiger = new Tiger("�����");
		Lion lion = new Lion("������");
		Lynx lynx = new Lynx("������");
		Moose moose = new Moose("�������");
		
		WarService ring = new WarService();
		Animal redFinalist = ring.battle(tiger, lion);
		Animal blueFinalist = ring.battle(lynx, moose);
		Animal champion = ring.battle(redFinalist, blueFinalist);
		System.out.println("�������������! ���������� ���������� - " + champion.getName());

	}

}
