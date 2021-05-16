package GameSales.business.concretes;


import GameSales.business.abstracts.GamerCheckService;
import GameSales.entities.concretes.Gamer;

public class GamerCheckManager implements GamerCheckService{

	//This service belongs to us
	@Override
	public boolean ckeckIfValid(Gamer gamer) {	
	   return true;
	}
	

}
