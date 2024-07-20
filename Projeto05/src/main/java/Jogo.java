import java.util.HashMap;
import java.util.Map;
public class Jogo {
    private Map<String, Personagem> personagens;

    public Jogo() {
        personagens = new HashMap<>();
    }

    public void criarPersonagem(String nome, int nivel) {
        if (!personagens.containsKey(nome)) {
            personagens.put(nome, new Personagem(nome, nivel));
        }
    }

    public Personagem getPersonagem(String nome) {
        return personagens.get(nome);
    }

    public void adicionarItemAoPersonagem(String nomePersonagem, Item item) {
        Personagem personagem = personagens.get(nomePersonagem);
        if (personagem != null) {
            personagem.adicionarItem(item);
        }
    }

    public void removerItemDoPersonagem(String nomePersonagem, String nomeItem, int quantidade) {
        Personagem personagem = personagens.get(nomePersonagem);
        if (personagem != null) {
            personagem.removerItem(nomeItem, quantidade);
        }
    }
}
