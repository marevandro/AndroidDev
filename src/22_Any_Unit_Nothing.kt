fun main() {
    a(10.9032903)
    b()
    c()
}

fun a(valor: Any){//pode receber qualquer valor
    println("Imprindo o valor tipo Any: $valor")
}
fun b():Unit{//Não entendi bem
    println("Função sem retorno (Void)")
}
fun c():Nothing{//Talvez em um momento que a função foi planejada mas não implementada
    TODO("Função ainda a ser completada")
}