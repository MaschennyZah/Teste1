/******************************************************************************
umnúmero informadopelousuário. Você poderá utilizar a biblioteca Scanner para isso. 
O número informadorefere-seaopercentual de aumento do salário desse usuário.
Por exemplo, se ele obteve aumentode7%, ousuário deverá digitar 7,
e assim por diante. Depois, o software deverá informar o valor dosalário,que pode ser definido em um salário mínimo federal
e, em seguida, o valor já reajustadocomos7%a mais incluso.



*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu salario :");
    	float num1 = input.nextFloat();
		
		System.out.println("qual o percentual de aumento no seu salario : ");
		float num2 = input.nextFloat();
		
		
		
		float salario = num1 +  num1*(num2/100);
	    System.out.println(salario);
	    float salaMin = 1212;
	    
	    float eqsalario = (salario/salaMin);
	    System.out.print("Seu salario equivale ");
	    System.out.print(eqsalario );
	    System.out.print (" salario(s) Minimo(s) (R$1212.00).");
	}
		
		
}
		
		

		
	




