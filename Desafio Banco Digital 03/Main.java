public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Criando contas
        banco.criarConta("123");
        banco.criarConta("456");

        // Depositando dinheiro
        ContaBancaria conta1 = banco.getConta("123");
        conta1.depositar(1000);

        // Transferindo dinheiro
        boolean sucesso = banco.transferir("123", "456", 500);

        // Imprimindo saldo
        System.out.println("Saldo Conta 123: " + conta1.getSaldo());
        System.out.println("Saldo Conta 456: " + banco.getConta("456").getSaldo());
        System.out.println("Transferência bem-sucedida: " + sucesso);
    }
}
