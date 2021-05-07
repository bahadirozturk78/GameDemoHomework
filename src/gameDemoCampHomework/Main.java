package gameDemoCampHomework;

//import Concrete.FakeValidationManager;
import Concrete.GamerManager;
import Concrete.MernisValidationManager;
import Entity.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer baho = new Gamer(1,"Bahadýr","Öztürk","18206912256",2000);
		GamerManager gamerManager1 = new GamerManager(new MernisValidationManager());
		
		gamerManager1.add(baho);

	}

}
