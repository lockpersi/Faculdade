
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
			System.out.println("Voc� escolheu enfileirar ( adicionar )");
			Menu.main(null);
			break;
		default:
			reset();
			System.out.println("Op��o inv�lida !");
			Menu.main(null);
			break;
		}
		
	}
	
}
