package vetores;

public class Vetores {
	public static void main(String[] args) {

		double notas[] = { 8.5, 9.3, 7.2, 9.7 };

		double mediaNotas = media(notas);

		System.out.println("Média de notas da sala é " + mediaNotas + "\n");

		double idade[] = { 25, 18, 14, 13, 89, 74, 68, 95, 58, 17, 17, 16, 17, 17, 17, 16, 17, 22, 17, 19, 16, 16, 17,
				16, 16 };

		double mediaIdades = soma(idade);

		System.out.println("A Média de idade da sala é " + mediaIdades + "\n");

		
		String nomes[] = {"Ana", "Pedro", "Carlos", "Fabio"};

		for(
		int i = 0;i<nomes.length;i++)
		{

			nomes[i] += "da Silva";

			System.out.println(nomes[i]);
		}
	}

	private static double media(double vetor[]) {
		double soma = 0;
		int tamanhoVetor = vetor.length;
		for (int i = 0; i < tamanhoVetor; i++) {
			soma += vetor[i];
		}
		return soma / tamanhoVetor;

	}

	private static double soma(double vetor[]) {
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;

	}


}