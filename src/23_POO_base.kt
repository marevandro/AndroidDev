class Pessoa(val an_nasc: Int, var nome:String){
    var idade = 2024 - an_nasc
    fun saudacao(){
        println("Seja bem-vindo ${this.nome}")
    }

    fun acordar(x: Boolean){
        if(x == true){
            println("O ${this.nome} está acordado")
        }else{
            println("O $nome está dormingo")
        }
    }
}

fun main() {
    var pessoa: Pessoa = Pessoa(1995, "Márcio")
    println(pessoa.an_nasc)
    println("Você tem ${pessoa.idade} anos de idade.")
    pessoa.saudacao()
    pessoa.acordar(false)

}