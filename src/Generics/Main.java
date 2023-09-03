package Generics;

/**
 * @author sol
 *
 */
public class Main {
	
	public static void main(String[] args) {
		var user1 = new User(10);
		var user2 = new User(20);
		if(user1.compareTo(user2) <0) 
			System.out.print("");
		
	}
	
}