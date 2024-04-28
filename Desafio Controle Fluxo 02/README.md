# Projeto Controle de Fluxo

O projeto Controle de Fluxo é uma aplicação Java que recebe dois números inteiros como parâmetros via terminal e realiza a contagem e impressão dos números incrementados entre esses dois números. Ele também demonstra o uso de controle de fluxo com estruturas condicionais e exceções personalizadas em Java.

## Estrutura do Projeto

- `Contador.java`: Contém a classe principal que recebe os parâmetros do usuário, chama o método `contar()` e realiza a contagem e impressão dos números incrementados.
- `ParametrosInvalidosException.java`: Define a classe de exceção personalizada `ParametrosInvalidosException`, que é lançada quando o segundo parâmetro é menor ou igual ao primeiro.

## Funcionamento

O programa Contador solicita dois parâmetros ao usuário: o primeiro e o segundo número. Em seguida, ele verifica se o segundo parâmetro é maior que o primeiro. Se for, ele realiza a contagem e impressão dos números incrementados entre esses dois números. 
Caso contrário, lança uma exceção `ParametrosInvalidosException` indicando que o segundo parâmetro deve ser maior que o primeiro.

## Observações
* Certifique-se de inserir números inteiros como parâmetros.

* O segundo parâmetro deve ser maior que o primeiro para que a contagem seja realizada.
