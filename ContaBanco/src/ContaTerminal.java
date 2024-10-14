import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibir mensagens para o usuário
        System.out.println("Bem-vindo ao nosso banco!");

        // Obter os valores digitados no terminal
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("E seu saldo de " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}


/*
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuario

        //obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Mario andrade";
        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco");
        System.out.println("sua agência é " + agencia);
        System.out.println("conta " + numero );
        System.out.println("e seu saldo " + saldo + " ja esta disponivel para saque ");
    }
}*/
