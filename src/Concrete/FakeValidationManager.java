package Concrete;

import Abstract.ValidationService;
import Entity.Gamer;

public class FakeValidationManager implements ValidationService {

	@Override
	public boolean validate(Gamer gamer) {
		//System.out.println(gamer.getFirstName() + " doðrulandý.");
		return true;
	}

}
