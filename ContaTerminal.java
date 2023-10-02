import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    BigDecimal saldo;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.printf("Por favor, digite o número da Agência.\n");        
        contaTerminal.numero = sc.nextInt();
        sc.nextLine();

        System.out.printf("Por favor, digite a Agência.\n");        
        contaTerminal.agencia = sc.nextLine();

        System.out.printf("Por favor, digite o nome do Cliente.\n");        
        contaTerminal.nomeCliente = sc.nextLine();

        System.out.printf("Por favor, digite o saldo da Conta.\n");        
        contaTerminal.saldo = sc.nextBigDecimal();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n", contaTerminal.nomeCliente, contaTerminal.agencia, contaTerminal.numero, contaTerminal.saldo);
        
        sc.close();

    }
}


