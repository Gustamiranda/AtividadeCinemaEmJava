package Exercicio;

import java.util.Scanner;
import static Exercicio.agendamento.*;

public class principal extends progamacao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Character realizarOutroAgendamento = 's';

		progamacao filmes = new progamacao();
		agendamento pessoas = new agendamento();

		System.out.println("Deseja realizar um agendamento? (s)/(n");
		char realizarAgendamento = scanner.next().charAt(0);

		
		while (realizarAgendamento == 's' && realizarOutroAgendamento == 's') {
			if (realizarOutroAgendamento == 's' && realizarAgendamento == 's') {

				// *iterarVetores
				for (int i = 0; i < 3; i++) {

					filmes.nomeDoFilme = nomeDoFilmeEscolhido[i];
					filmes.faixaEtaria = faixaEtariaDoFilme[i];
					filmes.capacidadeDaSala1 = capacidade[i];

				}

				for (int i = 0; i < 3; i++) {

					pessoas.idade = idadeDaPessoa[i];

				}

				System.out.print("-----|Bem Vindo|------");
				System.out.print("\nPor favor, informe o seu nome: ");
				pessoas.nome = scanner.next();

				System.out.print("Qual a sua idade: ");
				pessoas.idade = scanner.nextInt();

				if (pessoas.idade > 120 || pessoas.idade < 0) {
					while (pessoas.idade > 120 || pessoas.idade < 0) {

						System.out.print("Numero Invalido");
						System.out.print("Digite Novamente: ");
						pessoas.idade = scanner.nextInt();

					}
				}

				System.out
						.print("\nQual filme que você deseja ver?(0)= Batman  (1)= Os vingadores  (2)= Porto Seguro: ");
				Integer escolhaDoFilme = scanner.nextInt();

				if (escolhaDoFilme > nomeDoFilmeEscolhido.length) {
					while (escolhaDoFilme > nomeDoFilmeEscolhido.length) {

						System.out.print("Filme Invalido ! ");
						System.out.print("Digite o n° do filme novemente: ");
						escolhaDoFilme = scanner.nextInt();

					}
				} else {
					filmes.nomeDoFilme = nomeDoFilmeEscolhido[escolhaDoFilme];
					filmes.faixaEtaria = faixaEtariaDoFilme[escolhaDoFilme];
				}

				System.out.print("Quantos bilhetes: ");
				pessoas.QuantDeFilmes = scanner.nextInt();
				if (filmes.faixaEtaria > pessoas.idade) {

					System.out
							.print("Voçe nao tem idade para assistir esse filme");

				} else {
					if ((filmes.capacidadeDaSala1 = capacidade[escolhaDoFilme]) < (pessoas.QuantDeFilmes)) {

						System.out
								.print("Infelizmente nao ha sala paras a quantidade de pessoas que fizeram a reserva ");

					} else {

						filmes.capacidadeDaSala1 = capacidade[escolhaDoFilme] = filmes.capacidadeDaSala1 = capacidade[escolhaDoFilme]
								- pessoas.QuantDeFilmes;

						System.out.print("reserva realizada com sucesso !");

						System.out.println("\nNome: " + pessoas.nome
								+ "\nIdade: " + pessoas.idade
								+ "\nFilme escolhido: " + filmes.nomeDoFilme + "\nQuantidade de Bilhetes: "+ pessoas.QuantDeFilmes);
					}

				}

				System.out.print("\nDeseja fazer outro agendamento ? (s)/(n)");
				realizarOutroAgendamento = scanner.next().charAt(0);

			}
				if(realizarOutroAgendamento.equals('n')){
					System.out.println("Programa finalizado");
				}
		}
	}
}
