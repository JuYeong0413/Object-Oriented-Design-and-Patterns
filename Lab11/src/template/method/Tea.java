package template.method;

public class Tea extends CaffeineBeverage {

	@Override
	public void prepareRecipe() {
		boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
	}
	
	public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }

}
