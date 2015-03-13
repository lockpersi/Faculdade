public class Operacoes {

	public static float pegadados(float valor1,float valor2){
		
		System.out.println("Digite o primeiro valor : ");
		valor1 = Menu.entrada.nextFloat();
		
		Menu.entrada.nextLine();
		
		System.out.println("Digite o segundo valor : ");
		valor2 = Menu.entrada.nextFloat();
		
		return valor1;
	}
	
	public static float somar(float valor1, float valor2, float resultado){
		
		resultado = valor1 + valor2;
		
		return resultado;
	}
	
	public static float subtrair(float valor1, float valor2, float resultado){
		
		resultado = valor1 - valor2;
		
		return resultado;
	}
	
	public static float multiplicar(float valor1, float valor2, float resultado){
		
		resultado = valor1 * valor2;
		
		return resultado;
	}
	
	public static float dividir(float valor1, float valor2, float resultado){
		
		resultado = valor1 / valor2;
		
		return resultado;
	}
}
