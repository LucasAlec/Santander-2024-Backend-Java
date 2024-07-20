import java.util.HashMap;
import java.util.Map;
public class Banco {
    private Map<String, ContaBancaria> contas = new HashMap<>();

    public void criarConta(String numeroConta) {
        if (!contas.containsKey(numeroConta)) {
            contas.put(numeroConta, new ContaBancaria(numeroConta));
        }
    }

    public ContaBancaria getConta(String numeroConta) {
        return contas.get(numeroConta);
    }

    public boolean transferir(String numeroContaOrigem, String numeroContaDestino, double valor) {
        ContaBancaria contaOrigem = contas.get(numeroContaOrigem);
        ContaBancaria contaDestino = contas.get(numeroContaDestino);

        if (contaOrigem != null && contaDestino != null && contaOrigem.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }
}
