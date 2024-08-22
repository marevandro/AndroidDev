import java.util.Locale
import java.util.Scanner

fun main (){
    //TarefaUm()
    TarefaDois()
}

fun TarefaUm(){
    var reader = Scanner(System.`in`)
    print("Digite sua idade: ")
    var idade = reader.nextInt()

    if(idade >= 18){
        print("Você é maior de idade com $idade anos.")
    }else{
        print("Com $idade anos você é menor de idade.")
    }

}
fun TarefaDois() {
    val reader = Scanner(System.`in`).apply {
        useLocale(Locale.US)
    }

    var loopDePergunta = 1
    var positionArray = 0
    val todasAsNotasDigitadas = DoubleArray(4)

    while (loopDePergunta < 5) {
        print("Digite sua ${loopDePergunta}° nota: ")
        val notaAtual = reader.nextDouble()

        if (notaAtual < 0 || notaAtual > 10) { // Verificação de nota inválida
            println("Nota inexistente, tente novamente...")
        } else {
            todasAsNotasDigitadas[positionArray] = notaAtual
            positionArray++
            loopDePergunta++
        }
    }

    // Imprimir as notas digitadas
    println("Notas digitadas: ${todasAsNotasDigitadas.joinToString(", ")}")

    // Calcular e imprimir a média das notas
    val media = todasAsNotasDigitadas.average()
    println("A média das notas é %.1f".format(media))
    when {
        media > 7 -> println("Aprovado")
        media < 7 && media > 4 -> println("Recuperação!")
        media < 4 -> println("Reprovado")
    }
}