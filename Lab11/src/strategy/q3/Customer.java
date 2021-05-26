package strategy.q3;

import java.util.Calendar;

public class Customer {

	private Advisor getAdvisor() {
		
		if (advisor == null)
		{
			if (PromotionAdvisor.singleton.hasItem())
			{
				advisor = PromotionAdvisor.singleton;
			} else if (isRegistered()) {
				advisor = GroupAdvisor.singleton;
			} else if (isBigSpender()) {
				advisor = ItemAdvisor.singleton;
			} else {
				advisor = RandomAdvisor.singleton;
			}
		}
		return advisor;
	}
	
	private boolean isBigSpender()
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -1);
		return spendingSince(cal.getTime()) > BIG_SPENDER_DOLLARS;
	}
	
	public Firework getRecommended() {
		return getAdvisor().recommend(this);
    }


}
