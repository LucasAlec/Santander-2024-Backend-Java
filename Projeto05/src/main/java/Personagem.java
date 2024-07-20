import java.util.HashMap;
import java.util.Map;
public class Personagem {
    private String nome;
    private int nivel;
    private Map<String, Item> inventario;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
        this.inventario = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void adicionarItem(Item item) {
        inventario.put(item.getNome(), item);
    }

    public void removerItem(String nomeItem, int quantidade) {
        Item item = inventario.get(nomeItem);
        if (item != null) {
            item.removerQuantidade(quantidade);
            if (item.getQuantidade() <= 0) {
                inventario.remove(nomeItem);
            }
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventário de " + nome + ":");
        for (Item item : inventario.values()) {
            System.out.println(item.getNome() + ": " + item.getQuantidade());
        }
    }
}
