package GameSales.business.abstracts;

import GameSales.entities.concretes.Campaign;
import GameSales.entities.concretes.Game;
import GameSales.entities.concretes.Gamer;

public interface GameSale {
	void gameSale(Game game, Gamer gamer);
	void gameSaleCampaign(Game game, Gamer gamer,Campaign campaign);

}
