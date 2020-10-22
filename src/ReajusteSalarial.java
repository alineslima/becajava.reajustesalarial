import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
		

		Scanner leitorSalario = new Scanner(System.in);
		double salario = Double.parseDouble(leitorSalario.nextLine());
		
		Scanner leitorReajuste = new Scanner(System.in);
		double percentualReajuste = leitorReajuste.nextDouble();
				
		double valorReajuste = salario * (percentualReajuste / 100);
		double salarioReajustado = (valorReajuste + salario);
		
		System.out.println("O valor do reajuste é " + valorReajuste + "," + " portanto, o valor do salário será de " + "R$ " + salarioReajustado);
				
		leitorSalario.close();
		leitorReajuste.close();
		
	}

}
