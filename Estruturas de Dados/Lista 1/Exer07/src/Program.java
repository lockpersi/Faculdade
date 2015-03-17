import java.util.*;

public class Program {
	
	
	static Scanner entrada = new Scanner(System.in);
	static float valor, valor1, valor2;
	public static void main(String[] args) {
		
		Menu.menu();
		int menu = entrada.nextInt();
		pegadados();
		System.out.println(valor + valor1 + valor2);
		
	}
	
	public static void pegadados(){
		
		System.out.println("Digite o primeiro valor: ");
		valor = entrada.nextFloat();
		
		entrada.nextLine();
		
		System.out.println("Digite o segundo valor: ");
		valor1 = entrada.nextFloat();
		
		entrada.nextLine();
		
		System.out.println("Digite o terceiro valor: ");
		valor2 = entrada.nextFloat();

		entrada.nextLine();

	}

}
