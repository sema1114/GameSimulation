package GameSales.business.concretes;

import GameSales.business.abstracts.GamerCheckService;
import GameSales.business.abstracts.GamerService;
import GameSales.entities.concretes.Gamer;

public class GamerManager implements GamerService {

	GamerCheckService gamerCheckService;
	

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void add(Gamer gamer) {

		if(gamerCheckService.ckeckIfValid(gamer)) {
			System.out.println(gamer.getFirstName() +" is added succesfully.");
		}else {
            System.out.println("User couldn't added.");

		}
	}

	@Override
	public void update(Gamer gamer) {
        System.out.println("User is deleted successfully.");
		
	}


	@Override
	public void delete(Gamer gamer) {
        System.out.println("User data is updated successfully.");
		
	}

	
	


	

}
