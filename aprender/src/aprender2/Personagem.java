package aprender2;

import java.util.Random;

public class Personagem {
	String nome;
	int nivel;
	int forca;
	
	//void -> não está retornando
	void mostrarStatus() {
		System.out.format("Personagem: %s (lvl %d) com %d de força\n", nome,
				nivel, forca);
	}
	
	int calcularDano(){
		Random gerador = new Random();
		int dado20 = 1+ gerador.nextInt(19);
		int dano = forca + dado20;
		return dano;
	}
	
	String gerarNome() {
		String nome2 = "a";
		return nome2;
	}
	
	void atacar(String alvo, String habilidade) {
		int danoCausado = calcularDano();
		if(habilidade.length() == 0) {
			System.out.format("%s atacou %s e causou %d de dano\n", nome, 
					alvo, danoCausado);
		} else {
		System.out.format("%s atacou %s com %s e causou %d de dano\n", nome, 
				alvo, habilidade, danoCausado);
		}
		
	}
	
	
	
}
