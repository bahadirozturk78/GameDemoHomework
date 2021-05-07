package Concrete;

import Abstract.GamerService;
import Abstract.ValidationService;
import Entity.Gamer;

public class GamerManager implements GamerService {

	private ValidationService validationService;

	public GamerManager(ValidationService validationService) {
		this.validationService = validationService;
	}

	@Override
	public void add(Gamer gamer) {
		boolean result = validationService.validate(gamer);
		
		if (result) {
			System.out.println("Doðrulandý: " + gamer.getFirstName());
		}else {
			System.out.println("Doðrulanmadý.");
		}
		
	}

	@Override
	public void get(Gamer gamer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub

	}

}
