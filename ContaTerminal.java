import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o Numero da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o Saldo: ");
        double saldo = scanner.nextDouble();

        scanner.nextLine();

        System.out.println(
            "Olá " + nomeCliente + ", obrigado por criar uma conta "  + numero + " em nosso banco, sua agência é " + agencia + " e seu saldo " + saldo + "já está disponível para saque."
        );



    }
}
