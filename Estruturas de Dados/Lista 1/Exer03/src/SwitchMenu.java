
public class SwitchMenu {

	public static void reset(){
		
		for(int i=0;i<30;i++){
			System.out.println("");	
		}
	}
	
	public static void switchmenu(String opc){
		
		String menuopc;
		
		switch(opc){
		
		case "E": case "e":
			reset();
			System.out.println("Você escolheu enfileirar ( adicionar )");
			Menu.main(null);
			break;
		case "D": case "d":
			reset();
			System.out.println("Você escolheu desenfileirar ( remover )");
			Menu.main(null);
			break;
		case "V": case "v":
			reset();
			System.out.println("Opção Vazia");
			Menu.main(null);
			break;
		case "I": case "i":
			reset();
			System.out.println("Você escolheu imprimir");
			Menu.main(null);
			break;
		case "S": case "s":
			reset();
			System.out.println("Você escolheu sair do programa...");
			System.out.println("Caso você deseja realmente sair"
					+ "tecle S caso não tecle N:  ");
			menuopc = Menu.entrada.next();
			switch(menuopc){
				
			case "S": case "s":
				System.out.println("Saindo do programa...");
				System.exit(0);
				break;
			case "N": case "n":
				reset();
				Menu.main(null);
				break;
			default:
				reset();
				System.out.println("Opção Inválida !");
				Menu.main(null);
			}
		default:
			reset();
			System.out.println("Opção inválida !");
			Menu.main(null);
			break;
		}
		
	}
	
}
