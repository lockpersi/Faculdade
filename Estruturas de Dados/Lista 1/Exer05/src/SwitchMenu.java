
public class SwitchMenu {
	
	public static void reset(){
		for(int i =0;i<30;i++){
			System.out.println("");
		}
	}
	static float resultado;
	
	public void switchmenu(int menu){
		
		switch(menu){
		
		case 1: 
			resultado = Operacoes.somar();
			System.out.println(resultado);
			reset();
		default:
			Menu.main(null);
		
		}
		
	}

}
