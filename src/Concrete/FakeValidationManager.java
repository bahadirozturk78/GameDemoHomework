package Concrete;

import Abstract.ValidationService;
import Entity.Gamer;

public class FakeValidationManager implements ValidationService {

	@Override
	public boolean validate(Gamer gamer) {
		//System.out.println(gamer.getFirstName() + " do�ruland�.");
		return true;
	}

}
