package prototype.q3;

import java.util.HashMap;

public class PrototypeService {
	
	private HashMap<String, Product> products = new HashMap<String, Product>();

	public void register(String name, Product product) {
        products.put(name, product);
    }
	
    public Product create(String name) {
        return ((Product)(products.get(name))).createClone();
    }
}
