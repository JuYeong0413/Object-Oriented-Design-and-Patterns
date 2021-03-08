//Basics 5
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Name n1 = new Name("Jane", "Black");
		System.out.println(n1.getInits() + " " + n1.getFirstAndLastName());
		System.out.println(n1.getLastCommaFirst());
		System.out.println(n1.getNameLine());
		System.out.println(n1.getNameLength());
		System.out.println();
		
		Name n2 = new Name("Mary", "Ann", "Smith");
		System.out.println(n2.getInits() + " " + n2.getFirstAndLastName());
		System.out.println(n2.getLastCommaFirst());
		System.out.println(n2.getNameLine());
		System.out.println(n2.getNameLength());
		System.out.println();
	}

}
