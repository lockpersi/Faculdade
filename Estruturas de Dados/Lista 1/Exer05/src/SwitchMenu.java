public class SwitchMenu {
	
	public static void reset(){
		for(int i =0;i<30;i++){
			System.out.println("");
		}
	}
	static float resultado;
	
	public static void switchmenu(int menu){
		
		switch(menu){
		
		case 1: 
			resultado = Operacoes.somar();
			reset();
			System.out.println("O resultado da soma deu: " +resultado);
			Menu.main(null);
			break;
		case 2:
			resultado = Operacoes.subtrair();
			reset();
			System.out.println("O resultado da subtra��o deu: " +resultado);
			Menu.main(null);
			break;
		case 3:
			resultado = Operacoes.multiplicar();
			reset();
			System.out.println("O resultado da multiplica��o deu: " +resultado);
			Menu.main(null);
			break;
		case 4:
			resultado = Operacoes.dividir();
			reset();
			System.out.println("O resultado da divis�o deu: " +resultado);
			Menu.main(null);
			break;
		case 99:
			Menu.entrada.nextLine();
			System.out.println("Voc� escolheu sair do programa, voc� realmente deseja sair ?");
			System.out.println("Caso SIM digite S, caso N�O digite N !!");
			String menuopc = Menu.entrada.next();
			switch(menuopc){
			
			case "S": case "s":
				System.out.println("Encerrando o programa !!");
				System.exit(0);
			case "N": case "n":
				Menu.main(null);
				break;
			default:
				reset();
				System.out.println("Voc� digitou um comando errado !");
				Menu.main(null);
				break;
			}
		default:
			Menu.main(null);
			break;
		}
		
	}

}
