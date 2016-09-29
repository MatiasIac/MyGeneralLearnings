package com.santexgroup.dp.chainofresponsability.main;

import com.santexgroup.dp.chainofresponsability.model.Client;

public class ChainOfResponsabilityMain {

	public static void main(String[] args) {
		final Client client = new Client();

		System.out.println("\n** Small content (size <= 20) **\n");
		String content = "dummy";
		System.out.println("content: " + content + "\n");
		client.handle(content);

		System.out.println("\n** Medium content ( 20 < size <= 40) **\n");
		content = "In object-oriented design";
		System.out.println("content: " + content + "\n");
		client.handle(content);

		System.out.println("\n** Big content ( size > 40) **\n");
		content = "In a variation of the standard chain-of-responsibility model, some handlers may act as dispatchers, capable of sending commands out in a variety of directions,";
		System.out.println("content: " + content + "\n");
		client.handle(content);
	}
}
