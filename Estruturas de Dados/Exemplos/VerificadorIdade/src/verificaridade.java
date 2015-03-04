import java.util.*;

public class verificaridade {

	public static void main(String[] args) {
		
		int idade=0;
		int idade2 =0;
		Scanner vr = new Scanner(System.in);
		
		System.out.print("Digite a idade: ");
		idade = vr.nextInt();
		
		vr.close();
		
		if (idade >= 21){
		
			System.out.println("Você está liberado !");
			
		}
		else{
			
			if((idade<21)& (idade>=16)){
			System.out.print("Digite a idade do acompanhante: ");
			idade2 = vr.nextInt();
			vr.close();
				if(idade2>=21){
					System.out.println("Você está liberado");
				}
				else{
					System.out.println("Acesso bloqueado");
				}
			}
			else{
				System.out.println("Acesso bloqueado !");
			}
		}
		}

}

