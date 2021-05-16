package GameSales.Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import GameSales.business.abstracts.GamerCheckService;
import GameSales.entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements GamerCheckService {

	//This service belongs to outside.
	@Override
	public boolean ckeckIfValid(Gamer gamer) {
		 KPSPublicSoapProxy client =new KPSPublicSoapProxy();
			
			boolean result =true;
			try {
				result=client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalIdentity()), gamer.getFirstName().toUpperCase(new Locale("tr")), gamer.getLastName().toUpperCase(new Locale("tr")),gamer.getNationalOfBirth());
			} catch (RemoteException e) {
			
				e.printStackTrace();
			}
			System.out.println(result);
		     return result;
	}

}
