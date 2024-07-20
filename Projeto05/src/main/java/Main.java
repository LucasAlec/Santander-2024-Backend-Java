public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();

        // Criar personagens
        jogo.criarPersonagem("Guerreiro", 10);
        jogo.criarPersonagem("Mago", 8);

        // Adicionar itens
        Item espada = new Item("Espada", 1);
        Item poção = new Item("Poção", 5);

        jogo.adicionarItemAoPersonagem("Guerreiro", espada);
        jogo.adicionarItemAoPersonagem("Mago", poção);

        // Mostrar inventário
        Personagem guerreiro = jogo.getPersonagem("Guerreiro");
        Personagem mago = jogo.getPersonagem("Mago");

        guerreiro.mostrarInventario();
        mago.mostrarInventario();

        // Remover itens
        jogo.removerItemDoPersonagem("Mago", "Poção", 2);

        // Mostrar inventário atualizado
        mago.mostrarInventario();
    }

}
