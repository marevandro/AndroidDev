class Pessoa_(val an_nasc: Int, var nome:String){
    var idade = 2024 - an_nasc
    fun saudacao(){
        println("Seja bem-vindo ${this.nome}")
    }

    fun acordar(x: Boolean){
        if(x == true){
            println("O ${this.nome} está acordado")
        }else{
            println("O $nome está dormindo!")
        }
    }
}

fun main() {
    println("Digite o ano que você nasceu: ")
    var x = readlnOrNull()?.toInt() ?: 0
    println("Digite o seu nome completo: ")
    var y = readln()
    println("Você esta acordado ? (true ou false): ")
    var d = readlnOrNull()?.toBoolean() ?: false

    var pessoa: Pessoa_ = Pessoa_(x, y)
    println(pessoa.an_nasc)
    println("Você tem ${pessoa.idade} anos de idade.")
    pessoa.saudacao()
    pessoa.acordar(false)

}