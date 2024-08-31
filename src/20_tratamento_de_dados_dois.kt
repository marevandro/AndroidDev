import kotlin.math.sqrt

fun main() {
    try {
        var s:String? = null
        println("O tamanho da string é: ${s!!.length}")

        var a = 10/0
        println("O resultado da divisão será: $a")

        var b = -9.0
        var c: Double = sqrt(b)
        if(b<0){
            throw  IllegalAccessException()
        }
        var x = 1
        if(x==1){
            throw Exception()
        }
    }catch (e: NullPointerException){
        println("A variável está vazia.")
    }catch (e: ArithmeticException){
        println("Não existe divisão por zero.")
    }catch (e: IllegalAccessException){
        println("Não existe raiz de número negativo, sendo exclusivo para o conjunto dos números complexos")
    }catch (e: Exception){
        print("Exceção mais geral: ")
        println(e.message)
    }finally {
        println("finally vai sempre ser executado, independente do catch.")
    }
}