public class Operacoes {

	public static float somar(){
		
		System.out.print("Digite o primeiro valor : ");
		float valor1 = Menu.entrada.nextFloat();
		
		Menu.entrada.nextLine();
		
		System.out.print("Digite o segundo valor : ");
		float valor2 = Menu.entrada.nextFloat();
		
		Menu.entrada.nextLine();
		
		float resultado = valor1 + valor2;
		return resultado;
	}
	
	public static float subtrair(){
		
		System.out.print("Digite o primeiro valor : ");
		float valor1 = Menu.entrada.nextFloat();
		
		Menu.entrada.nextLine();
		
		System.out.print("Digite o segundo valor : ");
		float valor2 = Menu.entrada.nextFloat();
		
		Menu.entrada.nextLine();
		
		float resultado = valor1 - valor2;
		
		return resultado;
	}
	
	public static float multiplicar(){
		
		System.out.print("Digite o primeiro valor : ");
		float valor1 = Menu.entrada.nextFloat();
		
		Menu.entrada.nextLine();
		
		System.out.print("Digite o segundo valor : ");
		float valor2 = Menu.entrada.nextFloat();
		
		Menu.entrada.nextLine();
		
		float resultado = valor1 * valor2;
		
		return resultado;
	}
	
	public static float dividir(){
		
		System.out.print("Digite o primeiro valor : ");
		float valor1 = Menu.entrada.nextFloat();
		
		Menu.entrada.nextLine();
		
		System.out.print("Digite o segundo valor : ");
		float valor2 = Menu.entrada.nextFloat();
		
		Menu.entrada.nextLine();
		
		float resultado = valor1 / valor2;
		
		return resultado;
	}
}
