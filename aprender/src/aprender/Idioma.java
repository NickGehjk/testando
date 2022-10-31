package aprender;

import java.util.Locale;

public class Idioma {

	public static void main(String[] args) {
		Locale lingua = Locale.getDefault();
		System.out.println("O idioma do sistema é: ");
		System.out.println(lingua.getDisplayLanguage());

	}

}
