package Concrete;

import Abstract.ValidationService;
import Entity.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisValidationManager implements ValidationService {

	@Override
	public boolean validate(Gamer gamer) {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		try {
			boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalID()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getDateOfBirth());
			return result;
		} catch (Exception ex) {
			System.out.println("api hatasi " + ex.getMessage());
			return false;
		}

	}
}
