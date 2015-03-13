
public class SwitchMenu {
	static float valor1 = 0,
				 valor2 = 0;
	
	public static void reset(){
		for(int i =0;i<30;i++){
			System.out.println("");
		}
	}
	public static void switchmenu(int menu){
		
		switch(menu){
		
		case 1: 
			Operacoes.pegadados(valor1, valor2);
			System.out.println(valor1);
		default:
			Menu.main(null);
		
		}
		
	}

}
