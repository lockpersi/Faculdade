import java.util.Scanner;


public class inicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		int i = 0;
		
		do {

        	System.out.println("");
			System.out.println("-----------------------");
			System.out.println("MENU......");
			System.out.println("1-Idade..:");
			System.out.println("2-Avaliar:");
			System.out.println("3-Qual a idade informada?");
			System.out.println("99-Sair");
			System.out.println("-----------------------");
			System.out.println("Digite a opcao: ");
			opc = sc.nextInt();
			
			if (opc == 1) {
				//Guardando na variavel I a idade .
				System.out.println("Digite a idade:");
				i = sc.nextInt();
			} else {
				if (opc == 2) {
					
					//Algoritimo de avaliaaco
					if ((i >= 16) & (i <21)) {			
						System.out.println("Liberado com acompanhante.");			
					} else {
						if (i >= 21) {
							System.out.println("Liberado.");
						} else {
							System.out.println("Acesso negado.");
						}
					}					
				} else {
					if (opc == 3) {						
						System.out.println("Idade informada: " + i);
					} else {
						if (opc < 99) {
							System.out.println("OPCAO INVALIDA");
						}
					}
				}
			}
		} while (opc != 99);
		

	}

}
