package prototype.q3;

public class MessageBox implements Product {
	
	private String text;
	private char deco;
    
    MessageBox(String text, char deco) {
        this.text = text;
        this.deco = deco;
    }

	@Override
	public String use() {
		return (deco + text + deco);
	}

	@Override
	public Product createClone() {
		return new MessageBox(text, deco);
	}

}
