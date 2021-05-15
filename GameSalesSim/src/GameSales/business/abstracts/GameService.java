package GameSales.business.abstracts;

import GameSales.entities.concretes.Game;

public interface GameService {
void add(Game game);
void delete(Game game);
void update(Game game);

}
