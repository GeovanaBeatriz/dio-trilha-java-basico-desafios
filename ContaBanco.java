import java.util.*;

public class ContaBanco{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor, digite o seu nome: ");
		String nome = sc.next().toUpperCase();
		System.out.print("Por favor, digite o número da agência: ");
		String agencia = sc.next();
		System.out.print("Por favor, digite o número da sua conta: ");
		int numero = sc.nextInt();
		System.out.print("Por favor, digite o saldo da sua conta: ");
		double saldo = sc.nextDouble();
		
		System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", número " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
		
		sc.close();
	}
}