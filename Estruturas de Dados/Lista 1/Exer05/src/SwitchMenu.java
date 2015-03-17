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
			System.out.println("O resultado da subtração deu: " +resultado);
			Menu.main(null);
			break;
		case 3:
			resultado = Operacoes.multiplicar();
			reset();
			System.out.println("O resultado da multiplicação deu: " +resultado);
			Menu.main(null);
			break;
		case 4:
			resultado = Operacoes.dividir();
			reset();
			System.out.println("O resultado da divisão deu: " +resultado);
			Menu.main(null);
			break;
		case 99:
			Menu.entrada.nextLine();
			System.out.println("Você escolheu sair do programa, você realmente deseja sair ?");
			System.out.println("Caso SIM digite S, caso NÃO digite N !!");
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
				System.out.println("Você digitou um comando errado !");
				Menu.main(null);
				break;
			}
		default:
			Menu.main(null);
			break;
		}
		
	}

}
