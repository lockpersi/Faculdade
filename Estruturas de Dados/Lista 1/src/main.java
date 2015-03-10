import java.util.Scanner;

public class main {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {

		byte menu;
		char sairopc;
		
		//Scanner ler = new Scanner(System.in);
		
		MenuGlobal menuglobal = new MenuGlobal();
		
		menuglobal.menuglobal();
		menu = ler.nextByte();
		
		//debug menu
		//System.out.println("Numero do menu:" +  menu);
		
		switch(menu){
		
		case 1: 
				System.out.println("Você escolheu Cadastrar Cliente");
				break;
		case 2:
				System.out.println("Voce escolheu Pesquisar Cliente");
				break;
		case 3:
				System.out.println("Voce escolheu Relatórios de Cliente");
				break;
		case 9:
				System.out.println("Voce escolheu sair do programa...");
				System.out.println("Caso voce realmente deseja sair do "
						+ "programa digite S caso não digite N: ");
				
				Scanner dados = new Scanner(System.in);
								
				sairopc = dados.nextLine().charAt(0);
				
				switch(sairopc){
				
				case 's': case 'S':
					System.out.println("Saindo do programa...");
					break;
				case 'N' : case 'n':
					main(args);
					break;
				default:
					System.out.println("Você não inseriu um valor correto !");
					System.out.println("Reiniciando o programa...");
					main(args);
					break;
				}
				
				break;
		default:
			 main(args);
			 break;
		
		}
		
	}
	
	}

