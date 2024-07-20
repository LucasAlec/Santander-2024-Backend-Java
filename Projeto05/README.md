# Sistema de Gerenciamento de Contas de RPG

Este projeto é uma implementação simples de um sistema para gerenciar contas de personagens em um jogo de RPG, desenvolvido em Java. O sistema permite criar personagens, gerenciar itens em inventário e realizar operações básicas como adicionar ou remover itens.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

### 1. `Item`

Representa um item que pode ser adicionado ao inventário de um personagem.

- **Atributos**:
    - `nome`: O nome do item.
    - `quantidade`: A quantidade do item.
- **Métodos**:
    - `getNome()`: Retorna o nome do item.
    - `getQuantidade()`: Retorna a quantidade do item.
    - `adicionarQuantidade(int quantidade)`: Adiciona uma quantidade ao item.
    - `removerQuantidade(int quantidade)`: Remove uma quantidade do item, se houver o suficiente.

### 2. `Personagem`

Representa um personagem no jogo com um inventário de itens.

- **Atributos**:
    - `nome`: O nome do personagem.
    - `nivel`: O nível do personagem.
    - `inventario`: Um mapa de itens no inventário do personagem.
- **Métodos**:
    - `adicionarItem(Item item)`: Adiciona um item ao inventário.
    - `removerItem(String nomeItem, int quantidade)`: Remove uma quantidade de um item do inventário.
    - `mostrarInventario()`: Exibe todos os itens no inventário.

### 3. `Jogo`

Gerencia os personagens e permite operações básicas.

- **Atributos**:
    - `personagens`: Um mapa de personagens no jogo.
- **Métodos**:
    - `criarPersonagem(String nome, int nivel)`: Cria um novo personagem com o nome e nível fornecidos.
    - `getPersonagem(String nome)`: Retorna o personagem com o nome fornecido.
    - `adicionarItemAoPersonagem(String nomePersonagem, Item item)`: Adiciona um item ao inventário do personagem.
    - `removerItemDoPersonagem(String nomePersonagem, String nomeItem, int quantidade)`: Remove uma quantidade de um item do inventário do personagem.

### 4. `Main`

Classe principal que executa o programa e demonstra as funcionalidades básicas do sistema.

- **Funcionalidades**:
    - Criação de personagens.
    - Adição e remoção de itens no inventário dos personagens.
    - Exibição do inventário dos personagens.

## Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/SEU_USUARIO/sistema-rpg.git
