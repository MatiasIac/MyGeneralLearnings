package com.santexgroup.dp.observer.main;

import com.santexgroup.dp.observer.model.LowerCaseObserver;
import com.santexgroup.dp.observer.model.ContentTextSubject;
import com.santexgroup.dp.observer.model.UpperCaseObserver;
import com.santexgroup.dp.observer.model.UnderscoreObserver;

public class ObserverMain {

	public static void main(String[] args) {
		final ContentTextSubject contentSubject = new ContentTextSubject();
		
		final UnderscoreObserver underscoreObserver = new UnderscoreObserver();
		final UpperCaseObserver upperCaseObserver = new UpperCaseObserver();
		final LowerCaseObserver lowerCaseObserver = new LowerCaseObserver();

		contentSubject.addObserver(underscoreObserver);
		contentSubject.addObserver(upperCaseObserver);
		contentSubject.addObserver(lowerCaseObserver);

		final String text = "Lorem ipsum es el texto que se usa habitualmente en diseño gráfico en demostraciones de tipografías o de borradores de diseño para probar";

		contentSubject.setText(text);
		System.out.println("\n** Notifying observers");
		contentSubject.notifyObservers();
		
		System.out.println("\n** Removing lowercaseobserver and uppercaseobserver");
		contentSubject.removeObserver(lowerCaseObserver);
		contentSubject.removeObserver(upperCaseObserver);
		System.out.println("\n** Notifying observers");
		contentSubject.notifyObservers();
	}
}
