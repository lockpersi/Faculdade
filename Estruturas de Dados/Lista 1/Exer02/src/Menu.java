import java.util.Scanner;

public class Menu {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		byte opc;
		
		MenuGlobal.menuglobal();
		opc = entrada.nextByte();
		
		entrada.nextLine();
		
		MenuGlobal.switchmenu(opc);
			
	}

}
