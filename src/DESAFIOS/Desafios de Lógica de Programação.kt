package DESAFIOS

import java.util.Locale
import java.util.Scanner

/* Desafios de Lógica de Programação – AndroidDev - para executar basta descomentar as funções*/
fun main() {
    //QuestaoUm()
    //QuestaoDois()
    //QuestaoTres()
    //QuestaoQuatro()
    //QuestaoCinco()
    //QuestaoSeis()
    //QuestaoSete()
    //QuestaoOito()
    //QuestaoNove()
    //QuestaoDez()
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

    var reader = Scanner(System.`in`)
    println("Vamos comparar os números...")

    print("Digite um número para A: ")
    var numeroA = reader.nextInt()

    print("Digite um número para B: ")
    var numeroB = reader.nextInt()

    var numeroC = if(numeroB === numeroA) {numeroB + numeroA} else {numeroB * numeroA}

    print("O valor fica $numeroC !")
}

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/* 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o
seu sucessor. */
fun QuestaoQuatro() {
    var reader = Scanner(System.`in`)
    print("Digite um número: ")
    var numero = reader.nextInt()

    println("O número $numero tem como sucessor ${++numero} e antecessor ${numero - 2}")
}

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/*5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base
para o Salário mínimo R$ 1.293,20).*/
fun QuestaoCinco(){
    var readerFloat = Scanner(System.`in`)
    val salarioBase = 1293.20f
    println("Vamos descobrir quantos salários mínimos você recebe.")

    print("Digite quanto é seu salário: ")
    var salarioUsuario = readerFloat.nextFloat()

    var quantidadeSalariosMinimos = salarioUsuario / salarioBase
    println("Você ganha o equivalente a %.1f salários mínimos.".format(quantidadeSalariosMinimos))
}

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/*6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.*/
fun QuestaoSeis(){
    print("Digite um valor: ")
    val valor = readLine()?.toDoubleOrNull()

    if (valor != null) {
        val valorReajustado = valor * 1.05

        println("O valor com reajuste de 5% é: ${valorReajustado}")
    } else {
        println("Por favor, digite um valor numérico válido.")
    }
}

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/*7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são
VERDADEIRO ou FALSO.*/
fun QuestaoSete(){
    val reader = Scanner(System.`in`)

    println("Digite o primeiro valor booleano (true ou false): ")
    val valor1 = reader.nextBoolean()

    println("Digite o segundo valor booleano (true ou false): ")
    val valor2 = reader.nextBoolean()

    if(valor1 && valor2){
        println("Ambos os valores são VERDADEIROS!")
    }else if(!valor1 && !valor2){
        println("Ambos os valores são FALSOS!")
    }else{
        println("Um dos valores é VERDADEIRO e o outro é FALSO!")
    }
}

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/*8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores
em ordem decrescente.*/
fun QuestaoOito(){
    val reader = Scanner(System.`in`)
    val tamanho = 3
    val numerosDigitados = IntArray(tamanho)

    for(i in 0 until tamanho){
        print("Digite um número: ")
        val numero = reader.nextInt()
        numerosDigitados[i] = numero
    }
    val ordemDescrecente = numerosDigitados.sortedDescending()

    println("Os números digitados em ordem decrescente são [${ordemDescrecente.joinToString(", ")}]")
}

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/*9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o
seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo:
Fórmula do IMC = peso / (altura) ²
Tabela Condições IMC
Abaixo de 18,5 | Abaixo do peso
Entre 18,6 e 24,9 | Peso ideal (parabéns)
Entre 25,0 e 29,9 | Levemente acima do peso
Entre 30,0 e 34,9 | Obesidade grau I
Entre 35,0 e 39,9 | Obesidade grau II (severa)
Maior ou igual a 40 | Obesidade grau III (mórbida)*/
fun QuestaoNove(){
    val reader = Scanner(System.`in`).apply {
        useLocale(Locale.US)
    }


    print("Digite seu peso (em kg, por exemplo 00.0): ")
    val peso = reader.nextDouble()

    print("Digite sua altura (em metros, por exemplo 0.00): ")
    val altura = reader.nextDouble()


    if (altura <= 0) {
        println("Altura inválida. Deve ser maior que zero.")
        return
    }

    // Cálculo do IMC
    val imc = peso / (altura * altura)

    // Determinação da condição do IMC
    val condicao = when {
        imc < 18.5 -> "Abaixo do peso"
        imc in 18.5..24.9 -> "Peso ideal (parabéns)"
        imc in 25.0..29.9 -> "Levemente acima do peso"
        imc in 30.0..34.9 -> "Obesidade grau I"
        imc in 35.0..39.9 -> "Obesidade grau II (severa)"
        imc >= 40 -> "Obesidade grau III (mórbida)"
        else -> "Dados inválidos"
    }

    // Impressão do resultado
    println("Seu IMC é %.2f e você está na condição: $condicao".format(imc))
}

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/*10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média
das notas.*/
fun QuestaoDez(){
    val reader = Scanner(System.`in`).apply {
        useLocale(Locale.US)
    }

    // Leitura das notas do aluno
    print("Digite a primeira nota: ")
    val nota1 = reader.nextDouble()

    print("Digite a segunda nota: ")
    val nota2 = reader.nextDouble()

    print("Digite a terceira nota: ")
    val nota3 = reader.nextDouble()

    // Cálculo da média
    val media = (nota1 + nota2 + nota3) / 3

    // Impressão da média
    println("A média das notas é %.2f".format(media))
}

