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
