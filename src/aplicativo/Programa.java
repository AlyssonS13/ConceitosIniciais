package aplicativo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		//Vari�veis
		int opcao;
		String msg;
		
		//Cria��o do menu de sele��o
		msg = "Selecione uma das op��es do menu: \n\n";
		msg += "1. Aplica��o que imprime a m�dia de um aluno.\n"; 
		msg += "2. Aplica��o que imprime todos n�meros inteiros de 10 a 25.\n";
		msg += "3. Aplica��o que imprime a soma dos n�meros de 1 a 100, pulando de dois em dois.\n";
		msg += "4. Aplica��o que inicia do 0 e imprime os n�meros seguintes, enquanto a soma j� impressa � menor do que 100.\n";
		msg += "5. Aplica��o que imprime a tabuada do 9 at� o d�cimo valor.\n";
		msg += "6. Aplica��o que efetua o c�lculo fatorial.\n";
		msg += "7. Aplica��o que imprime os 15 primeiros n�meros da s�rie de Fibonacci.\n";
		msg += "8. Aplica��o que recebe um valor e se for par, deve receber o pr�prio valor + 5. Se for �mpar, recebe o pr�prio valor x 2. A aplica��o finaliza assim que o valor for maior que 1000\n";
		msg += "9. Aplica��o que determina se uma data � v�lida ou n�o.\n";
		
		//Mostrando as op��es do menu
		System.out.println(msg);
		
		//Leitura da op��o
		opcao = leitor.nextInt();
		
		System.out.println();
		System.out.println("A op��o escolhida �: " + opcao);
		//Estrutura de sele��o
		switch (opcao) {
		case 1:
			//Vari�veis
			double nota1 = 8.5;
			double nota2 = 7.5;
			double nota3 = 6.0;
			
			int peso1 = 3;
			int peso2 = 2;
			int peso3 = 5;
			
			double parcial1 = nota1 * peso1;
			double parcial2 = nota2 * peso2;
			double parcial3 = nota3 * peso3;
			
			//C�lculo da m�dia
			double media = (parcial1 + parcial2 + parcial3) / (peso1 + peso2 + peso3);
			
			//Mostrando a m�dia
			System.out.println("A m�dia �: " + media);
			break;
			
		case 2:
			//Estrutura de repeti��o
			for (int i = 10; i <= 25; i++) {
				System.out.println(i);
			}
			break;
			
		case 3:
			//Vari�vel
			int soma = 0;
			
			//Estrutura de repeti��o
			for (int i = 0; i <= 100; i++) {
				soma += i;
			}
			System.out.println(soma);
			break;
			
		case 4:
			//Vari�vel
			int r = 0;
			
			//Estrutura de repeti��o
			for (int i = 0; i < 100; i++) {				
				if (r + i < 100) {
					System.out.println(i);
				}
				
				r += i;
			}
			break;
		case 5:
			//Vari�vel
			int result = 0;
			int i = 0;
			
			
			//Estrutura de repeti��o
			while(i <= 10) {
				int valor = 9;
				result = valor * i;
				
				System.out.println(valor + " x " + i + " = " + result);
				i++;
			}
			break;
		case 6:
			//Vari�vel
			int valor;
			long resposta = 1;
			
			//Leitura do valor
			System.out.println("Digite um n�mero inteiro: ");
			valor = leitor.nextInt();
			
			//Estrutura de repeti��o
			for (int j = 2; j <= valor; j++) {
				resposta *= j;
			}
			System.out.println("O fatorial de " + valor + " � igual a: " + resposta);
			break;
		case 7:
			//Vari�vel
			int f = 1;
			
			//Estrutura de repeti��o
			for (int j = 0, cont = 0; cont < 15; cont++) {
				System.out.println(j + " ");
				j = j + f;
				f = j - f;
			}
			break;
		case 8:
			//Vari�vel
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
				System.out.println("Data inv�lida!");
			} else if((dia <= 31) && (mes <= 12)) {
				if (((dia > 28) && (mes == 2) || (dia == 31) && (mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))) {
					System.out.println("Data inv�lida!");
				} else {
					System.out.println("Data v�lida!");
				}
			} else {
				System.out.println("Data inv�lida!");
			}
			break;
		default:
			System.out.println("Op��o inv�lida!");
			break;
		}
		
		//Fechando o leitor
		leitor.close();
	}
}
