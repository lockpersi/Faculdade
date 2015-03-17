import java.util.*;

public class Menu {

	static Scanner entrada = new Scanner(System.in);
	
	static int menu;
				 
	public static void main(String[] args) {

		MenuGlobal.menuglobal();
		menu = entrada.nextInt();
		
		SwitchMenu.switchmenu(menu);
		
	}
}
