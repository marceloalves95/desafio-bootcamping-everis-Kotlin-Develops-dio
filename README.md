# Desafio Bootcamping everis Kotlin Develops
Projeto baseado nos desafios propostos pelo Bootcamping everis Kotlin Develops.

|       Desafio                                        |            Tema do Desafio               |  Nível do Desafio |      Respostas      |   
|------------------------------------------------------|------------------------------------------|-------------------|---------------------|
|      <a name="ancora1"></a>[Desafio 1](#ancora1)     |    Introdução a Programação em Kotlin    |      Básico       |     Clique Aqui     |   
|      <a name="ancora2"></a>[Desafio 2](#ancora2)     |    Introdução a Programação em Kotlin    |      Básico       |     Clique Aqui     |   
|      <a name="ancora3"></a>[Desafio 3](#ancora3)     |    Introdução a Programação em Kotlin    |      Básico       |     Clique Aqui     |   
|      <a name="ancora4"></a>[Desafio 4](#ancora4)     |    Solucionando Problemas com Kotlin     |   Intermediário   |     Clique Aqui     |   
|      <a name="ancora5"></a>[Desafio 5](#ancora5)     |    Solucionando Problemas com Kotlin     |   Intermediário   |     Clique Aqui     |   
|      <a name="ancora6"></a>[Desafio 6](#ancora6)     |    Solucionando Problemas com Kotlin     |   Intermediário   |     Clique Aqui     |   
|      <a name="ancora7"></a>[Desafio 7](#ancora7)     |    Solucionando Problemas com Kotlin     |   Intermediário   |     Clique Aqui     |   
|      <a name="ancora8"></a>[Desafio 8](#ancora8)     |    Solucionando Problemas com Kotlin     |   Intermediário   |     Clique Aqui     |   
|      <a name="ancora9"></a>[Desafio 9](#ancora9)     |    Solucionando Problemas com Kotlin     |   Intermediário   |     Clique Aqui     |   
|      <a name="ancora10"></a>[Desafio 10](#ancora10)  |    Solucionando Problemas com Kotlin     |   Intermediário   |     Clique Aqui     |   
|      <a name="ancora11"></a>[Desafio 11](#ancora11)  |    Solucionando Problemas com Kotlin     |   Intermediário   |     Clique Aqui     |   
 
  
# <a id="ancora1"></a>[Desafio 1](#ancora1)
Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de SOMA.
A seguir escreva o valor desta variável.

## Entrada
O arquivo de entrada contém 2 valores inteiros.

## Saída
Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B.

|  Exemplos de Saída  |  Exemplo de Saída  |    
|---------------------|--------------------|
|        10           |    Soma = 40       |    
|        20           |                    |  

# <a id="ancora2"></a>[Desafio 2](#ancora2)
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

## Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

## Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

|  Exemplos de Saída  |  Exemplo de Saída  |    
|---------------------|--------------------|
|          8          |         1          |    
|                     |         3          |
|                     |         5          |
|                     |         7          |

# <a id="ancora3"></a>[Desafio 3](#ancora3)
Você terá o desafio de escrever um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

## Entrada
O arquivo de entrada contém um número inteiro positivo N.

## Saída
Imprima a saída conforme o exemplo fornecido.

|  Exemplos de Saída  |  Exemplo de Saída  |    
|---------------------|--------------------|
|          5          |       1 1 1        |    
|                     |       2 4 8        |
|                     |       3 9 27       |
|                     |       4 16 64      |
|                     |       5 25 125     |

# <a id="ancora4"></a>[Desafio 4](#ancora4)
Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.


## Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

## Saída
Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".

|  Exemplos de Saída  |  Exemplo de Saída  |    
|---------------------|--------------------|
|      3002.00        |      R$ 80.36      |    
|      1701.12        |       Isento       |
|      4520.00        |      R$ 355.60     |

# <a id="ancora5"></a>[Desafio 5](#ancora5)
A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

## Entrada
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

## Saída
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

|  Exemplos de Saída  |  Exemplo de Saída  |    
|---------------------|--------------------|
|       2.00          |    A=12.5664       |    
|      100.64         |    A=31819.3103    |
|      150.00         |    A=70685.7750    |

# <a id="ancora6"></a>[Desafio 6](#ancora6)
## Entrada


## Saída
# <a id="ancora7"></a>[Desafio 7](#ancora7)
## Entrada


## Saída
# <a id="ancora8"></a>[Desafio 8](#ancora8)
## Entrada


## Saída
# <a id="ancora9"></a>[Desafio 9](#ancora9)
## Entrada


## Saída
# <a id="ancora10"></a>[Desafio 10](#ancora10)
## Entrada


## Saída
# <a id="ancora11"></a>[Desafio 11](#ancora11)
## Entrada


## Saída
