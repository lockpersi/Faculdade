
public class MenuGlobal {
	
	public static void menuglobal(){
		
		System.out.println("****************************");
		System.out.println("PILHA:");
		System.out.println("1) Empilhar");
		System.out.println("2) Desempilhar");
		System.out.println("3) Topo");
		System.out.println("4) Imprimir elementos (topo => base)");
		System.out.println("5) Imprimir índice topo");
		System.out.println("6) Imprimir número elementos");
		System.out.println("9) Sair");
		System.out.println("****************************");
		System.out.print("Digite uma opção: ");
		
	}
	
	public static void switchmenu(byte opc){
	
		switch(opc){
		
		case 1:
				System.out.println("Você escolheu Empilhar as pilhas");
				break;
		case 2:
				System.out.println("Você escolheu Desempilhar as pilhas");
				break;
		case 3:
				System.out.println("Você escolheu Topo");
				break;
		default:
				System.out.println("Caso Default");
				break;
		}
	}

}