package wars;
import animals.Animal;
import animals.Lion;
import animals.Lynx;
import animals.Moose;
import animals.Tiger;

public class WarMain {

	public static void main(String[] args) {
		
		Tiger tiger = new Tiger("Тигра");
		Lion lion = new Lion("Король");
		Lynx lynx = new Lynx("Маруся");
		Moose moose = new Moose("Сохатый");
		
		WarService ring = new WarService();
		Animal redFinalist = ring.battle(tiger, lion);
		Animal blueFinalist = ring.battle(lynx, moose);
		Animal champion = ring.battle(redFinalist, blueFinalist);
		System.out.println("Апплодисменты! Победитель чемпионата - " + champion.getName());

	}

}
