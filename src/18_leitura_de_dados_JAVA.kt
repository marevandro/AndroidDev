import java.util.Scanner

fun ler_int(){
    var scanner = Scanner(System.`in`)
    println("Digite um número interio: ")
    val num = scanner.nextInt()
    println("Você digitou: ${num}")
}
fun ler_double(){//utilizar virgula
    var scanner = Scanner(System.`in`)
    println("Digite um número Double: ")
    val num = scanner.nextDouble()
    println("Você digitou: ${num}")
}
fun ler_string(){
    var scanner = Scanner(System.`in`)
    println("Digite um nome: ")
    val num = scanner.next()
    println("Você digitou: ${num}")
}
fun ler_float(){ //utilizar virgula
    var scanner = Scanner(System.`in`)
    println("Digite um float: ")
    val num = scanner.nextFloat()
    println("Você digitou: ${num}")
}

fun main() {
    ler_int()
    ler_double()
    ler_string()
    ler_float()
    ler_boolean()
}

fun ler_boolean(){
    var scanner = Scanner(System.`in`)
    println("Digite um valor booleano: ")
    val num = scanner.nextBoolean()
    println("Você digitou: ${num}")
}