import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //cria um objeto scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //solicita o número da agencia
        System.out.println(" Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        //solicita o número da conta
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        //solicita o nome do cliente
        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();

        //solicita o saldo
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        //exibe a mensagem final com as informações fornecidas
        System.out.println("Olá " + nomeCliente + ", obrigado pro criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + String.format("%.2f", saldo) + " já está disponível para saque.");

        //fecha o scanner
        scanner.close();
    }
}
