// 2016111540 이주영

package builder;

import builder.User.*;

public class Main {

	public static void main(String[] args) {
		Builder userBuilder = new Builder("juyeong", "lee");
		
		System.out.println(userBuilder.build());
		
		System.out.println("--------------------");
		
		userBuilder.setAge(25);
		userBuilder.setAddress("서울 강남구");
		
		System.out.println(userBuilder.build());
	}

}
