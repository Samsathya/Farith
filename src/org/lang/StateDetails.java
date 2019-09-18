package org.lang;

public class StateDetails {

	private void southIndia() {
System.out.println("TamilNadu");
	}

private void northIndia() {
System.out.println("Delhi");
}

public static void main(String[] args) {
	
	StateDetails s = new StateDetails();
	LanguageDetails l= new LanguageDetails();
	
	s. southIndia();
	l. tamilLanguage();
	l. englishLanguage();
	s. northIndia();
	l. hindhiLanguage();
	l. englishLanguage();
	
}
}
