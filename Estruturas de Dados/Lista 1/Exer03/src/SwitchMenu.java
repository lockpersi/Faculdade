
public class SwitchMenu {

	public static void reset(){
		for(int i=0;i<30;i++){
			System.out.println("");
			
		}
		
	}
	
	public static void switchmenu(String opc){
		
		switch(opc){
		
		case "E": case "e":
			reset();
			System.out.println("Você escolheu enfileirar ( adicionar )");
			Menu.main(null);
			break;
		default:
			reset();
			System.out.println("Opção inválida !");
			Menu.main(null);
			break;
		}
		
	}
	
}
