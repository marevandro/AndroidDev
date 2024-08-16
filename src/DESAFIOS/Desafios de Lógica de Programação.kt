package DESAFIOS

/* Desafios de Lógica de Programação – AndroidDev */
fun main() {
    //QuestaoUm()
    QuestaoDois ()
    QuestaoTres()
}
/*1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma
entre A e B e mostre se a soma é menor que C.*/
fun QuestaoUm(){
    println("Digite um número: ")
    var A = readLine()!!.toInt()

    println("Digite outro número: ")
    var B = readLine()!!.toInt()

    println("Digite o último número e vamos comparar tudo: ")
    var C = readLine()!!.toInt()
    print("\n")

    var somaAeB = A + B

    println("A soma do primeiro número e do segundo é: ${somaAeB}")
    if(somaAeB > C) {
        println("Portanto o último número (${C}) é menor que ${somaAeB}.")
    }else{
        println("${C} é maior que ${somaAeB}")
    }

}

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/* 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é
par ou ímpar, positivo ou negativo. */

fun QuestaoDois (){
    println("Digite um número qualquer: ")
    var numberRandom = readLine()?.toIntOrNull()

    if(numberRandom != null){
        if(numberRandom % 2 == 0){
            println("O número $numberRandom é par")
        }else{
            println("O número $numberRandom é ímpar")
        }
        print("\n")
        if(numberRandom < 0){
            println("$numberRandom é um numero negativo.")
        }else{
            println("$numberRandom é um numero positivo.")
        }
    }else{
        println("Por favor, digite um número valido")
    }
}
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/*3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem
iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de
qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor
na tela. */
fun QuestaoTres(){

}

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/* 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o
seu sucessor.

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base
para o Salário mínimo R$ 1.293,20).

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são
VERDADEIRO ou FALSO.

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores
em ordem decrescente.

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o
seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo:
Fórmula do IMC = peso / (altura) ²
Tabela Condições IMC
Abaixo de 18,5 | Abaixo do peso
Entre 18,6 e 24,9 | Peso ideal (parabéns)
Entre 25,0 e 29,9 | Levemente acima do peso
Entre 30,0 e 34,9 | Obesidade grau I
Entre 35,0 e 39,9 | Obesidade grau II (severa)
Maior ou igual a 40 | Obesidade grau III (mórbida)



* */