package GameSales.business.abstracts;

import GameSales.entities.concretes.Gamer;

public interface GamerCheckService {

	boolean ckeckIfValid(Gamer gamer);
}
