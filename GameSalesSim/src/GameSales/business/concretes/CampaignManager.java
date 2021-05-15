package GameSales.business.concretes;

import GameSales.business.abstracts.CampaignService;
import GameSales.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
System.out.println("The campaign: "+campaign.getCampaignName()+" was added with a rate of "+campaign.getCampaignRate()+" percent.");		
	}

	@Override
	public void update(Campaign campaign) {
System.out.println("The Campaign :"+campaign.getCampaignName()+" was updated.");		
	}

	@Override
	public void delete(Campaign campaign) {
System.out.println("The campaign : "+campaign.getCampaignName()+" was deleted!");		
	}

}
