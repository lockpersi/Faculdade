
public class MenuGlobal {
	
	private static void reset(){
		for(int i=0;i<30;i++){
			System.out.println("");
		}
	}
	
	public static void menuglobal(){
		
		System.out.println("****************************");
		System.out.println("PILHA:");
		System.out.println("1) Empilhar");
		System.out.println("2) Desempilhar");
		System.out.println("3) Topo");
		System.out.println("4) Imprimir elementos (topo => base)");
		System.out.println("5) Imprimir índice topo");
		System.out.println("6) Imprimir número elementos");
		System.out.println("99) Sair");
		System.out.println("****************************");
		System.out.print("Digite uma opção: ");
		
	}
	
	public static void switchmenu(byte opc){
		
		char sairopc;
		
		switch(opc){
		
		case 1:
				reset();
				System.out.println("Você escolheu Empilhar as pilhas");
				Menu.main(null);
		case 2:
				reset();
				System.out.println("Você escolheu Desempilhar as pilhas");
				Menu.main(null);
		case 3:
				reset();
				System.out.println("Você escolheu Topo");
				Menu.main(null);
		case 4:
				reset();
				System.out.println("Você escolheu imprimir elementos");
				Menu.main(null);
		case 5:
				reset();
				System.out.println("Você escolheu impromir indice topo");
				Menu.main(null);
		case 6:
				reset();
				System.out.println("Você escolheu imprimir numero de elementos");
				Menu.main(null);
		case 99:
				reset();
				System.out.println("Voce escolheu sair do programa...");
				System.out.println("Caso voce realmente deseja sair do "
						+ "programa digite S caso não digite N: ");
				
				sairopc = Menu.entrada.nextLine().charAt(0);
				
				switch(sairopc){
				
				case 'S': case 's':
					System.out.println("Você escolheu sair do programa");
					System.exit(0);
					break;
				case 'N': case 'n':
					reset();
					Menu.main(null);
					break;
				default:
					reset();
					System.out.println("Opção Inválida");
					Menu.main(null);
					break;
				}
		default:
				reset();
				System.out.println("Você escolheu uma opção inválida, reiniciando o programa !");
				Menu.main(null);
		}
	}

}