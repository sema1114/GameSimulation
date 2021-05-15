package GameSales.business.concretes;

import GameSales.business.abstracts.GameService;
import GameSales.entities.concretes.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
    System.out.println(game.getGameName()+ " is added successfully.");		
	}

	@Override
	public void delete(Game game) {
	    System.out.println(game.getGameName()+ " is deleted successfully.");		
		
	}

	@Override
	public void update(Game game) {
	    System.out.println(game.getGameName()+ " is updated successfully.");		
		
	}

}
