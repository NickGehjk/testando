package aprender;

public class App {

	public static void main(String[] args) {
		// iphone 12, tela 6.1, 256gb
		// note 20, tela 6.9, 256gb
		// mi 11, 6.81, 128gb
		
		//<tipoVariavel> nomeVariavel = valor;
		
		//Declarando objeto do tipo Novo = criar novo objeto
		Novo celularA = new Novo();
		
		celularA.nome = "Iphone 12";
		celularA.tamanhoTela = 6.1f;
		celularA.espacoArmazenamento = 256;
		celularA.sistemaOperacional = "iOS";
		
		
		Novo celularB = new Novo();
		
		celularB.nome = "Note 20";
		celularB.tamanhoTela = 6.9f;
		celularB.espacoArmazenamento = 256;
		celularB.sistemaOperacional = "Android";
		
		
		Novo celularC;
		celularC = new Novo();
		
		celularC.nome = "Mi 11";
		celularC.tamanhoTela = 6.8f;
		celularC.espacoArmazenamento = 128;
		celularC.sistemaOperacional = "Android";
		
		
		
		System.out.format("Celular %s com tela de %.1f polegadas, com %d gb e SO %s\n", celularA.nome,
				celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
		
		System.out.format("Celular %s com tela de %.1f polegadas, com %d gb e SO %s\n", celularB.nome,
				celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);

		System.out.format("Celular %s com tela de %.1f polegadas, com %d gb e SO %s\n", celularC.nome,
				celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);


	}

}
