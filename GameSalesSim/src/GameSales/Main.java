package GameSales;

import GameSales.business.concretes.CampaignManager;
import GameSales.business.concretes.GameManager;
import GameSales.business.concretes.GameSaleManager;
import GameSales.business.concretes.GamerCheckManager;
import GameSales.business.concretes.GamerManager;
import GameSales.entities.concretes.Campaign;
import GameSales.entities.concretes.Game;
import GameSales.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
    
		Gamer gamer1=new Gamer(1,"Sema","Kaya","29495190638",1992);
		GamerManager gamerManager=new GamerManager(new GamerCheckManager());
		gamerManager.add(gamer1);
		
		Game game1=new Game(1,"PubG",120);
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		
		Campaign campaign1=new Campaign(1,"Corona",50);
        CampaignManager campaignManager=new CampaignManager();
        campaignManager.add(campaign1);
        
        GameSaleManager gameSaleManager=new GameSaleManager();
        gameSaleManager.gameSale(game1, gamer1);
        gameSaleManager.gameSaleCampaign(game1, gamer1, campaign1);
		
	}

}
