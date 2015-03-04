import java.util.Scanner;


public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);  //Usuario
		Scanner scm = new Scanner(System.in); //Menu
		int i = 0;                            //Idade
		int opc = 0;                         //Menu

		do {
			
			System.out.println("");
			System.out.println("MENU");
			System.out.println("Digite uma idade:");
			i = sc.nextInt();
			
			if ((i >= 16) & (i <21)) {			
				System.out.println("Liberado com acompanhante.");			
			} else {
				if (i >= 21) {
					System.out.println("Liberado.");
				} else {
					System.out.println("Acesso negado.");
				}
			}						
			
		} while (opc != 99);
		
	}

}
