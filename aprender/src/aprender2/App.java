package aprender2;

import aprender.Novo;

public class App {

	public static void main(String[] args) {
		
		Personagem heroi = new Personagem();
		
		heroi.nome = "Jeca";
		heroi.nivel = 2;
		heroi.forca = 16;
		
		heroi.mostrarStatus();
		heroi.atacar("Doug","");
		heroi.atacar("Doug","Bola de fogo");
		
		System.out.println(heroi.calcularDano());
		
		System.out.println(heroi.gerarNome());
		
		aprender.Novo uiui = new Novo();
		
		uiui.sistemaOperacional = "chama";
		
		System.out.println(uiui.sistemaOperacional);

	}

}
