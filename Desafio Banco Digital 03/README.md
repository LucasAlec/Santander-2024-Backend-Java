# Banco Digital

Este projeto é uma implementação básica de um banco digital em Java, criado para reforçar o conhecimento em Programação Orientada a Objetos (POO). O sistema simula operações bancárias como depósitos, saques e transferências entre contas.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

### 1. `ContaBancaria`

Representa uma conta bancária com as seguintes funcionalidades:
- **Atributos**:
    - `numeroConta`: O número identificador da conta.
    - `saldo`: O saldo atual da conta.
- **Métodos**:
    - `depositar(double valor)`: Adiciona um valor ao saldo da conta.
    - `sacar(double valor)`: Remove um valor do saldo da conta, se houver saldo suficiente.
    - `getNumeroConta()`: Retorna o número da conta.
    - `getSaldo()`: Retorna o saldo atual da conta.

### 2. `Cliente`

Representa um cliente do banco com as seguintes funcionalidades:
- **Atributos**:
    - `nome`: O nome do cliente.
    - `conta`: A conta bancária associada ao cliente.
- **Métodos**:
    - `getNome()`: Retorna o nome do cliente.
    - `getConta()`: Retorna a conta bancária do cliente.

### 3. `Banco`

Gerencia as contas bancárias e permite operações bancárias:
- **Atributos**:
    - `contas`: Um mapa que armazena as contas bancárias, identificadas pelo número da conta.
- **Métodos**:
    - `criarConta(String numeroConta)`: Cria uma nova conta bancária com o número fornecido.
    - `getConta(String numeroConta)`: Retorna a conta bancária associada ao número fornecido.
    - `transferir(String numeroContaOrigem, String numeroContaDestino, double valor)`: Transfere um valor de uma conta para outra, se possível.

### 4. `Main`

Classe principal que executa o programa e demonstra as funcionalidades básicas do banco:
- Criação de contas.
- Depósito de dinheiro em uma conta.
- Transferência de dinheiro entre contas.
- Impressão dos saldos das contas.

## Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/SEU_USUARIO/banco-digital.git
