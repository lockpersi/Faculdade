import java.util.Scanner;

public class main {

	//static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {

		byte menu;
		char sairopc;
		
		Scanner ler = new Scanner(System.in);
		
		MenuGlobal menuglobal = new MenuGlobal();
		
		menuglobal.menuglobal();
		menu = ler.nextByte();
		
		ler.nextLine();
		
		//debug menu
		//System.out.println("Numero do menu:" +  menu);
		
		switch(menu){
		
		case 1: 
				System.out.println("Voc� escolheu Cadastrar Cliente");
				main(args);
				break;
		case 2:
				System.out.println("Voce escolheu Pesquisar Cliente");
				main(args);
				break;
		case 3:
				System.out.println("Voce escolheu Relat�rios de Cliente");
				main(args);
				break;
		case 99:
				System.out.println("Voce escolheu sair do programa...");
				System.out.println("Caso voce realmente deseja sair do "
						+ "programa digite S caso n�o digite N: ");
				
								
				sairopc = ler.nextLine().charAt(0);
				
				switch(sairopc){
				
				case 's': case 'S':
					System.out.println("Saindo do programa...");
					System.exit(0);
					break;
				case 'N' : case 'n':
					main(args);
					break;
				default:
					System.out.println("Voc� n�o inseriu um valor correto !");
					System.out.println("Reiniciando o programa...");
					main(args);
					break;
				}
				
				break;
		default:
			System.out.println("Op��o invalida!");
			main(args);
			 break;
		
		}
		
	}
	
	}

