import java.util.Scanner;

public class Menu {

	static Scanner entrada = new Scanner(System.in);
	static String opc;
	
	public static void main(String[] args) {
		
		MenuGlobal.menuglobal();
		opc = entrada.next();
		
		entrada.nextLine();
		
		SwitchMenu.switchmenu(opc);
	}
}
