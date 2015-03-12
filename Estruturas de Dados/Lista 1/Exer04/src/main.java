import java.util.Scanner;

public class main {
	
	static float n1=0;
	static float n2=0;
	static float r=0;
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {

	System.out.print("Digite o primeiro valor para soma: ");
	n1 = entrada.nextFloat();
	
	entrada.nextLine();
	
	System.out.print("Digite o segundo valor para soma: ");
	n2 = entrada.nextFloat();
		
	r = Soma.soma(n1, n2, r);
	
	System.out.println("O resultado da soma é:" +r);
	}

}