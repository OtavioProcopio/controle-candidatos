# Processo Seletivo - Estudo de Java

## Descrição
Este programa simula um processo seletivo fictício e foi desenvolvido como um projeto de estudo em Java. Ele explora conceitos básicos e intermediários da linguagem, como estruturas de controle, manipulação de arrays, geração de números aleatórios, e a utilização de métodos para modularizar funcionalidades.

O objetivo principal é reforçar o aprendizado de Java, aplicando conceitos como:
- **Loops e Condições**
- **Manipulação de Arrays**
- **Geração de números aleatórios**
- **Estrutura e organização de métodos**
- **Trabalhar com classes utilitárias como `Random` e `ThreadLocalRandom`**

---

## Funcionalidades
### 1. Simulação do Processo Seletivo
O programa processa uma lista de candidatos para determinar se eles atendem aos critérios de seleção com base no salário pretendido.

### 2. Contato com Candidatos
Simula o contato com os candidatos, realizando até três tentativas de ligação para confirmar a disponibilidade.

### 3. Seleção de Candidatos Baseada em Salário Pretendido
Apenas candidatos cujo salário pretendido seja menor ou igual ao salário-base são selecionados.

### 4. Impressão de Candidatos
Exibe uma lista de candidatos com seus respectivos índices.

### 5. Análise do Salário Pretendido
Avalia a proposta salarial de um candidato em relação ao salário-base para decidir os próximos passos.

---

## Fluxo do Programa
1. Uma lista de candidatos é criada com nomes fictícios.
2. Cada candidato passa pelas seguintes etapas:
   - Tentativa de contato (máximo de 3 tentativas).
   - Caso atenda, o salário pretendido é avaliado.
   - Candidatos compatíveis com o salário-base são selecionados.
3. Após a seleção, a lista de candidatos é impressa com seus índices.

---

## Métodos e suas Funções
### `main(String[] args)`
- Ponto de entrada do programa.
- Realiza a chamada inicial para simular o contato com cada candidato.

### `selecaoCandidatos()`
- Seleciona até 5 candidatos que tenham o salário pretendido menor ou igual ao salário-base.

### `valorPretendido()`
- Gera um valor aleatório de salário pretendido entre R$ 1.800,00 e R$ 2.200,00.

### `imprimirSelecionados()`
- Exibe a lista de candidatos e seus índices na lista.

### `entrandoEmContato(String candidato)`
- Simula até três tentativas de contato com um candidato.
- Se o candidato atender, exibe uma mensagem de sucesso.

### `atender()`
- Retorna aleatoriamente se o candidato atendeu ou não (1 em 3 chances de sucesso).

### `analisarCandidato(Double salarioPretendido)`
- Avalia o salário pretendido e decide se o candidato será contatado ou se é necessário fazer uma contraproposta.

---

## Tecnologias e Recursos Utilizados
- **Linguagem**: Java
- **Classes Utilitárias**:
  - `Random`: Para simular comportamentos aleatórios (ex.: contato com o candidato).
  - `ThreadLocalRandom`: Para gerar números aleatórios em um intervalo específico (ex.: salário pretendido).
- **Conceitos Utilizados**:
  - Estruturas de controle (`if-else`, `while`, `do-while`).
  - Manipulação de arrays.
  - Modularização com métodos estáticos.
  - Geração de números aleatórios.
