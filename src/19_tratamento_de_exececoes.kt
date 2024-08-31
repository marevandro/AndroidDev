import java.lang.ArithmeticException
import kotlin.math.sqrt

fun main() {
    val numerador = 10
    val denominador = 2

    try {
        val res = numerador/denominador
        println("Resultado da divisão: $res")
    }catch (e: ArithmeticException){
        println("Erro: Não existe divisão por $denominador")
    }

    val numero = -4.0
    try{
        val res2 = sqrt(numero)
        if(numero < 0){
            throw IllegalAccessException()
        }
        println("Resultado da radiciação: $res2")
    }catch (e: IllegalAccessException){
        println("Não existe raiz real de números negativos")
    }
}