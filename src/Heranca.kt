//Private, Public e Protected
private class F(){//Estará disponível somente no arquivo
var teste = "Classe F"
}

open class Eletronico(var marca: String){
    private fun ativarCorrente(){//Está disponível somente na class presente.


    }
    protected fun relogio(){//disponível a classes que são herdadas...
        println("Função relógio")
    }
    fun ligar(){
        println("Está ligado")
    }
    fun desligar(){
        println("Está desligado")
    }
    var modelo:String = "Teste de herança"
    private var F:String = "Testando...."
}
class Computador(marca: String):Eletronico(marca){
    fun instalarSoftware(){
        println("Instalado Software no computador")
        relogio()
    }

    fun varredura(){
        println("Realizando varredura no computador")
    }
}
fun main() {
    var c:Computador = Computador("Dell")
    c.ligar()
    c.desligar()
    c.varredura()
    println(c.modelo)
    c.instalarSoftware()
    var t:F = F()
    println(t.teste)

}