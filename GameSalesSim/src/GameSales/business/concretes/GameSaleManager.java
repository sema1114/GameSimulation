package GameSales.business.concretes;

import GameSales.business.abstracts.GameSale;
import GameSales.entities.concretes.Campaign;
import GameSales.entities.concretes.Game;
import GameSales.entities.concretes.Gamer;

public class GameSaleManager implements GameSale{

	@Override
	public void gameSale(Game game, Gamer gamer) {
   
		System.out.println("Gamer : "+gamer.getFirstName()+ " bought "+game.getGameName()+" to "+game.getGamePrice() );
		
	}

	@Override
	public void gameSaleCampaign(Game game, Gamer gamer,Campaign campaign) {
  double newPrice=game.getGamePrice()-((game.getGamePrice()*campaign.getCampaignRate())/100);
  System.out.println("Gamer "+gamer.getFirstName()+" bought the "+game.getGameName()+" with dicounted price to "+newPrice);
	}
	

}
