
public class MenuGlobal {
	
	public static void menuglobal(){
		
		System.out.println("****************************");
		System.out.println("PILHA:");
		System.out.println("1) Empilhar");
		System.out.println("2) Desempilhar");
		System.out.println("3) Topo");
		System.out.println("4) Imprimir elementos (topo => base)");
		System.out.println("5) Imprimir �ndice topo");
		System.out.println("6) Imprimir n�mero elementos");
		System.out.println("9) Sair");
		System.out.println("****************************");
		System.out.print("Digite uma op��o: ");
		
	}
	
	public static void switchmenu(byte opc){
	
		switch(opc){
		
		case 1:
				for(int i=0;i<30;i++){
					System.out.println("");
				}
				System.out.println("Voc� escolheu Empilhar as pilhas");
				Menu.main(null);
		case 2:
				for(int i=0;i<30;i++){
					System.out.println("");
				}
				System.out.println("Voc� escolheu Desempilhar as pilhas");
				Menu.main(null);
		case 3:
				for(int i=0;i<30;i++){
					System.out.println("");
				}
				System.out.println("Voc� escolheu Topo");
				Menu.main(null);
		case 4:
				for(int i=0;i<30;i++){
					System.out.println("");
				}
				System.out.println("Voc� escolheu imprimir elementos");
				Menu.main(null);
		case 5:
				for(int i=0;i<30;i++){
					System.out.println("");
				}
				System.out.println("Voc� escolheu impromir indice topo");
		case 6:
				for(int i=0;i<30;i++){
					System.out.println("");
				}
				System.out.println("Voc� escolheu imprimir numero de elementos");
				Menu.main(null);
		default:
				for(int i=0;i<30;i++){
					System.out.println("");
				}
				System.out.println("Voc� escolheu uma op��o inv�lida, reiniciando o programa !");
				Menu.main(null);
		}
	}

}