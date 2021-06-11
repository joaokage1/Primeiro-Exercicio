# Primeiro Exercicio Avaliação técnica – Desenvolvimento | Navita

Dois números inteiros não negativos são chamados de irmãos se eles podem ser 
obtidos uns dos outros, apenas reorganizando os dígitos de suas representações 
decimais. Por exemplo, 123 e 213 são irmãos. 535 e 355 também são irmãos. 
Um conjunto que consiste em um inteiro não negativo N e todos os seus irmãos é 
chamado de família de N. Por exemplo, a família de 553 é composta por três números: 
355, 535 e 553. 
Escreva um algoritmo de contenha uma função com as seguintes entradas e saídas: 

● entrada: N (inteiro) 
● saída: inteiro 

Dado um número inteiro não negativo N, a função deve retornar o maior número na 
família de N. Ela deve retornar -1 se o resultado exceder 100.000.000. 
Exemplo, uma resposta para este exercício pode ter o seguinte formato: 

 > solution int(int N);
 
A inserção de N=213 nesta função deve retornar 321. Para N=553, a função deve 
retornar 553.

## Foi feito o desenvolvimento do método solution usando :
 - Lombok
 - Collections
 - stream API
 - jUnit

![res](https://github.com/joaokage1/image/blob/main/solucao1.PNG)
