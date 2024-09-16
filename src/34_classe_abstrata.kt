interface Selvagem{
     fun atacar(){
         println("O animal está prestes a atacar")
     }
}

interface quatroPatas{
    fun locomocao(){
        println("O animal se locomove em 4 patas")
    }
}
//posso ter multiplas implementações voltadas a interface, mas não as heranças
abstract class mamifero(var nome:String){// Classe abstrata serve somente para herdar a outras classes
    abstract fun habitat()
    abstract fun acordar()
    abstract fun falar()
    abstract fun alimentar()

    fun tempo (){
        println("Tempo de vida do mamífero")
    }

}

class dog (nome:String):mamifero(nome), Selvagem, quatroPatas{
    override fun acordar(){
        println("Cachorro está acordado")
    }

    override fun alimentar() {
        println("Cachorro come ração")
    }
    override fun falar(){
        println("Au Au ")
    }
    override fun habitat(){
        println("Casinha do cachorro")
    }

    override fun atacar() {
        println("O cachorro está atacando")
    }

    override fun locomocao() {
        println("O cachorro se locomove em 4 patas ")
    }

}

fun main() {
    var d:dog = dog("Cachorro")
    d.tempo()
    d.acordar()
    d.falar()
    d.alimentar()
    d.atacar()
    d.locomocao()
}