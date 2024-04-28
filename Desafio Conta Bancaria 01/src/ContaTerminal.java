import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);

        // Número da conta
        System.out.println("Digite o número da sua conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        //Agência
        System.out.println("Digite sua agência: ");
        String agencia = sc.nextLine();

        //Nome do cliente
        System.out.println("Digite seu nome: ");
        String cliente = sc.nextLine();

        //Saldo
        System.out.println("Seu saldo: ");
        double saldo = sc.nextDouble();

        //Menssagem com os dados inseridos
        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " +
                saldo + " já está disponível para saque.");
        // Fechar o scanner
        sc.close();
    }
}
