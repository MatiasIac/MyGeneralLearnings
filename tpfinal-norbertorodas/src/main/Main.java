package main;

import model.proxy.Client;

/**
 * Main class which executes the functionalities
 * 
 * @author beto
 *
 */
public class Main {
	public static void main(String[] args) {

		System.out.println("***** DESIGN PATTERNS *******");

		Client client = new Client();

		addSeparator();
		System.out
				.println("Sending a task (region: euro  - vehicle plate: 'DE 123 AL'");
		client.analyze("euro", "DE 123 AL");

		addSeparator();
		System.out
				.println("Sending a task (region: mercosur  - vehicle plate: 'AB1267HH'");
		client.analyze("mercosur", "AB1267HH");

		addSeparator();
		System.out
				.println("Sending a task (region: mercosur  - vehicle plate: 'AB345HH'");
		client.analyze("mercosur", "AB345HH");
		addSeparator();

		addSeparator();
		System.out
				.println("Sending a task (region: mercosur  - vehicle plate: 'ab345Hh'");
		client.analyze("mercosur", "ab345Hh");
		addSeparator();
		addSeparator();
		System.out
				.println("Sending a task (region: mercosur  - vehicle plate: 'AB 345 HH'");
		client.analyze("mercosur", "AB 345 HH");
		addSeparator();

	}

	private static void addSeparator() {
		System.out
				.println("\n=================================================================");
	}

}
