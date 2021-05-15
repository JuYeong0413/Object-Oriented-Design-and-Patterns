package prototype.q3;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		System.out.print("Enter input text: ");
		
    	Scanner sc = new Scanner(System.in);
    	String input = sc.nextLine();
   
    	Product p1 = new MessageBox(input,'_');
    	Product p2 = new MessageBox(input,'*');
    	
        PrototypeService service = new PrototypeService();
        service.register("product1", p1);
        service.register("product2", p2);
        
        Product p1Clone = service.create("product1");
        Product p2Clone = service.create("product2");
        
        System.out.println(p1Clone.use());
        System.out.println(p2Clone.use());
        
    }
}
