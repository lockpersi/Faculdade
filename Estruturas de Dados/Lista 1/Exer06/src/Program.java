import java.util.*;

public class Program {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Digite o primeiro valor: ");
		float valor1 = entrada.nextFloat();
		
		System.out.print("Digite o segundo valor: ");
		float valor2 = entrada.nextFloat();
		
		if(valor1>valor2){
			System.out.println("O primeiro valor ["+valor1+"] é maior que "
					+ " o segundo["+valor2+"]");
		}
		else if(valor1==valor2){
			System.out.println("Os dois valores são iguais !");
		}
		else{
			System.out.println("O segundo valor ["+valor2+"] é maior que "
					+ "o primeiro ["+valor1+"]");
		}

	}

}
