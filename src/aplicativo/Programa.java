package aplicativo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		//Variáveis
		int opcao;
		String msg;
		
		//Criação do menu de seleção
		msg = "Selecione uma das opções do menu: \n\n";
		msg += "1. Aplicação que imprime a média de um aluno.\n"; 
		msg += "2. Aplicação que imprime todos números inteiros de 10 a 25.\n";
		msg += "3. Aplicação que imprime a soma dos números de 1 a 100, pulando de dois em dois.\n";
		msg += "4. Aplicação que inicia do 0 e imprime os números seguintes, enquanto a soma já impressa é menor do que 100.\n";
		msg += "5. Aplicação que imprime a tabuada do 9 até o décimo valor.\n";
		msg += "6. Aplicação que efetua o cálculo fatorial.\n";
		msg += "7. Aplicação que imprime os 15 primeiros números da série de Fibonacci.\n";
		msg += "8. Aplicação que recebe um valor e se for par, deve receber o próprio valor + 5. Se for ímpar, recebe o próprio valor x 2. A aplicação finaliza assim que o valor for maior que 1000\n";
		msg += "9. Aplicação que determina se uma data é válida ou não.\n";
		
		//Mostrando as opções do menu
		System.out.println(msg);
		
		//Leitura da opção
		opcao = leitor.nextInt();
		
		System.out.println();
		System.out.println("A opção escolhida é: " + opcao);
		//Estrutura de seleção
		switch (opcao) {
		case 1:
			//Variáveis
			double nota1 = 8.5;
			double nota2 = 7.5;
			double nota3 = 6.0;
			
			int peso1 = 3;
			int peso2 = 2;
			int peso3 = 5;
			
			double parcial1 = nota1 * peso1;
			double parcial2 = nota2 * peso2;
			double parcial3 = nota3 * peso3;
			
			//Cálculo da média
			double media = (parcial1 + parcial2 + parcial3) / (peso1 + peso2 + peso3);
			
			//Mostrando a média
			System.out.println("A média é: " + media);
			break;
			
		case 2:
			//Estrutura de repetição
			for (int i = 10; i <= 25; i++) {
				System.out.println(i);
			}
			break;
			
		case 3:
			//Variável
			int soma = 0;
			
			//Estrutura de repetição
			for (int i = 0; i <= 100; i++) {
				soma += i;
			}
			System.out.println(soma);
			break;
			
		case 4:
			//Variável
			int r = 0;
			
			//Estrutura de repetição
			for (int i = 0; i < 100; i++) {				
				if (r + i < 100) {
					System.out.println(i);
				}
				
				r += i;
			}
			break;
		case 5:
			//Variável
			int result = 0;
			int i = 0;
			
			
			//Estrutura de repetição
			while(i <= 10) {
				int valor = 9;
				result = valor * i;
				
				System.out.println(valor + " x " + i + " = " + result);
				i++;
			}
			break;
		case 6:
			//Variável
			int valor;
			long resposta = 1;
			
			//Leitura do valor
			System.out.println("Digite um número inteiro: ");
			valor = leitor.nextInt();
			
			//Estrutura de repetição
			for (int j = 2; j <= valor; j++) {
				resposta *= j;
			}
			System.out.println("O fatorial de " + valor + " é igual a: " + resposta);
			break;
		case 7:
			//Variável
			int f = 1;
			
			//Estrutura de repetição
			for (int j = 0, cont = 0; cont < 15; cont++) {
				System.out.println(j + " ");
				j = j + f;
				f = j - f;
			}
			break;
		case 8:
			//Variável
			int x = 10;

			while(x < 1000) {
				if(x % 2 == 0) {
					x += 5;
				} else {
					x *= 2;
				}
				System.out.println(x + " , ");
			}
			break;
		case 9:
			int dia = 31;
			int mes = 5;
			int ano = 1982;
			
			if(ano < 1900 || ano > 2999 || mes < 1 || mes > 12 || dia < 1 || dia > 31) {
				System.out.println("Data inválida!");
			} else if((dia <= 31) && (mes <= 12)) {
				if (((dia > 28) && (mes == 2) || (dia == 31) && (mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))) {
					System.out.println("Data inválida!");
				} else {
					System.out.println("Data válida!");
				}
			} else {
				System.out.println("Data inválida!");
			}
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		//Fechando o leitor
		leitor.close();
	}
}
