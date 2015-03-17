import java.util.*;

public class Program {

	static Scanner entrada = new Scanner(System.in);
	static float valor, valor1, valor2, maior, menor;
	static int menu, loop = 0, verf = 0;

	public static void main(String[] args) {

		Menu.menu();
		menu = entrada.nextInt();
		switchmenu(menu);

	}

	public static void pegadados() {

		System.out.print("Digite o primeiro valor: ");
		valor = entrada.nextFloat();

		entrada.nextLine();

		System.out.print("Digite o segundo valor: ");
		valor1 = entrada.nextFloat();

		entrada.nextLine();

		System.out.print("Digite o terceiro valor: ");
		valor2 = entrada.nextFloat();

		entrada.nextLine();

		loop++;
		verf = 0;

	}

	public static void switchmenu(int menu) {

		switch (menu) {

		case 1:
			pegadados();
			reset();
			System.out.println("Valores guardados na memoria:[" + valor + "]["
					+ valor1 + "][" + valor2 + "]");
			main(null);
			break;
		case 2:
			reset();
			verifica();
			main(null);
			break;
		case 3:
			reset();
			verificamaior();
			main(null);
			break;
		case 4:
			reset();
			verificamenor();
			main(null);
			break;
		case 99:
			System.out.println("Você deseja realmente sair do programa ?");
			System.out.print("Se SIM digite S, se NÃO digite N: ");
			String menuopc = entrada.next();
			switch (menuopc) {
			case "S":
			case "s":
				System.out.println("Saindo do programa !");
				System.exit(0);
				break;
			case "N":
			case "n":
				reset();
				System.out.println("Reiniciando o programa..");
				main(null);
				break;
			default:
				reset();
				System.out.println("Opção selecionada invalida !");
				System.out.println("Reiniciando o programa...");
				main(null);
				break;
			}

		default:
		}

	}

	private static void verifica() {
		if (loop > 0) {

			if ((valor == valor1) || (valor2 == valor) || (valor1 == valor2)) {
				if (valor == valor1) {
					System.out.println("O primeiro valor [" + valor
							+ "] é igual ao segundo [" + valor1 + "].");
					verf = 0;
				} else if (valor2 == valor) {
					System.out.println("O primeiro valor [" + valor
							+ "] é igual ao terceiro [" + valor2 + "].");
					verf = 0;
				} else if (valor1 == valor2) {
					System.out.println("O segundo valor [" + valor1
							+ "] é igual ao terceiro [" + valor2 + "].");
					verf = 0;
				}
			} else {
				System.out
						.println("Valores verificados, nenhum valor é repetido !");
				verf++;
			}
		} else {
			System.out.println("Você não inseriu nenhum valor");
			verf = 0;
		}
	}

	private static void verificamaior(){
		String devolve = "primeiro";
		if(verf>0){
			if(loop>0){		
				maior = valor;
				if(maior<valor1){
					maior = valor1;
					devolve = "segundo";
				}
				if(maior<valor2){
					maior = valor2;
					devolve = "terceiro";
				}
					System.out.println("O maior numero é o "+devolve+" ["+maior+"]");
		}
			else{
				System.out.println("Você não inserio nenhum valor");
		}
		}
		else{
			System.out.println("Não à como verificar qual é maior, você não verificou"
					+ " os numeros, não inseriu ou à valores iguais.");
		}
	}
	
	private static void verificamenor(){
		String devolve = "primeiro";
		if(verf>0){
			if(loop>0){		
				menor = valor;
				if(menor>valor1){
					menor = valor1;
					devolve = "segundo";
				}
				if(menor>valor2){
					menor = valor2;
					devolve = "terceiro";
				}
					System.out.println("O menor numero é o "+devolve+" ["+menor+"]");
		}
			else{
				System.out.println("Você não inserio nenhum valor");
		}
		}
		else{
			System.out.println("Não à como verificar qual é menor, você não verificou"
					+ " os numeros, não inseriu ou à valores iguais.");
		}		
	}

	public static void reset() {
		for (int i = 0; i < 30; i++) {
			System.out.println("");
		}
	}
}