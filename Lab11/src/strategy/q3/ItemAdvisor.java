package strategy.q3;

public class ItemAdvisor implements Advisor {

	@Override
	public Firework recommend(Customer c) {
		return (Firework) LikeMyStuff.suggest(c);
	}

}
